package day26_Tasks;

import java.util.Arrays;

public class ArraysExample1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
       // System.out.println(Arrays.toString(removeIndex(arr,5)));
        int [] arr2 = removeIndex(removeIndex(arr,1),3);
        System.out.println(Arrays.toString(arr2));
        //multiplicationTable(10,10);

    }
    public static int[] removeIndex(int[] arr, int removeIndex){
        int[] newArr = new int[arr.length-1];
        if (removeIndex>0&&removeIndex< arr.length-1){
            for (int i =removeIndex;i<arr.length-1;i++) {

                arr[i] = arr[i + 1];
                for (int j =0; j<newArr.length;j++){
                    newArr[j] = arr[j];
                }
                return newArr;
            }
        } else System.err.print("invalid index, old array is : ");
        return arr;


    }

    public static void multiplicationTable(int x, int y){
        int [] arr1 = new int[y];
        for (int i =0; i<arr1.length ;i++){
            arr1[i] = i+1;
        }

        for (int i =1; i<=x; i++){
            for (int j = 0; j< arr1.length ; j++){
                System.out.print(i * arr1[j]+" ");
            }
            System.out.println();


        }
    }


    
}
