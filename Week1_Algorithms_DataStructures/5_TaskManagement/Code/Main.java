public class Main {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(new Task(1, "Design Module", "In Progress"));
        taskList.addTask(new Task(2, "Implement Feature", "Pending"));
        taskList.addTask(new Task(3, "Test System", "Completed"));

        System.out.println("\nAll Tasks:");
        taskList.displayTasks();

        System.out.println("\nSearching for Task with ID 2:");
        Task found = taskList.searchTask(2);
        if (found != null) found.display();
        else System.out.println("Task not found.");

        System.out.println("\nDeleting Task with ID 1:");
        taskList.deleteTask(1);

        System.out.println("\nRemaining Tasks:");
        taskList.displayTasks();
    }
}
