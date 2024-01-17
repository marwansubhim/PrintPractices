package day15_Scanner;

import java.util.Scanner;

/*
Write a program that ask user to enter 3 numbers and shows the sum of the numbers.
 */
public class SumOfNumbers_Scanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num = in.nextInt();
        System.out.print("Enter the second number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = in.nextInt();
        int sum = num+num1+num3;

        if (num>=0&&num1>=0&&num3>=0) System.out.println("Sum of numbers is: "+sum);
        else if (num<0&&num1>=0&&num3>=0) System.out.println("Sum is "+(num1+num3));
        else if (num>=0&&num1<0&&num3>=0) System.out.println("Sum is "+(num+num3));
        else if (num>=0&&num1>=0&&num3<0) System.out.println("Sum is "+(num+num1));
        else if (num<0&&num1<0&&num3>=0) System.out.println("Sum is "+num3);
        else if (num<0&&num1>=0&&num3<0) System.out.println("Sum is "+num1);
        else if (num>=0&&num1<0&&num3<0)System.out.println("Sum is "+num);
        else {
            System.out.println("All negative numbers");
        }
    }
}
