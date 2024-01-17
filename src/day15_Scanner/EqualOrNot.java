package day15_Scanner;

import java.util.Scanner;

/*
 Write a program that will accept two numbers and check if two numbers are equal or not.
 */
public class EqualOrNot {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number first number: ");
       int num1 = in.nextInt();
        System.out.print("Enter second number: ");
       int num2 = in.nextInt();
        if (num1==num2) System.out.println("Both numbers are equal");
        else System.out.println("Numbers entered are not equal!");


    }
}
