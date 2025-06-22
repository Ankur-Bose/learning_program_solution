import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Notifier notifier = new EmailNotifier(); // Default: Email always enabled

        System.out.println("=== Notification Channel Selection ===");
        System.out.println("Email Notifier is enabled by default.");
        System.out.print("Enable SMS Notifier? (yes/no): ");
        String smsChoice = scanner.nextLine().trim().toLowerCase();

        System.out.print("Enable Slack Notifier? (yes/no): ");
        String slackChoice = scanner.nextLine().trim().toLowerCase();

        if (smsChoice.equals("yes")) {
            notifier = new SMSNotifierDecorator(notifier);
        }

        if (slackChoice.equals("yes")) {
            notifier = new SlackNotifierDecorator(notifier);
        }

        System.out.print("\nEnter the message to send: ");
        String message = scanner.nextLine();

        System.out.println("\n== Sending Notification ==");
        notifier.send(message);

        scanner.close();
    }
}
