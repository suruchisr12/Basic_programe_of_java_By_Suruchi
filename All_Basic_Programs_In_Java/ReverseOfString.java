public class ReverseOfString {
    public static void main(String[] args) {
    String str="Yogendra";
    String n="";
    System.out.println("Orignal Word: "+ str);
    for(int i=0;i<str.length();i++){
        char ch= str.charAt(i);
             n=ch+n;
    }
    System.out.println("Reverse Word: "+n);
    }
}
