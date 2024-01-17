package day15_Scanner;
/*
    Create a program that will take two int numbers and multiply them. Print in the following way:
    %numOne x %numTwo = %result
    Ex: 3,5 --> 3 x 5 = 15
    Ex: -2,30 --> -2 x 30 = -60
 */
import java.util.Scanner;

public class TwoInt_Scanner {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter the first int: ");
        num1 = input.nextInt();
        System.out.print("Enter the second int: ");
        num2 = input.nextInt();
        int multi = num1*num2;
        System.out.println("("+num1+","+num2+")"+"---> "+num1+" x "+num2+" = "+multi);

    }
}
