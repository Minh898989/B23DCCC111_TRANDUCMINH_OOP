public class nvvanphong extends nhanvien {
    private int workDays;
    private static final double luongmotngay=100;
    public nvvanphong(String name, int age, int worDays){
        super(name, age);
        this.workDays=worDays;
    }
    public void calculateSalary(){
        this.salary=workDays*luongmotngay;
    }
    public int getWorkDays(){
        return workDays;
    }
}

