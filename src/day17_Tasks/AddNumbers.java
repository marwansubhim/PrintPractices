package day17_Tasks;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        int num1, num2, num3, sum;
        System.out.println("Enter 3 numbers:");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();
        sum = num1+num2+num3;
        System.out.println("Sum of numbers: "+sum);
    }
}
