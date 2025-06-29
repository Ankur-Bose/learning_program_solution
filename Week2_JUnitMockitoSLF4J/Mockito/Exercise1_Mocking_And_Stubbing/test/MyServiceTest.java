package Exercise1_Mocking_And_Stubbing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class MyServiceTest {

    @Test
    public void testEternalApi(){
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");
        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        Assertions.assertEquals("Mock Data", result);
    }
}
