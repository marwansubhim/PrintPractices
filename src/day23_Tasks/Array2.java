package day23_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("how many numbers would you like to enter?");
        int  length = in.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i<numbers.length; i++){
            System.out.println("enter a number");
            numbers [i] = in.nextInt();
        }
        int min = numbers[0];
        int max = numbers[0];

        for (int i =0; i<numbers.length; i++){
//
            if (min<numbers[i]){
                min = numbers[i];
            }
            if (max>numbers[i]){
                max = numbers[i];
            }
        }
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        int[] descending = new int[length];
        for (int i = numbers.length-1, j=0; i>=0; i--, j++){
            descending[j] = numbers[i];
        }
        System.out.println(Arrays.toString(descending));


    }
}
