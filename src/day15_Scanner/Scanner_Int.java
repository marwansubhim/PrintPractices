package day15_Scanner;

import java.util.Scanner;

public class Scanner_Int {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number one: ");
        int numOne = scanner.nextInt();
        System.out.println("Enter Number two: ");
        int numTwo = scanner.nextInt();
        System.out.println("Number one: "+numOne);
        System.out.println("Number two: "+numTwo);
        System.out.println("Sum is: "+(numOne+numTwo));
        /*
        ask the user to enter an int number, print the number if is even or odd
         */
        System.out.println("************");



    }
}
