package day13_Tasks;
/*
 The variable "num" holds an integer user input
Write a conditional statement starting on line 9 that does the following:
If num is positive, print "__ is positive"
If num is negative, print "__ is negative"
Examples:
In: 5
5 is positive
In: -2
-2 is negative
In: 0
(no output for zero)
 */
public class ConditionalStatementPractice {
    public static void main(String[] args) {

        int num = 11988;
        String numberIs = "";
//        if (num>0) numberIs = num+" is positive";
//        else if (num<0) numberIs = num+" is negative";
//        System.out.println(numberIs);

        if (num%2==0)numberIs = num+" is even";
        else numberIs = num+" is odd";
        System.out.println(numberIs);


    }
}
