package InterviewQuestions.MyPeckage;

import java.util.ArrayList;

public class PrimeNumbers {
    public static void main(String[] args) {

        // prime numbers are the number who are divisible by themselves and 1

        // examples : 2,3,5,7,11,13,17
        // how can we achieve that

        // primes can't be less than zero or negative

        // primes between 2-10

        // prime numbers are positive integers

        ArrayList<Integer> list = new ArrayList<>();
        int num = 20;

        for (int y = 1; y<=num; y++){
            int count = 0;
            for (int x = 1; x <= y; x++) {
                if (y % x == 0) {
                    count++;
                }
            }
            if (count==2) list.add(y);
        }
        System.out.println(list);

    }
}
