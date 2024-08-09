import java.util.*;
public class InsertArrayElement{
  public static void main(String[] args) {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Size of array");
    n=sc.nextInt();
    int arr[]=new int[n];
    int arr1[]=new int[n+1];
    System.out.println("Enter values");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter index to be new value inserted");
    int ind=sc.nextInt();
    System.out.println("Enter new value you want to insert");
    int newValue=sc.nextInt();
    for(int i=0;i<arr1.length;i++){
        if(i>ind){
        arr1[i]=arr[i];
        }
        else if(i==ind){

        arr1[i]=newValue;
        }
        else
        {
        arr1[i]=arr[i-1];
        }
    }
    System.out.println("Element are: ");
    for (int i=0;i<arr1.length;i++){
        System.out.println(arr1[i]);
    }

  }
}