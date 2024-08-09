public class LowestElementInArray {
        public static void main(String[] args) {
            int arr[]={80,70,45,67,34,67,56,88,49,89};
            int i,min=arr[0];
            for ( i=0;i<arr.length;i++){
               if(min>arr[i])
               min=arr[i];
            }
            System.out.println("Minimum number in array is : "+min);
        }
    
    
}
