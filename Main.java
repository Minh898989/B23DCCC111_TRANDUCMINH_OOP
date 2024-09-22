public class Main{
  
        public static void main(String[] args) {
            // Tạo một vài học sinh
            Student student1 = new Student("Nguyễn Văn A", 15);
            Student student2 = new Student("Trần Thị B", 16);
            Student student3 = new Student("Lê Văn C", 15);
    
            // Tạo một lớp học
            Classroom classroom = new Classroom("Lớp 10A");
    
            // Thêm học sinh vào lớp
            classroom.addStudent(student1);
            classroom.addStudent(student2);
            classroom.addStudent(student3);
    
            // Hiển thị thông tin các học sinh trong lớp
            classroom.displayStudents();
        }
    }
    


