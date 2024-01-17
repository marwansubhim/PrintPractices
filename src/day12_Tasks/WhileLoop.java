package day12_Tasks;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
//        int number, count;
//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("enter a number");
//        number = keyboard.nextInt();
//
//        count = 1;
//        while (count<=number){
//            System.out.print(count+", ");
//            count+=8;
//        }

        Scanner keyboard = new Scanner(System.in);

        System.out.println("enter a positive integer");
        int total = 0;

        int nextNum = keyboard.nextInt();

        while (nextNum>0){
           total = total + nextNum;
        }

        System.out.println("Sum of all numbers "+total);

    }
}
