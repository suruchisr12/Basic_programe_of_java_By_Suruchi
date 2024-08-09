import java.util.*;
public class ArrayCreation{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of array are :");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter values: ");
        for ( int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements are: ");
        for ( int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
    