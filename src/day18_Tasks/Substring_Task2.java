package day18_Tasks;

import java.util.Scanner;

/*
write a program that can return the initials of the user
			ex:
				cybertek
				school

			output:
				C.S
 */
public class Substring_Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName = in.next();
        System.out.println("Enter last name");
        String lastName = in.next();
        String initials = firstName.toUpperCase().charAt(0)+". "+lastName.toUpperCase().charAt(0);
        System.out.println("Name initials are: "+initials);
    }
}
