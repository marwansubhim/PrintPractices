package InterviewQuestions.MyPeckage;

import java.util.ArrayList;

public class PrimeNumbers2 {
    public static void main(String[] args) {

        ArrayList<Integer> primes = new ArrayList<>();
        int num = 20;
        for (int x = 1; x<=num ; x++){
            int i = 1;
            int count = 0;
            while (i <= x) {
                if (x % i == 0) count++;
                i++;
            }
            if (count==2) primes.add(x);
        }
        System.out.println(primes);



//        if (count == 2) System.out.println("prime");
//        else System.out.println("not prime");


//        for (int x= 1; x<=num; x++){
//            int i = 1;
//            int count = 0;
//            while (i <= num) {
//                if (x % i == 0) count++;
//                i++;
//            }if (count == 2) primes.add(x);
//        }
//
//        System.out.println(primes);


//         {// here we are saying if it is divisible by 1 and by itself
//            System.out.println("prime");
//        } else System.out.println("not a prime");
    }
}
