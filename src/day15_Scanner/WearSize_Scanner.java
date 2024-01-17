package day15_Scanner;

import java.util.Scanner;

/*
Ask the user to enter their height (double), shoe size (byte), and if they like to wear hats (boolean).
Print out the information
 */
public class WearSize_Scanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Height: ");
        double height = input.nextDouble();
        System.out.print("Enter your shoe size: ");
        byte shoeSize = input.nextByte();
        boolean isWearHat;
        System.out.print("Do you wear hats? ");
       isWearHat = input.nextBoolean();
        System.out.println("my height is "+height+"\nmy shoe size is "+shoeSize);
        if (isWearHat) {
            System.out.println("I like to wear hats ");
        }else {
            System.out.println("I don't like to wear hats");
        }


    }
}
