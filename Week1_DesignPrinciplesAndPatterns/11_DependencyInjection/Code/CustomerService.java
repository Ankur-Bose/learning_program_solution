public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void displayCustomer(int id) {
        Customer customer = customerRepository.findCustomerById(id);
        if (customer != null) {
            System.out.println(customer);
        } else {
            System.out.println("Customer with ID " + id + " not found.");
        }
    }
}
