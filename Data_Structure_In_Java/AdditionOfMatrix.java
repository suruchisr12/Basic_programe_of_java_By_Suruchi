import java.util.*;
public class AdditionOfMatrix {
    
 public static void main(String[] args) {
    int n,m,p,q;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter row of matrix");
    n=sc.nextInt();
    System.out.println("Enter column of matrix");
    m=sc.nextInt();
    int a[][]=new int[n][m];
    System.out.println("Enter Values: ");
    for(int i=0;i<n;i++){
       for (int j=0;j<m;j++){
         a[i][j]=sc.nextInt();
       }
    }
    System.out.println("Enter row of 2nd matrix");
    q=sc.nextInt();
    System.out.println("Enter column of 2nd matrix");
    p=sc.nextInt();
    int b[][]=new int[p][q];
    System.out.println("Enter Values for 2nd matrix: ");
    for(int i=0;i<p;i++){
       for (int j=0;j<q;j++){
         b[i][j]=sc.nextInt();
       }
    }
    int c[][]=new int[p][q];
    System.out.println("Addition of matrix  are: ");
    for(int i=0;i<p;i++){
       for (int j=0;j<q;j++){
        c[i][j]=a[i][j]+b[i][j];
         System.out.print(c[i][j]+" ");
       }
       System.out.println();
    }
 }   


}
