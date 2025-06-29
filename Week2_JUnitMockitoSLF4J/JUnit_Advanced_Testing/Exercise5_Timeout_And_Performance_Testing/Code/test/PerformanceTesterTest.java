package Exercise5_Timeout_And_Performance_Testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class PerformanceTesterTest {

    PerformanceTester tester = new PerformanceTester();
    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    public void testTimeout(){
        tester.performTask();
    }
}