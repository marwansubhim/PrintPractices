package day21_Tasks;

import java.util.Scanner;

public class FibonacciExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = 0;
        int v1 = 1;
        int v2 = 1;

        for (int i = 1; i<= n-2;i++){
            result = v1 + v2;
            v1 = v2;
            v2 = result;
        }
        System.out.println("result = " + (result==0?1:result));
    }
}
