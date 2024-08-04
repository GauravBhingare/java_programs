package abc;

public class lefrigo {
    public static void main(String[] args){
        String a="abcdedgdg";
        int n=a.length();
        StringBuffer b=new StringBuffer(a);
        StringBuffer c=b.delete(1,n-1);
        System.out.println(c);
    }
}
