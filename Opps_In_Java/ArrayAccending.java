import java.util.*;
public class ArrayAccending {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of array: ");
    int size=sc.nextInt();
    int arr[]=new int[size];
     System.out.println("Enter values are: ");
     for(int i=0;i<size;i++){
       arr[i]=sc.nextInt();

     }
     System.out.println("Elements are in accending order are: ");
     for(int i=0;i<arr.length;i++){
       
        if(arr[i]>arr[i+1])
        arr[i]=arr[i+1];
        System.out.println(arr[i]);
       
     }
   } 
}
