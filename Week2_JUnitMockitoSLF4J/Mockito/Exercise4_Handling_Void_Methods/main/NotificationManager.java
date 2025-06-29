package Exercise4_Handling_Void_Methods;

public class NotificationManager {
    private NotificationService service;

    public NotificationManager(NotificationService service) {
        this.service = service;
    }

    public void notifyUser(String message) {
        service.sendNotification(message);
    }
}
