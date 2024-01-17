package day17_Tasks;
/*
 write a program to ask the user their age. Add 5 to their age and print: In 5 years you will be $newAge years old
 */
import java.util.Scanner;

public class ExtraTask6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = in.nextInt();
        age+=5;
        System.out.println("In 5 years from now you will be "+age+" years old");
    }
}
