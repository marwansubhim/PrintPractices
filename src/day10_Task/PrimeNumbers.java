package day10_Task;

public class PrimeNumbers {
    public static void main(String[] args) {
        int PrimeNumber = 3; //
        /*
        1................9
         */
        double num1 = 1;
        double num2 = 2;

        //int num3 = 3;
        boolean group = num1>=1&&num1<=9;

        for (num1=0; num1<=9;num1++){
            System.out.println(num1);
        }

        if (num2%num1==1.00) {
            System.out.println(num2);
        } else {
            System.out.println(num2+" Is not a prime number");
            System.out.println("********************");

            int x =4;
            int y = 5;
            double result = y*Math.sqrt(x);
            System.out.println("result = "+result);

        }
    }
}
