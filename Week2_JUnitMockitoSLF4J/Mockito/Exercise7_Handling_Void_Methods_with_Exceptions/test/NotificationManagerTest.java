package Exercise7_Handling_Void_Methods_with_Exceptions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

import static org.mockito.Mockito.doThrow;

public class NotificationManagerTest {

    @Test
    public void testVoidMethod() {
        NotificationService mockService = Mockito.mock(NotificationService.class);

        doThrow(new RuntimeException("Email service down")).when(mockService).sendNotification("Hello");

        NotificationManager manager = new NotificationManager(mockService);

        String result = manager.notifyUser("Hello");
        Assertions.assertEquals("Failed: Email service down", result);
    }
}