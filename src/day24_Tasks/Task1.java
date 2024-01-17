package day24_Tasks;

import java.util.Arrays;

/*
1. write a program that cna sort an array of integers in descending
				int[] arr = {5,1,2,6,7, 0};
				output:
					7 6 5 2 1 0
					output:
						[7, 6, 5, 2, 1, 0]
 */
public class Task1 {
    public static void main(String[] args) {

        int[] arr = {5,1,2,6,7,0};

        Arrays.sort(arr);
        int [] descending = new int[arr.length];
        for (int i =arr.length-1,j=0; i>=0;i--,j++){
           descending[j] = arr[i];
        }
        System.out.println(Arrays.toString(descending));
    }
}
