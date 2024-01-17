package InterviewQuestions.InterviewQuestions2;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number that you want to display the prime numbers range");
        int num = in.nextInt();
        System.out.println(isPrime(num));
    }

   public static ArrayList<Integer> isPrime(int num) {
        ArrayList<Integer> primes = new ArrayList<>();
        if (num<2){
           throw new RuntimeException("No primes for negatives numbers or numbers that are less then 2");
           // return primes;
        }
        else {
            for (int i = 2; i<=num; i++) {
                boolean prime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0){
                        prime = false;
                        break;
                    }
                }
                if (prime) primes.add(i);
            }
        }
        return primes;
    }
}
