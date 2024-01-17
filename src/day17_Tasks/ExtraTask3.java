package day17_Tasks;
/*
3. write a program to ask use to enter first name and last name
			then print the initials (first letter of first name + first letter of last name)
 */
import java.util.Scanner;

public class ExtraTask3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = in.next();
        System.out.print("Enter your last name: ");
        String lastName = in.next();
        //System.out.println(firstName.charAt(0)+". "+lastName.substring(0,1)); // another way to do it
        System.out.println(firstName.charAt(0)+". "+lastName.charAt(0));
    }
}
