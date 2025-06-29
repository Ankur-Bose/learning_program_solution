package Exercise5_Mocking_And_Stubbing_with_Multiple_Returns;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class DataProcessorTest {

    @Test
    public void testMultipleData(){
        ExternalApiService apiService = Mockito.mock(ExternalApiService.class);
        when(apiService.getData()).thenReturn("FirstCall", "SecondCall");

        DataProcessor dataProcessor = new DataProcessor(apiService);

        String result = dataProcessor.processDataTwice();

        Assertions.assertEquals("FirstCall & SecondCall", result);
    }
}
