import java.util.Scanner;
import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a year to cheack :"); 
      int n=sc.nextInt();
      if((n%4==0)&&(n%100!=0)||(n%400==0))
      System.out.println(n +" Is leap year");
      else 
      System.out.println(n +" Is not leap year");
    }
}
