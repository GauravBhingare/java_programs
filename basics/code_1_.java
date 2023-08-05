package com.company;
import java.util.Scanner;

public class code_1_ {
    public static void  main(String[] args) {
        System.out.println("User input");
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter Subj 1 marks ");
        int sub1 = Sc.nextInt();
        System.out.println("enter Subj2 marks");
        int sub2 = Sc.nextInt();
        System.out.println("enter Subj 3 marks");
        int sub3 = Sc.nextInt();
        System.out.println("enter Subj 4 marks");
        int sub4 = Sc.nextInt();
        System.out.println("enter Subj 5 marks");
        int sub5 = Sc.nextInt();
        float total = ( sub1 + sub2 + sub3 + sub4 + sub5 )* 100.0f/500.0f;
        System.out.println("the percentage of the student is ");
        System.out.println(total);
    }
}
