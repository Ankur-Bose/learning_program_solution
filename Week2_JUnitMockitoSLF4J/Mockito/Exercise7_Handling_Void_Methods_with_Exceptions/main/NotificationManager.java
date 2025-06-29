package Exercise7_Handling_Void_Methods_with_Exceptions;

public class NotificationManager {
    private NotificationService service;

    public NotificationManager(NotificationService service) {
        this.service = service;
    }

    public String notifyUser(String message) {
        try {
            service.sendNotification(message);
            return "Sent";
        } catch (RuntimeException e) {
            return "Failed: " + e.getMessage();
        }
    }
}
