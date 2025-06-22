import java.util.*;

class Product {
    int productId;
    String productName;
    String category;

    Product(int id, String name, String cat) {
        this.productId = id;
        this.productName = name;
        this.category = cat;
    }

    // Linear search [searched using productID]
    public static int linearSearch(Product[] list, int target) {
        for (int id = 0; id < list.length; id++) {
            if (list[id].productId == target) {
                return id;
            }
        }
        return -1;
    }

    // Binary Search
    public static int binarySearch(Product list[], int target) {
        int l = 0;
        int h = list.length - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (list[mid].productId == target) {
                return mid;
            } else if (list[mid].productId > target) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public void display() {
        System.out.println(productId + " - " + productName + " (" + category + ")");
    }
}

public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // list of products
        Product[] products = {
                new Product(312, "Apple iPhone 14", "Electronics"),
                new Product(108, "Nike Air Max", "Footwear"),
                new Product(529, "Logitech MX Master 3", "Accessories"),
                new Product(403, "Dell Inspiron 15", "Computers"),
                new Product(217, "Samsung Galaxy S22", "Electronics"),
                new Product(664, "Fossil Smartwatch", "Wearables"),
                new Product(378, "Sony WH-1000XM5", "Audio"),
                new Product(191, "Canon EOS 1500D", "Cameras"),
                new Product(745, "Adidas Running Shorts", "Apparel"),
                new Product(582, "Mi LED Smart TV", "Electronics"),
                new Product(834, "Asus ROG Gaming Laptop", "Computers"),
                new Product(297, "Amazon Echo Dot", "Smart Home"),
                new Product(446, "HP DeskJet Printer", "Office Supplies"),
                new Product(689, "JBL Flip 6 Speaker", "Audio"),
                new Product(902, "Puma Sports T-shirt", "Apparel"),
                new Product(122, "Realme Narzo 60", "Electronics"),
                new Product(317, "Apple AirPods Pro", "Audio"),
                new Product(761, "OnePlus Watch 2", "Wearables"),
                new Product(555, "Havells Ceiling Fan", "Home Appliances"),
                new Product(638, "Zebronics Gaming Keyboard", "Accessories")
        };

        // switch case
        try {
            while (true) {
                System.out.println("------------------------------MENU----------------------------");
                System.out.println("Enter 1 for displaying the records ");
                System.out.println("Enter 2 for searching ProductID(linear search) ");
                System.out.println("Enter 3 for searching ProductID(Binary search) ");
                System.out.println("Enter 4 to exit ");
                System.out.println();
                System.out.println("Enter your choice ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println();
                        System.out.println("Displaying the products ");
                        for (Product p : products) {
                            p.display();
                        }
                        System.out.println();
                        break;

                    case 2:
                        System.out.println("Searching productId using Linear Search ");
                        int target = sc.nextInt();
                        int index = Product.linearSearch(products, target);
                        if (index == -1) {
                            System.out.println("Product not present ");
                        } else {
                            products[index].display();
                        }
                        System.out.println();
                        break;

                    case 3:
                        System.out.println("Searching productId using Binary Search ");
                        Arrays.sort(products, (a, b) -> Integer.compare(a.productId, b.productId));
                        int targetBinary = sc.nextInt();
                        int indexBinary = Product.binarySearch(products, targetBinary);
                        if (indexBinary == -1) {
                            System.out.println("Product not present ");
                        } else {
                            products[indexBinary].display();
                        }
                        System.out.println();
                        break;

                    default:
                        System.out.println("Invalid input ");
                        System.out.println();
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Thanks for visiting... ");
        }
    }
}