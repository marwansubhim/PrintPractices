package day15_Scanner;
/*
Ask user to enter three numbers. Print the biggest number from the entered numbers
    Ex:
    Input: 3,6,4
    Output: The biggest number from 3,6, 4 is
 */
import java.util.Scanner;

public class BiggestNumber_Scanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers respectively: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        if (n1>n2&&n1>n3) System.out.println("the biggest number from ("+n1+", "+n2+", "+n3+") is "+n1);
        else if (n2>n1&&n2>n3) System.out.println("the biggest number from ("+n1+", "+n2+", "+n3+") is "+n2);
        else System.out.println("the biggest number from ("+n1+", "+n2+", "+n3+") is "+n3);


    }
}
