package day15_Scanner;

import java.util.Scanner;

/*
    Ask the user to enter the year, month number, and day (pick any datatype for the values)
    they were born and print in the following format: " $month / $day / $year is your birthday "
 */
public class YearMonthAndDayScanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year you were born: ");
        int year = input.nextInt();
        System.out.print("Enter the month you were born: ");
        String month = input.next();
        System.out.print("Enter the day you were born: ");
        byte day = input.nextByte();
        System.out.println(month+" / "+day+" / "+year+" is your birthday");

    }
}
