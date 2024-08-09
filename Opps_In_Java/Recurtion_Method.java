import java.util.Scanner;

public class Recurtion_Method {
    public static int calcFactorial(int n) {
        int fact = 1;
        if (n == 1 || n == 0) {
            return 1;
        }
        fact = fact * n * calcFactorial(n - 1);
        return fact;
    }
    public static void  calcSumNatural(int i, int n, int sum){
        if(i==n){
            sum=sum+i;
            System.out.println(sum);
             return;
        }
        sum=sum+i;
        calcSumNatural(i+1, n, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value you want to find factorial");
        int n = sc.nextInt();
        int result = calcFactorial(n);
        System.out.println("Factorial of " + n + " is " + result);
        System.out.print("Sum of "+n+ "natural number is ");
       // System.out.println(calcSumNatural(1, n,0));
       calcSumNatural(1, 5, 0);
    }
}