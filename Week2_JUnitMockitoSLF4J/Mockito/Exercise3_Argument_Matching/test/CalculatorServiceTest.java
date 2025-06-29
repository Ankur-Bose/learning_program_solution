package Exercise3_Argument_Matching;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

public class CalculatorServiceTest {
    @Test
    public void testArgumentMatching() {
        CalculatorService calc = Mockito.mock(CalculatorService.class);

        CalculatorServiceUser user =  new CalculatorServiceUser(calc);
        user.processAddition(10,20);

        verify(calc).add(eq(10), eq(20));
        verify(calc).add(anyInt(), anyInt());
    }
}