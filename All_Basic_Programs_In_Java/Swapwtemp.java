public class Swapwtemp {
    public static void main(String[] args) {
        int X=10;
        int Y=20;
        System.out.println("Before Swaping");
        System.out.println("X = "+ X +" Y = " + Y);
        X=X+Y;
        Y=X-Y;
        X=X-Y;
        System.out.println("After Swaping");
        System.out.println("X = "+ X +" Y = " + Y);
    }
}
