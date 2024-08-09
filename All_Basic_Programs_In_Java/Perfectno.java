import java.util.*;
public class Perfectno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number you want to cheack");
        int n=sc.nextInt();
        int sum=0;
        for (int i=1;i<n;i++){
            if(n%i==0)
             sum=sum+i;
            
        }
        if(sum==n)
        System.out.println(n+" Is perfect number");
        else 
        System.out.println(n+" Is not perfect number");
        

    }
}
