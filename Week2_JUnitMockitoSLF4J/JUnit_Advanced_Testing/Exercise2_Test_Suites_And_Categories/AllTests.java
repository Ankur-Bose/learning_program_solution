package Exercise2_Test_Suites_And_Categories;

import Exercise1_Parameterized_Test.EvenCheckerTest;
import Exercise3_Test_Execution_Order.OrderedTests;
import Exercise4_Exception_Testing.ExceptionThrowerTest;
import Exercise5_Timeout_And_Performance_Testing.PerformanceTesterTest;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        EvenCheckerTest.class,
        OrderedTests.class,
        ExceptionThrowerTest.class,
        PerformanceTesterTest.class
})
public class AllTests {

}