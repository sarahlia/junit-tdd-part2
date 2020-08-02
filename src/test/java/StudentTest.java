import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    Student sarah;

    @Before
    public void setup() {
        sarah = new Student(1L, "sarah");
    }

    @Test
    public void testIfIdWorks() {
        assertEquals(1L, sarah.getId());
    }

    @Test
    public void testIfNameWorks() {
        assertEquals("sarah", sarah.getName() );

    }
}
