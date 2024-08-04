package abc;
import java.util.InputMismatchException;
import java.util.Scanner;
public class multiexception {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 2 numbers");
        int x,y,z;
        x=sc.nextInt();
        y=sc.nextInt();
        try{
            z=x/y;
            System.out.println(z);
        }catch (ArithmeticException ex){
            System.out.println("Cannot divide by zero");
        }catch (InputMismatchException ex){
            System.out.println("Enter the numbers only");
        }
        System.out.println("END");
    }
}
