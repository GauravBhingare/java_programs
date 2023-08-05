package com.company;
import java.util.Scanner;
public class code_2_ {
    public static void main(String[] args){
        {
            // Scanner sc = new Scanner(System.in);
           // String name= sc.next();
      //      System.out.println("Hey " + name + " Please enter your College Name ");
        //    String College= sc.next();
          // System.out.println("Your college name is " + College );
            // System.out.println("enter the Distance ");
    //        Scanner ds = new Scanner(System.in);
      //      float a= ds.nextFloat();
  //    float distance = a/1000;
    //        System.out.println("Distance= " + distance + " km ");
            System.out.println("enter any number");
            Scanner div = new Scanner(System.in);
            float b = div.nextInt();
            float c = div.nextFloat();
            float a = (500-b*c)/2;
            System.out.println("the operation is "+ a);
            System.out.println((b<c)||(a<c));
        }

    }
}
