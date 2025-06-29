package Exercise5_Timeout_And_Performance_Testing;

import java.io.IOException;

public class PerformanceTester {
    public void performTask(){
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
