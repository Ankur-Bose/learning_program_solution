package Exercise1_Parameterized_Test;

import Exercise1_Parameterized_Test.EvenChecker;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class EvenCheckerTest {
    private final EvenChecker evenChecker = new EvenChecker();

    @ParameterizedTest
    @ValueSource(ints = {2,4,6,100,0})
    public void isEvenWithEvenNumbers(int number){
        Assertions.assertTrue(EvenChecker.isEven(number), number+" is even");
    }

    @ParameterizedTest
    @ValueSource(ints = {1,3,5,7,99})
    public void isEvenWithoutEvenNumbers(int number){
        Assertions.assertTrue(EvenChecker.isEven(number), number+" is odd");
    }
}