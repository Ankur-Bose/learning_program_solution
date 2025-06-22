public class Main {
    public static void main(String[] args) {

        Student model = retrieveStudentFromDatabase();

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("Ankur Bose");
        controller.setStudentGrade("A+");

        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("John");
        student.setId("101");
        student.setGrade("B");
        return student;
    }
}
