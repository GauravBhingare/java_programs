package abc;

public class firstHalf {
    public static void main(String[] args){
        String s="abcdefg";
        int n=s.length();
        String s1;
        if((s.length())%2==0){
            System.out.println("First Half is " + s.substring(0,n/2));
        }else{
            System.out.println("null");
        }
    }
}
