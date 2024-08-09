import javax.swing.text.html.StyleSheet;

public class BubbleSort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={8,6,5,9,10};
        for(int i=0;i<arr.length-i;i++){
           for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
           }
        }
       printArray(arr);
    }
}
