package day25_Tasks;

import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int arr2D[][] = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };

        for (int i =0; i< arr2D.length;i++){
            System.out.println(Arrays.toString(arr2D[i]));
        }
        System.out.println("=========================");
        for (int i = arr2D.length-1; i>=0;i--){
            System.out.println(Arrays.toString(arr2D[i]));
        }
        System.out.println("=========================");

        for (int k =0; k<arr2D.length;k++){
            int [] descending = arr2D[k];
            int [] des2 = new int[descending.length];
            for (int i = descending.length-1,j=0; i>=0;i--,j++){
                des2 [j] = descending[i];
            } System.out.println(Arrays.toString(des2));
        }

        System.out.println("*********************************");

        for (int k = arr2D.length-1; k>=0;k--){
            int [] descending = arr2D[k];
            int [] des2 = new int[descending.length];
            for (int i = descending.length-1,j=0; i>=0;i--,j++){
                des2 [j] = descending[i];
            } System.out.println(Arrays.toString(des2));
        }

    }
}
