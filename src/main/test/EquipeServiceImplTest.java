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

    @Test
    public void testEvoluerEquipes() {
        List<Equipe> equipes = new ArrayList<>();

        Equipe equipe1 = new Equipe();
        equipe1.setNiveau(Niveau.JUNIOR);
        Equipe equipe2 = new Equipe();
        equipe2.setNiveau(Niveau.SENIOR);

        Set<Contrat> contrats1 = new HashSet<>();
        Set<Contrat> contrats2 = new HashSet<>();

        // Add sample Contrats
        Contrat contrat1 = new Contrat();
        contrat1.setArchive(false);
        contrat1.setDateFinContrat(new Date());
        contrats1.add(contrat1);

        equipe1.setEtudiants(new HashSet<>());
        equipe2.setEtudiants(new HashSet<>());

        equipe1.getEtudiants().add(new Etudiant(contrats1));
        equipe2.getEtudiants().add(new Etudiant(contrats2));

        equipes.add(equipe1);
        equipes.add(equipe2);

        when(equipeRepository.findAll()).thenReturn(equipes);
        when(equipeRepository.save(any())).thenReturn(null);

        equipeService.evoluerEquipes();

        verify(equipeRepository, times(2)).save(any());
    }
}
