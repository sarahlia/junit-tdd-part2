import org.junit.Test;
import static org.junit.Assert.*;

public class CryptTest {

    @Test
    public void testIfVersionIsInitialized() {
        assertEquals(0.0, Crypt.VERSION, 0);
        Crypt.VERSION = 1.2;
        assertNotEquals(2, Crypt.VERSION, 0);
    }

    @Test
    public void testIfHashPasswordWorks() {
        assertEquals("m4r49d3r", Crypt.hashPassword("marauder"));
        assertNotEquals("br1nkl30", Crypt.hashPassword("brinkley"));
    }

    @Test
    public void testIfCheckPasswordWorks() {
        assertTrue("sarah hashed is s4r4h", Crypt.checkPassword("sarah", "s4r4h"));
        assertFalse("beula hashed is b29l4", Crypt.checkPassword("beula", "b29l4"));
    }

}
