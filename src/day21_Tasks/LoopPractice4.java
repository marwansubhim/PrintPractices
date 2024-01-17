package day21_Tasks;

import java.util.Scanner;

public class LoopPractice4 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("enter a number");
        int num = in.nextInt();

        int sum = 0;
        while (num>0){
            sum+=num%10;
            num/=10;
        }
        System.out.println("sum is "+sum);
    }
}
