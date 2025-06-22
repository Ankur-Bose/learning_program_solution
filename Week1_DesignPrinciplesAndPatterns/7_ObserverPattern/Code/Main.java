import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StockMarket stockMarket = new StockMarket();

        Observer mobileObserver = null;
        Observer webObserver = null;
        String stockName = "";

        boolean running = true;

        while (running) {
            System.out.println("\n========= Stock Market Monitoring System =========");
            System.out.println("1. Register Observers");
            System.out.println("2. Deregister Observer");
            System.out.println("3. Notify Observers");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("Enter stock name to observe: ");
                    stockName = scanner.nextLine().trim();

                    if (stockName.isEmpty()) {
                        System.out.println("Stock name cannot be empty.");
                        break;
                    }

                    mobileObserver = new MobileApp(stockName);
                    webObserver = new WebApp(stockName);

                    stockMarket.register(mobileObserver);
                    stockMarket.register(webObserver);

                    System.out.println("Observers registered for stock: " + stockName);
                    break;

                case "2":
                    if (mobileObserver == null && webObserver == null) {
                        System.out.println("No observers currently registered.");
                        break;
                    }

                    System.out.println("Choose observer to remove:");
                    System.out.println("a. MobileApp");
                    System.out.println("b. WebApp");
                    System.out.print("Enter your choice (a/b): ");
                    String removeChoice = scanner.nextLine().trim().toLowerCase();

                    switch (removeChoice) {
                        case "a":
                            if (mobileObserver != null) {
                                stockMarket.deregister(mobileObserver);
                                mobileObserver = null;
                                System.out.println("MobileApp observer removed.");
                            } else {
                                System.out.println("MobileApp is already removed.");
                            }
                            break;

                        case "b":
                            if (webObserver != null) {
                                stockMarket.deregister(webObserver);
                                webObserver = null;
                                System.out.println("WebApp observer removed.");
                            } else {
                                System.out.println("WebApp is already removed.");
                            }
                            break;

                        default:
                            System.out.println("Invalid option. Please enter 'a' or 'b'.");
                    }
                    break;

                case "3":
                    if (stockName.isEmpty()) {
                        System.out.println("Please register observers before notifying.");
                        break;
                    }

                    if (mobileObserver == null && webObserver == null) {
                        System.out.println("No active observers to notify.");
                        break;
                    }

                    System.out.print("Enter your name: ");
                    String userName = scanner.nextLine().trim();

                    if (userName.isEmpty()) {
                        System.out.println("Name cannot be empty.");
                        break;
                    }

                    System.out.println("\n--- Notifying Registered Observers ---");
                    stockMarket.notifyStock(userName);
                    break;

                case "4":
                    running = false;
                    System.out.println("Exiting the application. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }
        }

        scanner.close();
    }
}
