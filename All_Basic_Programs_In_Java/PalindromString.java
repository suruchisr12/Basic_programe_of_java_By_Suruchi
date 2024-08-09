import java.util.*;
public class PalindromString{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.next();
        String strRev="";
        for ( int i= str.length()-1;i>=0;i--){
            strRev = strRev+str.charAt(i);
        }
        if(str.toLowerCase().equals(strRev.toLowerCase()))
        System.out.println( str + " Is palindrome");
        else 
        System.out.println( str +" Is not palindrome ");
    }
}
