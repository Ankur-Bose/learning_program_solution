public class TaskLinkedList {
    private TaskNode head;

    public TaskLinkedList() {
        this.head = null;
    }

    // Add Task at end
    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Search Task by ID
    public Task searchTask(int taskId) {
        TaskNode current = head;
        while (current != null) {
            if (current.task.taskId == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    // Delete Task by ID
    public void deleteTask(int taskId) {
        if (head == null) return;

        if (head.task.taskId == taskId) {
            head = head.next;
            System.out.println("Task deleted.");
            return;
        }

        TaskNode current = head;
        while (current.next != null && current.next.task.taskId != taskId) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            System.out.println("Task deleted.");
        } else {
            System.out.println("Task not found.");
        }
    }

    // Display all tasks
    public void displayTasks() {
        TaskNode current = head;
        while (current != null) {
            current.task.display();
            current = current.next;
        }
    }
}
