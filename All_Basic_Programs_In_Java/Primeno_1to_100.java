public class Primeno_1to_100 {
   public static void main(String[] args) {
    for (  int num=1;num<=100;num++){

        int count=0;
        for (int i=1;i<=num;i++){
            if ( num%i==0)
            count++;

        }
        if(count==2)
        System.out.print(num+" ");
    }
   } 
}
