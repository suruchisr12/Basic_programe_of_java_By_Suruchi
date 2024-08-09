import java.util.*;
public class Transpose_Of_Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array row and column");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("enter Values are: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Transpose of a Matrix is: ");
        for(int j=0;j<c;j++){
           for(int i=0;i<r;i++){
            
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

