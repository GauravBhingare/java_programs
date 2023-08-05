package com.company;
import java.util.Scanner;
public class code_5_ {
    public static void main(String[] args)
    {
        int a;
        float b;
        double c,d;
        Scanner dist= new Scanner(System.in);
        System.out.println("enter the distance in meter :");
        a= dist.nextInt();
        b=100*a;
        c=3.28*a;
        d=39.37*a;
        System.out.println("The distance in Centi is :" + b);
        System.out.println("the distance in foot is : "+ c);
        System.out.println("the distance in Inches is :"+ d);
    }

}
