import java.util.*;
public class SearchElementInArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,90,100};
        System.out.println("Enter you want to search");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        for( i=0;i<arr.length;i++){
            if(arr[i]==n)
            break;
        }
        System.out.println(arr[i]+" At index "+ i);
    }
}
