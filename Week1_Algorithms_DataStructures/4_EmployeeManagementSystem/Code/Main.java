public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem(5);

        system.addEmployee(new Employee(1, "Ankur", "Developer", 75000));
        system.addEmployee(new Employee(2, "Riya", "Manager", 90000));
        system.addEmployee(new Employee(3, "Aman", "Analyst", 60000));

        System.out.println("\nAll Employees:");
        system.displayAll();

        System.out.println("\nSearching Employee with ID 2:");
        Employee found = system.searchEmployee(2);
        if (found != null) found.display();
        else System.out.println("Not found.");

        System.out.println("\nDeleting Employee with ID 1:");
        system.deleteEmployee(1);

        System.out.println("\nUpdated Employee List:");
        system.displayAll();
    }
}