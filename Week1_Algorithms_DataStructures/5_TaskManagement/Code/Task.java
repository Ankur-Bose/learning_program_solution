public class Task {
    int taskId;
    String taskName;
    String status;

    public Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
    }

    public void display() {
        System.out.println("Task ID: " + taskId + ", Task Name: " + taskName + ", Status: " + status);
    }
}
