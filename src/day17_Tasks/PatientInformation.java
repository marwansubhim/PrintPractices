package day17_Tasks;

import java.util.Scanner;

public class PatientInformation {
    public static void main(String[] args) {
        String firstName, lastName, fullName, email, street, state, city, address, contacts;
        int age, zipCode;
        double height, weight;
        boolean isMarried ;
        long workPhoneNumber, personalPhoneNumber;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        firstName = scan.nextLine();
        System.out.println("Enter your last name");
        lastName = scan.nextLine();
        System.out.println("Enter your email");
        email = scan.nextLine();
        System.out.println("Enter your street");
        street = scan.nextLine();
        System.out.println("Enter your city");
        city = scan.nextLine();
        System.out.println("Enter your state");
        state = scan.nextLine();
        System.out.println("Enter your zip code");
        zipCode = scan.nextInt();
        System.out.println("Enter your work phone number");
        workPhoneNumber = scan.nextLong();
        System.out.println("Enter your personal phone number");
        personalPhoneNumber = scan.nextLong();
        System.out.println("Enter your age");
        age = scan.nextInt();
        System.out.println("Enter your height");
        height = scan.nextDouble();
        System.out.println("Enter your weight");
        weight = scan.nextDouble();
        System.out.println("Are you married?");
        isMarried = scan.nextBoolean();
        System.out.println("Patient personal information");
        fullName = "Full name: "+lastName+", "+firstName;
        address = "Address: "+street+", "+city+", "+state+" "+zipCode;
        contacts = "Contacts: work phone number - "+workPhoneNumber+", personal phone number - "+personalPhoneNumber+", email: "+email;
        System.out.println(fullName+"\n"+address+"\n"+contacts+"\nAge: "+age+"\nHeight: "+height+"\nWeight: "+weight+" pounds\nMarried?: "+isMarried);




    }
}
