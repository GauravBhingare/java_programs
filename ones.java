package abc;
import java.util.Scanner;
public class ones {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String st=sc.next();
        int k=st.length();
        int count=0;
        if(k==32){
            for(int i=0;i<k;i++) {
                if (st.charAt(i)=='1') {
                    count = count+1;
                }
            }
            System.out.println(count);
        }
        else{
            System.out.println("error");
        }
    }
}
