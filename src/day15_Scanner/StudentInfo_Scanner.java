package day15_Scanner;

import java.util.Scanner;

/*
ask the user to enter their age, ask them to enter favorite number and ask them if they are a student
 */
public class StudentInfo_Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you age: ");
        byte age = input.nextByte();
        System.out.println("Enter you favorite number: ");
        long num = input.nextLong();
        System.out.println("are you a student? enter a true or false");
        boolean isStudent = input.nextBoolean();
        System.out.println("My age is : "+age+  "\nFavorite number is : "+num);
        if (isStudent) System.out.println("Great, you are a student");
        else System.out.println("Sorry you are not a student");

    }
}
