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

    @Test
    public void testIfGradesAreRight() {
        assertEquals(0, sarah.getGrades().size());
    }

    @Test
    public void testAddGradeMethod() {
        sarah.addGrade(90);
        assertSame(90, sarah.getGrades().get(0));
        assertNotSame(0, sarah.getGrades().get(0));
    }

    @Test
    public void testGetGradeAverageMethod() {
        assertEquals(0.0, sarah.getGradeAverage(), 0);

        sarah.addGrade(100);
        sarah.addGrade(80);
        assertEquals(90.0, sarah.getGradeAverage(), 0.1);

        sarah.addGrade(100);
        assertEquals(93.3, sarah.getGradeAverage(), 0.1);
    }
}
