package day21_Tasks;
/*
write a program which a positive integer from user and indicate whether a number is a prime number or not

hint a prime number is a number that the sum of its strict divisors are == 1
 */
import java.util.Scanner;

public class LoopPractice2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        int sum = 0;
        for (int i =num ; i>0; i--){
            if (num%i==0&&i<=num/2){
                sum+=i;

            }
        }
        System.out.println(sum==1? "prime": "not a prime");
    }
}
