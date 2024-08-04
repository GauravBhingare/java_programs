package abc;

public class withoutxchar {
    public static void main(String[] args){
        String s="xcharacterx";
        int n=s.length();
        if(s.charAt(0)==s.charAt(n-1)){
            System.out.println(s.substring(1,n-1));
        }
    }
}
