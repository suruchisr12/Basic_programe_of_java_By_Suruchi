import java.util.*;
public  class Function{
    public static void printMyName(String name){
      System.out.println(name);
    }
    public static int calculateSum(int a,int b){
    return a+b;
    }
    public static int calculateMul(int a,int b){
        return a*b;
    }
    public static int calculateSub(int a,int b){
        return a-b;
    }
    public static int calculateDiv(int a,int b){
        return a/b;
    }
    public static void  FindFactorial(int n){
        int fact=1;
        if(n<=0){
        System.out.println("Invalid number please enter positive number  ");
        return;
       }
        for (int i=n;i>=1;i--){
            fact=fact*i;
        }
        System.out.println("Factorial of "+ n+" is = "+fact);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your name");
        String name=sc.nextLine();
        System.out.println("Enter values of a and b: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("------------------------------");
        printMyName(name);
        System.out.println("Addition= "+calculateSum(a,b));
        
        System.out.println("Subtraction= "+calculateSub(a,b));
        System.out.println("Multiplication= "+ calculateMul(a,b));
       System.out.println( "Division= "+calculateDiv(a,b));
       System.out.println("----------------------------------");
       System.out.println("Enter a number to find factorial");
       int n=sc.nextInt();
       FindFactorial(n);
    }
}