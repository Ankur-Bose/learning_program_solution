package Exercise4_Handling_Void_Methods;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

public class NotificationManagerTest {
    @Test
    public void testNotificationManager() {
        NotificationService service = Mockito.mock(NotificationService.class);
        NotificationManager notificationManager = new NotificationManager(service);

        doNothing().when(service).sendNotification("Checking for notification");

        notificationManager.notifyUser("Checking for notification");

        verify(service).sendNotification("Checking for notification");
    }
}
