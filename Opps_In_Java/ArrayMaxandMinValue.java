import java.util.*;
public class ArrayMaxandMinValue {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of array");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter values are: ");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int max=arr[0];
    int min=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max)
        max=arr[i];
        if(arr[i]<min)
        min=arr[i];
    }
    System.out.println(max +" Is maximum");
    System.out.println(min +" Is minimum");
   } 
}
