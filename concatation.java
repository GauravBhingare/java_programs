package abc;

public class concatation {
    public static void main(String[] args){
        String s1="KUMAR";
        String s2="ranjan";
        String s,s3,s4;
        s3=s1.toLowerCase();
        s4=s2.toLowerCase();
        int n=s1.length();
        int m=s2.length();
        if(s3.charAt(n-1)==s4.charAt(0)){
            s=s1.concat(s2.substring(1,m));
        }
        else{
            s=s3.concat(s4);
        }
        System.out.println(s.toLowerCase());
    }
}
