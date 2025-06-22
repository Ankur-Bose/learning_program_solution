import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n======= Inventory Menu =======");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. View Inventory");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Product Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Quantity: ");
                    int qty = scanner.nextInt();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    manager.addProduct(new Product(id, name, qty, price));
                    break;

                case 2:
                    System.out.print("Enter Product Name to Update: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Enter New Quantity: ");
                    int newQty = scanner.nextInt();
                    System.out.print("Enter New Price: ");
                    double newPrice = scanner.nextDouble();
                    manager.updateProduct(updateName, newQty, newPrice);
                    break;

                case 3:
                    System.out.print("Enter Product Name to Delete: ");
                    String deleteName = scanner.nextLine();
                    manager.deleteProduct(deleteName);
                    break;

                case 4:
                    System.out.println("\nCurrent Inventory:");
                    manager.viewInventory();
                    break;

                case 5:
                    System.out.println("Exiting Inventory System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}