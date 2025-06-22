import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<Integer, Customer> customers;

    public CustomerRepositoryImpl() {
        customers = new HashMap<>();
        // Add multiple customers
        customers.put(101, new Customer(101, "Ankur Bose"));
        customers.put(102, new Customer(102, "Sumit Das"));
        customers.put(103, new Customer(103, "Abhram David"));
    }

    @Override
    public Customer findCustomerById(int id) {
        return customers.getOrDefault(id, null);
    }
}
