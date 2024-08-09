import java.util.*;
public class DecendingOrderOfArray {
    public static void main(String[] args) {
        int temp=0,n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Array element are");
        for(i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        System.out.println("----------------------------------------------------------------------");
        for(i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Arranged element are :");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }


}
