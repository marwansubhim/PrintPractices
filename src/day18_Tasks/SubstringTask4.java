package day18_Tasks;

import java.util.Scanner;

/*
1. write a program that can return the longest string frow two suer inputs
 */
public class SubstringTask4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first word string:");
        String str1 = in.next();
        System.out.println("Enter last word string:");
        String str2 = in.next();
        if (str1.length()>str2.length()) System.out.println(str1);
        else System.out.println(str2);
    }
}
