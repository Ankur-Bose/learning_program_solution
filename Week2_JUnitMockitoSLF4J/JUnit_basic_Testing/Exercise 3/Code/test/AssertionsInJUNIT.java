package exercise3;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AssertionsInJUNIT {

    @Test
    public void testAssertions()
    {
        Assertions.assertEquals(5,2+3);     //Equals

        Assertions.assertTrue(5>3);               // True

        Assertions.assertFalse(5<3);              // False

        Assertions.assertNull(null);                // Null

        Assertions.assertNotNull("JUnit is great");     //Not Null
    }
}