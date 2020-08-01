import org.junit.Test;
import static org.junit.Assert.*;


public class MyMathTest {

    @Test
    public void testIfSumWorks() {
        assertEquals(5, MyMath.sum(2, 3));
        assertEquals(7.5, MyMath.sum(5.0, 2.5), 0);
        assertNotEquals(6, MyMath.sum(2.5, 3), 0.4);
    }

    @Test
    public void testIfSubtractWorks() {
        assertEquals(2, MyMath.subtract(10, 8));
        assertNotEquals(1, MyMath.subtract(6, 4));
    }

}
