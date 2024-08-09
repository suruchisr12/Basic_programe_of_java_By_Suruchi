import java.util.*;
public class Reverseno {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in) ;
      System.out.println("Enter a number that you want to reverse");
      int n=sc.nextInt();
      while(n!=0) {
        int r=n%10;
            n=n/10;
            System.out.print(r);
      }
    }
}
