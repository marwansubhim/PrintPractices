package day17_Tasks;
/*
2. write a program to ask user to enter first name and last name
			then print the full name in all upper case
 */
import java.util.Scanner;

public class ExtraTask2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first and last name");
        String fullName = in.nextLine();
        System.out.println(fullName.toUpperCase());
    }
}
