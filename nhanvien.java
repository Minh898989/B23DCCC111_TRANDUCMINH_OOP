public class nhanvien{
    private String name;
    private int age;
    protected double salary;
    public nhanvien(String name, int age){
        this.name= name;
        this.age= age;
        this.salary=0;

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;

    }
    public double getSalary(){
        return salary;
    }
    public void calculateSalary(){
        
    }
}