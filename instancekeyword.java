package abc;
import java.util.InputMismatchException;
import java.util.Scanner;
public class instancekeyword {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter the 2 numbers");
            int x,y,z;
            x=sc.nextInt();
            y=sc.nextInt();
            z=x/y;
            System.out.println(z);
        }catch (ArithmeticException| InputMismatchException ex){
            if(ex instanceof ArithmeticException){
                System.out.println("Cannot divide by zero");
            } else if (ex instanceof InputMismatchException) {
                System.out.println("Enter the numbers only");
            }
                System.out.println("END");
        }
    }
}
