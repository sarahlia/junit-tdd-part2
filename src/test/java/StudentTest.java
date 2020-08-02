import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testIfIdWorks() {
        Student sarah = new Student(1L, "sarah");
        assertEquals(1L, sarah.getId());
    }

    @Test
    public void testIfNameWorks() {
        Student sarah = new Student(1L, "sarah");
        assertEquals("sarah", sarah.getName() );

    }
}
