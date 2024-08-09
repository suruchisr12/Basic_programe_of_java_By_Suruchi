import java.util.*;
public class Palindromeno {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number to cheack ");
      int n=sc.nextInt();
      int temp,sum=0;
      temp=n;
      while(n!=0){
       int r=n%10;
           sum=(sum*10)+r;
           n=n/10;

      }
      if(temp==sum)
      System.out.println( temp+" Is palindrome number");
      else
      System.out.println(temp+" Is not palindrome number");
   } 
}
