package abc;

public class firstlastChar {
    public static void main(String[] args){
        String s="Character";
        int n=s.length();
        String s1=s.substring(1,n-1);
        System.out.println("String Without First and last Char is: " +s1);
    }
}
