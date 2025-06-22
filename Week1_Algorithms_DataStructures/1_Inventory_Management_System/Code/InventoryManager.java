import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private Map<String, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        String key = product.productName.toLowerCase();
        if (inventory.containsKey(key)) {
            System.out.println("Product already exists: " + product.productName);
        } else {
            inventory.put(key, product);
        }
    }

    public void updateProduct(String productName, int newQuantity, double newPrice) {
        String key = productName.toLowerCase();
        if (inventory.containsKey(key)) {
            Product p = inventory.get(key);
            p.quantity = newQuantity;
            p.price = newPrice;
        } else {
            System.out.println("Product not found: " + productName);
        }
    }

    public void deleteProduct(String productName) {
        String key = productName.toLowerCase();
        if (inventory.remove(key) == null) {
            System.out.println("Product not found: " + productName);
        }
    }

    public void viewInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Product p : inventory.values()) {
                System.out.println(p);
            }
        }
    }
}
