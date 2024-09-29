public class mainn {
    public static void main(String[] args) {
        
        nvvanphong officeEmployee = new nvvanphong("Alice", 30, 20);
        officeEmployee.calculateSalary();
        System.out.println("Office Employee: " + officeEmployee.getName() + ", Salary: " + officeEmployee.getSalary());

      
        nvkythuat technicalEmployee = new nvkythuat("Bob", 28, 160, 15);
        technicalEmployee.calculateSalary();
        System.out.println("Technical Employee: " + technicalEmployee.getName() + ", Salary: " + technicalEmployee.getSalary());
    }
}
