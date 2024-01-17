package day15_Scanner;

import java.util.Scanner;

public class Scanner_Decimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a float number ");
        float num = input.nextFloat();
        System.out.println("float number is "+num);
        System.out.println("**************");
        System.out.println("Enter a double number ");
        double num1 = input.nextDouble();
        System.out.println("double number is "+num1);
        System.out.println(input.nextFloat()+input.nextDouble());

    }
}
