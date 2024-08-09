import java.util.*;
public class Armstrongno {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number to cheack :");
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        while(n!=0){
            int r=n%10;
                sum=sum+(r*r*r);
                n=n/10;
        }
       if (temp==sum)
       System.out.println(temp +" Is armstrong number");
       else
       System.out.println(temp + " Is not armstrong number");
    }
}
