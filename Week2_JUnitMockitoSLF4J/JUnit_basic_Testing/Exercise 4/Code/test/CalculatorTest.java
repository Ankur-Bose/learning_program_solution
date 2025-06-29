package exercise2;

import exercise2.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    @Before
    public void setUp(){
        System.out.println("Setting up resources before each test");
    }

    @After
    public void tearDown(){
        System.out.println("Cleaning up after each test ...");
    }

    @Test
    public void subtractTwoNumbersTest() {
        // Arrange
        int a = 17;
        int b = 9;
        int expected = 8;

        // Act
        int actual = Calculator.subtractTwoNumbers(a, b);

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiplyTwoNumbersTest() {
        // Arrange
        int a = 13;
        int b = 12;
        int expected = 156;

        // Act
        int actual = Calculator.multiplyTwoNumbers(a, b);

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void divideTwoNumbersTest() {
        // Arrange
        double a = 15.0;
        double b = 5.0;
        double expected = 3.0;

        // Act
        double actual = (double)Calculator.divideTwoNumbers((int)a, (int)b);

        // Assert
        Assert.assertEquals(expected, actual, 0.0001); // delta for double
    }

    @Test
    public void addArrayNumbersTest() {
        // Arrange
        int[] numbers = {5, 6, 10, 67, 72};
        int expected = 160;

        // Act
        int actual = Calculator.addArrayNumbers(numbers);

        // Assert
        Assert.assertEquals(expected, actual);
    }
}