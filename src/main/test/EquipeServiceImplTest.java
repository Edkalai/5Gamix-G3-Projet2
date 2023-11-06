import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import tn.esprit.spring.kaddem.entities.Contrat;
import tn.esprit.spring.kaddem.entities.Equipe;
import tn.esprit.spring.kaddem.entities.Niveau;
import tn.esprit.spring.kaddem.repositories.EquipeRepository;
import tn.esprit.spring.kaddem.services.EquipeServiceImpl;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class EquipeServiceImplTest {

    @InjectMocks
    private EquipeServiceImpl equipeService;

    @Mock
    private EquipeRepository equipeRepository;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddEquipe() {
        Equipe equipe = new Equipe();

        when(equipeRepository.save(eq(equipe))).thenReturn(equipe);

        Equipe result = equipeService.addEquipe(equipe);

        verify(equipeRepository, times(1)).save(eq(equipe));
        assertEquals(equipe, result);
    }

    @Test
    public void testDeleteEquipe() {
        Integer equipeId = 1;
        Equipe equipe = new Equipe();
        equipe.setId(equipeId);

        when(equipeRepository.findById(eq(equipeId))).thenReturn(Optional.of(equipe));

        equipeService.deleteEquipe(equipeId);

        verify(equipeRepository, times(1)).delete(eq(equipe));
    }

    @Test
    public void testRetrieveEquipe() {
        Integer equipeId = 1;
        Equipe equipe = new Equipe();
        equipe.setId(equipeId);

        when(equipeRepository.findById(eq(equipeId))).thenReturn(Optional.of(equipe));

        Equipe result = equipeService.retrieveEquipe(equipeId);

        verify(equipeRepository, times(1)).findById(eq(equipeId));
        assertEquals(equipe, result);
    }

    @Test
    public void testUpdateEquipe() {
        Equipe equipe = new Equipe();

        when(equipeRepository.save(eq(equipe))).thenReturn(equipe);

        Equipe result = equipeService.updateEquipe(equipe);

        verify(equipeRepository, times(1)).save(eq(equipe));
        assertEquals(equipe, result);
    }

   
}
