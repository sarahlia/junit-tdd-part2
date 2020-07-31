import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyTest {

    private List<String> beatles;
    private List<String> names;

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

    @Before
    public void setup() {
        this.names = new ArrayList<>();
        this.names.add("Sarah");
        this.names.add("Kevin");

    }

    //verify that the names list was initialized
    @Test
    public void testIfNamesWasInitialized() {
        assertNull(beatles);
        assertNotNull(names);
    }

    @Test
    public void testIfNamesSizeIsCorrect() {
        assertEquals(2, this.names.size());
        assertNotEquals(1, this.names.size());

        this.names.add("Michael");
        assertEquals(3, this.names.size());
        assertNotEquals(4, this.names.size());
    }

    @Test
    public void testIfNamesIndexMatch() {
        assertSame("Sarah", this.names.get(0));
        assertNotSame("Joanne", this.names.get(1));
    }

    //Junit Warmup exercises
    @Test
    public void testIfListsAreSame() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();
        languages.add("english");
        moreLanguages.add("spanish");
        moreLanguages.add("portuguese");

        assertNotSame(languages, moreLanguages);
    }

    @Test
    public void testIfArraysAreEqual() {

        int[] numbers = {1, 2, 4};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 4;

        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void testIfStatementsAreTrueOrFalse() {
        String language = "PHP";
        boolean languageContainsH = language.contains("H");
        boolean languageContainsJ = language.contains("J");

        assertTrue("language contains 'H'", languageContainsH);
        assertFalse("language contains 'J'", languageContainsJ);
    }


}

