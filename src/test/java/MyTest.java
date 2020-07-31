import org.junit.Test;
import static org.junit.Assert.*;

public class MyTest {

    @Test
    public void testIfNameEquals() {
        String school = "unc";
        assertEquals("unc", school);
        assertNotEquals("duke", school);
    }

    @Test
    public void testIfChangeIsCorrect() {

        Double price = 10.0;
        Double discount = 4.0;


        assertEquals(6, price - discount, 0);
        assertEquals(5.5, price - discount, 0.5);
        assertEquals(6.5, price - discount, 0.5);
        assertNotEquals(5, price - discount, 0.5);
    }

    @Test
    public void testIfObjectsAreSame() {

        Object sheep = new Object();
        Object clonedSheep = sheep;
        Object dog = new Object();


        assertSame(sheep, clonedSheep);
        assertNotSame(sheep, dog);
    }

    @Test
    public void testIfArrayEquals() {

        char[] expected = {'D', 'e', 'c', 'e', 'm', 'b', 'e', 'r'};
        char[] actual = "December".toCharArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testIfBooleanWorks() {

        boolean skyIsBlue = true;
        boolean fourIsGreater = 4 > 3;
        boolean fiveIsLess = 5 < 2;

        assertTrue(skyIsBlue);
        assertTrue("four is greater than three", fourIsGreater);
        assertFalse("five is less than two", fiveIsLess);
    }

}

