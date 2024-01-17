package day31_Tasks.Interfaces;

import java.util.ArrayList;

public interface InterfaceIntro {
    int num = -100;
    double PI = 3.14;


    void eat();

    double calc();

    static void main(String[] args) {

        System.out.println(isPrime(num));


    }

    static boolean Prime(int num) {
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) isPrime = false; break;
        }
        return isPrime;
    }

    static ArrayList<Integer> isPrime(int mum) {
        ArrayList<Integer> primes = new ArrayList<>();
        if (num<2){
            System.out.println("No primes for negatives or numbers that are less then 2");
            return primes;
        }
        else {
            for (int x = 2; x<=num; x++) {
                boolean prime = true;
                for (int y = 2; y < x; y++) {
                    if (x % y == 0){
                        prime = false;
                        break;
                    }
                }
                if (prime) primes.add(x);
            }
        }
        return primes;
    }
}
