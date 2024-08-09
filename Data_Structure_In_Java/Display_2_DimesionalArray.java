import java.util.*;
public class Display_2_DimesionalArray {
 public static void main(String[] args) {
    int n,m;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter row of matrix");
    n=sc.nextInt();
    System.out.println("Enter column of matrix");
    m=sc.nextInt();
    int arr[][]=new int[n][m];
    System.out.println("Enter Values: ");
    for(int i=0;i<n;i++){
       for (int j=0;j<m;j++){
         arr[i][j]=sc.nextInt();
       }
    }
    System.out.println("Elements are: ");
    for(int i=0;i<n;i++){
       for (int j=0;j<m;j++){
         System.out.print(arr[i][j]+" ");
       }
       System.out.println();
    }
 }   
}
