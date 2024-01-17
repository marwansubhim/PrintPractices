package day15_Scanner;

import java.util.Scanner;

/*
Recreate the task which tells the user how many days are in a given month (day 13).
Accept a month (number) and year from the console and print how many days are in that specific month. Handle leap years.
Try to redo this ask without looking at the previous code.
 */
public class DaysInMonth_Scanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number of the month: ");
        int month = in.nextInt();
        System.out.print("Enter a year: ");
        int year = in.nextInt();
        String days = "";
        boolean leapYear = year%4==0;
        boolean validYear = year>=1&&year<9999;
        boolean validMonth = month>=1&&month<=12;
        if (validMonth&&validYear){
            switch (month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    days = "days in this month is 31 days";
                    break;
                case 2: if (leapYear) days = "Year entered is a leap year and therefore days in this month is 29 days";
                else days = "days in this month is 28 days";
                    break;
                case 4: case 6: case 9: case 11:
                    days = "days in this month is 30 days";
            }
            System.out.println(days);

        }else {
            System.out.println("Invalid inputs");
        }
    }
}
