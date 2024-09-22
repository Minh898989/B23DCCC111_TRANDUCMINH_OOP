import java.util.ArrayList;

public class Classroom {
    private String className;
    private ArrayList<Student> students;


    public Classroom(String className) {
        this.className = className;
        this.students = new ArrayList<>();
    }

    
    public void addStudent(Student student) {
        students.add(student);
    }

   
    public void displayStudents() {
        System.out.println("Lớp học: " + className);
        for (Student student : students) {
            student.displayInfo();
        }
    }
}


