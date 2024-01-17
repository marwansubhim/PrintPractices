package day15_Scanner;
/*
Ask the user to enter their zipcode (long), the number of people they live with (byte),
if they are married or not (boolean - true for married/false for not) and print the values in the following format:
"I see you are $marriedOrNot! and live with $peopleNum people in your house which is in the $zipcode area! "
Ex: 31009, 4, false --> I see you are not married and live with 4 people in your house which is in the 31009 area!
 */

import java.util.Scanner;

public class Bio_Scanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your zip code: ");
        long zipcode = in.nextLong();
        System.out.print("Enter people living in the house: ");
        byte numPeople = in.nextByte();
        System.out.print("Married? ");
        boolean isMarried = in.nextBoolean();
        if (isMarried){
            System.out.println("I see that you are Married and live with "+numPeople+" in your house in zipcode "+zipcode+" area!");
        }else System.out.println("I see that you are not Married and live with "+numPeople+" in your house in zipcode "+zipcode+" area!");

    }
}
