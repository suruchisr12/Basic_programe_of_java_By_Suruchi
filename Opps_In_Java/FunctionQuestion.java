
import java.util.*;
public class FunctionQuestion {
  public static float CalculateAverage(int a,int b,int c)  {
    return (a+b+c)/3;
  }
  public static void FindOddNumber(int n){
    for(int i=1;i<=n;i++){
        if(i%2!=0){
            System.out.print(i+" ");
        } 
    }
  }
  public static int FindGreter(int a,int b){
    if(a>b)
    return a;
    else 
    return b;
  }
  public static double AreaOfCircle(int r){
       return (3.14*r*r);
  }
  public static boolean MajorOrNot(int age){
    if(age>18){
    System.out.println("Eligible for vote");
    return true;
    }
    else{
    System.out.println("Not eligible for vote");
    return false;}
  }
  public static void main(String[] args) {
    System.out.println("Average = "+CalculateAverage(90, 98, 97));
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    FindOddNumber(n);
    System.out.println("Enter two number to comapre whiuch one is greater");
    int a=sc.nextInt();
    int b=sc.nextInt();
    
    System.out.println("Greater =" +FindGreter(a, b));
    System.out.println("---------------------------");
    System.out.println("Enter radious: ");
    int r=sc.nextInt();
    System.out.println("Area of circle= " +AreaOfCircle(r));
    System.out.println("----------------------------");
    System.out.println("Enter a age: ");
    int age=sc.nextInt();
    System.out.println(MajorOrNot(age) );
  }
}
