package abc;
import java.util.Scanner;
public class exceptionhandle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 2 numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        try{
            int z=x/y;
            System.out.println(z);
        }catch (ArithmeticException ex){
            System.out.println("Cannot divide by zero");

        }
        System.out.println("end");
    }
}
