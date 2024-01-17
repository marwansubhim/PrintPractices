package day26_Tasks;

import java.util.Arrays;

public class ArrayPractice1 {
    public static void main(String[] args) {
        /*

         Write a Java program to arrange the elements of a given array of integers
          where all negative integers appear before all the positive integers.
         */
        int[] arr = {-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j] < 0 && arr[j - 1] > 0; j--) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));

         /*

         Write a Java program to arrange the elements of a given array of integers
          where all positive integers appear before all the negative integers.
         */

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j] > 0 && arr[j - 1] < 0; j--) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));


    }
}
