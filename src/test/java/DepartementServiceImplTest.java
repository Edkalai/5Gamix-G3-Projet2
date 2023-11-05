import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import tn.esprit.spring.kaddem.entities.Departement;
import tn.esprit.spring.kaddem.repositories.DepartementRepository;
import tn.esprit.spring.kaddem.services.DepartementServiceImpl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class DepartementServiceImplTest {

    @InjectMocks
    private DepartementServiceImpl departementService;

    @Mock
    private DepartementRepository departementRepository;

    @Test
    public void testRetrieveAllDepartements() {
        // Mocking the repository behavior
        when(departementRepository.findAll()).thenReturn(Arrays.asList(new Departement(), new Departement()));

        // Call the service method
        List<Departement> result = departementService.retrieveAllDepartements();

        // Verify the result
        assertEquals(2, result.size());
    }

    @Test
    public void testAddDepartement() {
        // Mocking the repository behavior
        when(departementRepository.save(any(Departement.class))).thenReturn(new Departement());

        // Call the service method
        Departement result = departementService.addDepartement(new Departement());

        // Verify the result
        assertNotNull(result);
    }

    @Test
    public void testUpdateDepartement() {
        // Mocking the repository behavior
        when(departementRepository.save(any(Departement.class))).thenReturn(new Departement());

        // Call the service method
        Departement result = departementService.updateDepartement(new Departement());

        // Verify the result
        assertNotNull(result);
    }

    @Test
    public void testRetrieveDepartement() {
        // Mocking the repository behavior
        when(departementRepository.findById(any(Integer.class))).thenReturn(Optional.of(new Departement()));

        // Call the service method
        Departement result = departementService.retrieveDepartement(1);

        // Verify the result
        assertNotNull(result);
    }

    @Test
    public void testDeleteDepartement() {
        // Mocking the repository behavior
        Departement mockDepartement = new Departement();
        when(departementRepository.findById(any(Integer.class))).thenReturn(Optional.of(mockDepartement));

        // Call the service method
        departementService.deleteDepartement(1);

        // Verify that the delete method was called with the correct argument
        verify(departementRepository).delete(mockDepartement);
    }
}
