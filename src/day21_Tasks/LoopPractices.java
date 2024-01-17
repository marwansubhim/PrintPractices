package day21_Tasks;
/*
Write a program that sums the strict divisors of a number like for number 10; strict divisors are 5 , 2 , 1 and therefore sum = 8
                                                                          15; strict divisors are 5 , 3 , 1
 */
import java.util.Scanner;

public class LoopPractices {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int f = 0;
        for (int i = n; i>0; i--){
            if (n%i==0 && i<=n/2){// if we want to get the strict divisors of all numbers including the number itself we can simply remove i<=n/2
                f+=i;
               System.out.print(i+" ");
            }

        }
        System.out.println();
        System.out.println(f);
    }
}
