import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class MemoireTest {

    @Test
    public void testTailleMemoire() {
        Chapitre c1 = new Chapitre("Introduction", new String[]{"Page1", "Page2"});
        Chapitre c2 = new Chapitre("Patrons", new String[]{"Page1", "Page2", "Page3"});
        Chapitre c3 = new Chapitre("Anti-Patrons", new String[]{"Page1", "Page2"});
        Chapitre c4 = new Chapitre("Conclusion", new String[]{"Page1"});
        
        Memoire memoireAlice = new Memoire("Patrons et Anti-Patrons", Arrays.asList(c1, c2, c3, c4));
        
        assertEquals(7, memoireAlice.taille()); 
    }
}
