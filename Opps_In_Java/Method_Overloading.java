class Student {
    String name;
    int age;
   
    public void displayInfo(String name) {
        System.out.println(this.name);
    }
  
    public void displayInfo(int age) {
        System.out.println(this.age);
    }
  
    public void displayInfo(String name, int age) {
        System.out.println(this.name);
        System.out.println(this.age);
    }
 }
public class Method_Overloading {
    public static void main(String[] args) {
        Student s1=new Student();
         s1.name="Yogii";
         s1.age=24;
         s1.displayInfo(s1.name);
         s1.displayInfo(s1.name, s1.age);
         s1.displayInfo(s1.age);
       
    }
     
}
