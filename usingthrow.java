package abc;
import java.util.Scanner;
public class usingthrow {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter the 2 numbers");
            int x,y,z;
            x=sc.nextInt();
            y=sc.nextInt();
            if(y==0){
                ArithmeticException ex;
                ex=new ArithmeticException("Cannot divide by Zero");
                throw ex;
            }
        }catch (ArithmeticException ex){
            System.out.println(ex);
        }
        System.out.println("END");
    }
}
