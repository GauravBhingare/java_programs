package com.company;
import java.util.Scanner;
public class code_4_ {
    public static void main(String[] args)
    {
        System.out.println("enter your name");
    Scanner dr= new Scanner(System.in);
    String name=dr.nextLine();
        System.out.println(name);
        System.out.println("Enter your age");
    Scanner ds= new Scanner(System.in);
    int age= ds.nextInt();
      if (18<age&&age<75){
          System.out.println("You are a eligible");
      }
      else {
          System.out.println("You are not eligible");
      }
    }

}

