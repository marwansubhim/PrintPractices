package day26_Tasks;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
//
//        int [] arr = {1,2,3,4,5,6};
//        int [] arr1 = new int[arr.length];
//        int j =0;
//        for (int i = arr.length-1; i>=0 ;i--){
//            arr1[j++]=arr[i];
//        }
//        System.out.println(Arrays.toString(arr1));
        // OptionalDouble n = Arrays.stream(new int[]{6,7,8,5,6}).average();
        // System.out.println(Arrays.stream(new int[]{6,7,8,5,6}).max());
//
//        int [] arr100 = new int[100];
//        int [] arr10 = new int[10];
//        System.out.println(Arrays.toString(arr100));
//        System.out.println(Arrays.toString(arr10));
//        arr100 =arr10;
//        System.out.println("new "+Arrays.toString(arr100));


//        Arrays.sort(linear);

//        for (int i = 0; i< linear.length; i++){
//            for (int j = i; j<linear.length;j++){
//                if (linear[i]>linear[j]){
//                    int temp = linear[i];
//                    linear[i] = linear[j];
//                    linear[j] = temp;
//                }
//            }
//        }

        int [] rrr = {1,2,3,5};
        for (int i =0; i< rrr.length/2; i++){
            int temp = rrr[i];
            rrr[i] = rrr[rrr.length-1-i];
            rrr[rrr.length-1-i] = temp;

        }
        System.out.println(Arrays.toString(rrr));





        for (int i = 1; i <11; i++) {
            for (int j = 1; j < 11; j++) {

                System.out.print(i*j+" ");

            }
            System.out.println();
        }

        int[] linear = {4, 3, 2, 5, 8, 6, 14};
        for (int i = 0;i<linear.length;i++){
            for (int j = i; j<linear.length ; j++){
                if (linear[i]>linear[j]){
                    int temp = linear[i];
                    linear[i]=linear[j];
                    linear[j]=temp;
                }
            }


        }
        System.out.println(Arrays.toString((linear)));
        int i = Integer.MIN_VALUE;
        //System.out.println(i);


    }

    public static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] doInsertionSort(int[] input) {

        int temp;
        for (int i = 1; i < input.length; i++) {
            for (int j = i; j > 0; j--) {
                if (input[j] < input[j - 1]) {
                    temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                }
            }
        }
        return input;
    }


}
