package abc;
public class longestString {
    public static void main(String[] args){
        String s="abccba";
        StringBuffer sb=new StringBuffer(s);
        String s1=sb.reverse().toString();
        if(s1.equals(s)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not Palindrome");
        }

}
}
