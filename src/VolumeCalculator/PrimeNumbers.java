package VolumeCalculator;

public class PrimeNumbers {
    public static void main(String[] args) {

        int num5 = 7;

        num5++;
        System.out.println(num5);
        num5++;
        System.out.println(num5);
        num5+=5;
        System.out.println(num5);
        num5 /=2;
        System.out.println(num5);
        num5*=3;
        System.out.println(num5);
        num5%=3;
        System.out.println(num5);
        num5+=10;
        System.out.println(num5);
        num5-=5;
        System.out.println(num5);
        num5 = num5-1;
        System.out.println(num5);
        //         -->5---50--49----44---
        num5 = ++num5 * 4 - --num5 -5 + ++num5 - --num5;
        System.out.println(num5);



    }
}
