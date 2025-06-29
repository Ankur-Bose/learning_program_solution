package Exercise4_Exception_Testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionThrowerTest {

    @Test
    public void testThrowException() {
        ExceptionThrower thrower = new ExceptionThrower();

        assertThrows(IllegalArgumentException.class, thrower::throwException);
    }
}