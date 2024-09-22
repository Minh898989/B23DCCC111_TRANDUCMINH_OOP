public class Student {
   private String name;
   private int age;
   public Student(String name,int age){
      this.name=name;
      this.age=age;
   }
   public String getNanme(){
    return name;
   }
   public int getAge(){
    return age;
   }
   public void displayInfo(){
    System.out.println("Ten hoc sinh"+name);
    System.out.println("Tuoi"+age);
   }
}
