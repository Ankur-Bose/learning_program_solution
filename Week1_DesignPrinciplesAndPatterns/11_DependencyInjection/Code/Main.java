public class Main {
    public static void main(String[] args) {
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);

        service.displayCustomer(101);
        service.displayCustomer(102);
        service.displayCustomer(103);
        service.displayCustomer(999);  // Not found case
    }
}
