import java.util.*;
public class addSubMuliv {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in) ;
      System.out.println("Enter the value of a and b");
      int a=sc.nextInt();
      int b=sc.nextInt();
      System.out.println("Addition of" + a+" and "+b+" = "+(a+b));
      System.out.println("Subtraction  of" + a+" and "+b+" = " + (a -b));
      System.out.println("Multiplication of" + a+" and "+b+" = "+(a*b));
      System.out.println("Division of" + a+" and "+b+" = "+(a/b));
      System.out.println("Reminder of" + a+" and "+b+" = "+(a%b));
    }
}
