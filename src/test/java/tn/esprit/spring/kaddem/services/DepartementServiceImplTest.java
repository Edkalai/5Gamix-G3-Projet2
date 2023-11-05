package tn.esprit.spring.kaddem.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.kaddem.KaddemApplication;
import tn.esprit.spring.kaddem.entities.Departement;
import tn.esprit.spring.kaddem.repositories.DepartementRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


@SpringBootTest(classes = KaddemApplication.class)
@ExtendWith(MockitoExtension.class)
class DepartementServiceImplTest {
//    @InjectMocks
//    private DepartementServiceImpl  departementService;
//    @Mock
//    private DepartementRepository departementRepository;
//
//    @Test
//    public void testRetrieveAllDepartements() {
//        // Arrange
//        Departement departement1 = new Departement(1, "IT");
//        Departement departement2 = new Departement(2, "HR");
//        List<Departement> departements = Arrays.asList(departement1, departement2);
//
//        when(departementRepository.findAll()).thenReturn(departements);
//
//        // Act
//        List<Departement> result = departementService.retrieveAllDepartements();
//
//        // Assert
//        assertEquals(2, result.size());
//        assertEquals("IT", result.get(0).getNomDepart());
//        assertEquals("HR", result.get(1).getNomDepart());
//    }
//    @Test
//    public void testAddDepartement() {
//        // Arrange
//        Departement departement = new Departement("IT");
//
//        when(departementRepository.save(departement)).thenReturn(departement);
//
//        // Act
//        Departement result = departementService.addDepartement(departement);
//
//        // Assert
//        assertEquals("IT", result.getNomDepart());
//    }
//    @Test
//    public void testUpdateDepartement() {
//        // Arrange
//        Departement departement = new Departement(1, "IT");
//
//        when(departementRepository.save(departement)).thenReturn(departement);
//
//        // Act
//        Departement result = departementService.updateDepartement(departement);
//
//        // Assert
//        assertEquals("IT", result.getNomDepart());
//    }
//    @Test
//    public void testRetrieveDepartement() {
//        // Arrange
//        Departement departement = new Departement(1, "IT");
//
//        when(departementRepository.findById(1)).thenReturn(Optional.of(departement));
//
//        // Act
//        Departement result = departementService.retrieveDepartement(1);
//
//        // Assert
//        assertEquals("IT", result.getNomDepart());
//    }
//    @Test
//    public void testDeleteDepartement() {
//        // Arrange
//        Departement departement = new Departement(1, "IT");
//
//        when(departementRepository.findById(1)).thenReturn(Optional.of(departement));
//
//        // Act
//        departementService.deleteDepartement(1);
//
//        // Assert
//        verify(departementRepository, times(1)).delete(departement);
//    }

}