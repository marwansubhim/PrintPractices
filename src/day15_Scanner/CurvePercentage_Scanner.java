package day15_Scanner;
/*
Ask the user to enter the curve percentage for the class and to enter their grade to determine
if the curve will allow them to get an A (>= 90). [Use double datatype]
    - In the case the given curve is more than 100 or less than 0, print Invalid curve
    - In the case the given grade is less than 0, print invalid grade
    - In the case the student was not able to get an A after the curves
    (grade was less than 90). Ask them if they did the extra credit assignments(boolean)
    If the student did the extra credit add 2 whole percentage to their grade
    Ex: 15, 80 --> 92.0 after curve. Final Grade:  92.0
    Ex: 25, 55 --> 68.75 after curve, Did you do extra credit -> false -> Final grade: 68.75
    Ex: 20, 60 --> 72.0 after curve, Did you do extra credit -> true -> Final grade: 74.0
    Hint: (curve value / 100) --> Percentage value of the curve
 */

import java.util.Scanner;

public class CurvePercentage_Scanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the curve percentage: ");
        double curve = in.nextDouble() / 100;
        if (curve < 0 || curve > 1) {
            System.out.println("Invalid curve");
        } else {
            System.out.print("Enter grade: ");
            double grade = in.nextDouble();
            if (grade < 0 || grade > 100) System.out.println("Invalid Grade");
            else {
                double afterCurve = grade + grade * curve;
                System.out.print("Did you do extra credit? ");
                boolean didExtraCredit = in.nextBoolean();
                double finalGrade = didExtraCredit ? afterCurve += 2 : afterCurve;
                System.out.println("Final grade: " + finalGrade);
            }
        }
    }
}
