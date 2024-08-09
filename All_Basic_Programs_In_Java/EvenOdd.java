import java.util.*;
public class EvenOdd {
   public static void main(String[] args) {
    System.out.println("Enter a number you waant to check");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n%2==0)
    System.out.println(n+" Is even number");
    else
    System.out.println(n+ " is odd number");
   } 
}
