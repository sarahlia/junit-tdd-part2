import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {

    Cohort aCohort;
    Student emi;
    Student jack;

    @Before
    public void setup() {
        aCohort = new Cohort();
        emi = new Student(1L, "emi");
        jack = new Student(2L, "jack");
        aCohort.addStudent(emi);
        aCohort.addStudent(jack);
    }

    @Test
    public void testIfAddStudentWorks() {
//        newCohort.getStudents().get(0).getId();// first from the students List
        assertEquals(1L, aCohort.getStudents().get(0).getId());
//        newCohort.getStudents().get(1).getId()// second  from the students List
        assertEquals(2L, aCohort.getStudents().get(1).getId());
        assertNotEquals("michael", aCohort.getStudents().get(1).getName()); //should be the name for jack
    }


    @Test
    public void testGetStudentsMethod() {
//        aCohort.getStudents().get(0).getName();
        assertEquals("emi", aCohort.getStudents().get(0).getName());
        assertEquals(2, aCohort.getStudents().size());
        assertNotEquals(4L, aCohort.getStudents().get(1).getId()); //should be the id for jack
    }

    @Test
    public void testGetCohortAverageMethod() {
        emi.addGrade(75);
        emi.addGrade(90); //average s/b 82.5

        jack.addGrade(100);
        jack.addGrade(92); //average s/b 96.0

//        aCohort.getCohortAverage(); //should be 89.25
        assertEquals(89.25, aCohort.getCohortAverage(), 0.1 );
        assertNotEquals(90.5, aCohort.getCohortAverage(), 0.1 );
    }

}
