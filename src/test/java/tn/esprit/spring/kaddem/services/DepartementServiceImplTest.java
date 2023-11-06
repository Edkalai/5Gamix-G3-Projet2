package tn.esprit.spring.kaddem.services;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import tn.esprit.spring.kaddem.entities.Departement;
import tn.esprit.spring.kaddem.repositories.DepartementRepository;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class DepartementServiceImplTest {

    @Mock
    private DepartementRepository departementRepository;
    private AutoCloseable closeable;
    @Mock
    List<Departement> departements;
    @InjectMocks
    private DepartementServiceImpl departementService;

    @BeforeEach
    void initService() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    void closeService() throws Exception {
        closeable.close();
    }


    @Test
    void retrieveAllDepartements() {
        when(departementRepository.findAll()).thenReturn(departements);
        List<Departement> response=  departementService.retrieveAllDepartements();
        assertEquals(response,departements);
    }

    @Test
    void addDepartement() {
        Departement departement=new Departement("informatique");
        when(departementRepository.save(Mockito.any(Departement.class))).thenReturn(departement);
        Departement createdDepartement=departementService.addDepartement(departement);
        Assertions.assertThat(createdDepartement).isNotNull();
    }

    @Test
    void updateDepartement() {
        Departement departement=new Departement("informatique");
        when(departementRepository.save(Mockito.any(Departement.class))).thenReturn(departement);
        Departement createdDepartement=departementService.addDepartement(departement);
        Assertions.assertThat(createdDepartement).isNotNull();
    }

    @Test
    void retrieveDepartement() {
        Departement departement=new Departement("informatique");
        when(departementRepository.findById(1)).thenReturn(Optional.of(departement));
        Departement response=departementService.retrieveDepartement(1);
        assertEquals(response,departement);
    }

    @Test
    void deleteDepartement() {
        Departement departement=new Departement("informatique");
        when(departementRepository.findById(1)).thenReturn(Optional.of(departement));
       assertAll(()-> departementService.deleteDepartement(1) );
    }
}