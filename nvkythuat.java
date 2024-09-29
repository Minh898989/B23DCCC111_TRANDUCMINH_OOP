public class nvkythuat extends nhanvien{
    private int workHours;  
    private double wagePerHour; 

    
    public nvkythuat(String name, int age, int workHours, double wagePerHour) {
        super(name, age); 
        this.wagePerHour = wagePerHour;
        this.workHours=workHours;
    }

   
    public void calculateSalary() {
        this.salary = workHours * wagePerHour;
    }

    public int getWorkHours() {
        return workHours;
    }

    public double getWagePerHour() {
        return wagePerHour;
    }
}