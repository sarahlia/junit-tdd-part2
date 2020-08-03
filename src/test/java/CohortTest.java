import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {

    @Test
    public void testIfAddStudentWorks() {
        Cohort aCohort = new Cohort();
        Student emi = new Student(1L, "emi");
        aCohort.addStudent(emi);
//        newCohort.getStudents().get(0).getId(); first from the students List
        assertEquals(1L, aCohort.getStudents().get(0).getId());
        Student jack = new Student(2L, "jack");
        aCohort.addStudent(jack);
//        newCohort.getStudents().get(1).getId(); second  from the students List
        assertEquals(2L, aCohort.getStudents().get(1).getId());
        assertNotEquals("michael", aCohort.getStudents().get(1).getName()); //should be the name for jack
    }


    @Test
    public void testGetStudentsMethod() {
        Cohort aCohort = new Cohort();
//        aCohort.getStudents().size();
        assertEquals(0, aCohort.getStudents().size());

        Student emi = new Student(1L, "emi");
        Student jack = new Student(2L, "jack");
        aCohort.addStudent(emi);
        aCohort.addStudent(jack);
//        aCohort.getStudents().get(0).getName();
        assertEquals("emi", aCohort.getStudents().get(0).getName());
        assertEquals(2, aCohort.getStudents().size());
        assertNotEquals(4L, aCohort.getStudents().get(1).getId()); //should be the id for jack
    }

    @Test
    public void testGetCohortAverageMethod() {
        Cohort aCohort = new Cohort();

        Student emi = new Student(1L, "emi");
        emi.addGrade(75);
        emi.addGrade(90); //average s/b 82.5

        Student jack = new Student(2L, "jack");
        jack.addGrade(100);
        jack.addGrade(92); //average s/b 96.0

        aCohort.addStudent(emi);
        aCohort.addStudent(jack);
//        aCohort.getCohortAverage(); //should be 89.25
        assertEquals(89.25, aCohort.getCohortAverage(), 0.1 );
        assertNotEquals(90.5, aCohort.getCohortAverage(), 0.1 );
    }


}
