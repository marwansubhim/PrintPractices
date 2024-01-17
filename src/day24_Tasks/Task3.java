package day24_Tasks;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int[] numbers = {10,2,4,3,9,17};

        int[] descending =new int[numbers.length];

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        for (int i =numbers.length-1, j = 0; i>=0;i--,j++){
            descending[j]=numbers[i];
        }
        System.out.println(Arrays.toString(descending));
        System.out.println("==========================");
        int countEven = 0;
        int countOdd = 0;
        int sum = 0;
        for (int i =0; i<=numbers.length-1; i++){
            sum+=numbers[i];
            if (numbers[i]%2==0) countEven++;
           else countOdd++;

        }
        System.out.println("average "+sum/numbers.length);
        System.out.println("Even: "+countEven);
        System.out.println("Odd = " + countOdd);

    }
}
