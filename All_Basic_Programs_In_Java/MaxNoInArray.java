public class MaxNoInArray {
    public static void main(String[] args) {
        int arr[]={80,70,45,67,34,67,56,88,49,89};
        int i,max=0;
        for ( i=0;i<arr.length;i++){
           if(max<arr[i])
           max=arr[i];
        }
        System.out.println("Maximum number in array is : "+max);
    }
}
