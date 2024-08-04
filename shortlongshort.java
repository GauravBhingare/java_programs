package abc;

public class shortlongshort {
    public static void main(String[] args){
        String a="abcd";
        String b="ab";
        int i,j;
        i=a.length();
        j=b.length();
        if(a.length()<b.length()){
            System.out.println(a+b+a);
        }else{
            System.out.println(b+a+b);
        }
    }
}
