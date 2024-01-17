package day26_Tasks;

import java.util.Arrays;

public class ArrayQuiz {
    public static void main(String[] args) {


//        char [] array = {'D','C','A','B'};
//        Arrays.sort(array);
//        for (char each :array){
//            System.out.println(each+" ");
//            if (each=='D'){
//                continue;
//            }
//        }
//
//        int arr [] = {1,2,3,4};
//        int i = 0;
//        do {
//            System.out.println(arr[i]+" ");
//            i++;
//        }while (i< arr.length-1);




//        String[] planets = {"Mercury","Venus","Earth","Mars"};
//        int x = planets.length;
//        int y = planets[1].length();
//        System.out.println(x+" "+y);




//        int[] intArr = {15,30,45,60,75};
//        intArr[2]=intArr[4];
//        intArr[4]=90;
//        System.out.println(Arrays.toString(intArr));



//        int[] n1 = new int[3];
//        int[] n2 = {1,2,3,4,5};
//        n1=n2;
//        for (int i =0; i<n1.length;i++){
//            System.out.print(n1[i]);
//        }



//        int[] arr = {1,2};
//        int arr1 [] = {1,2};
//        int wd = 0;
//        String [] days = {"sun","mon","wed","sat"};
//        for (int i = 0; i<days.length;i++){
//            switch (days[i]){
//                case "sat":
//                case "sun":
//                    wd-=1;
//                    break;
//                case "mon":
//                    wd++;
//                case "wed":
//                    wd+=2;
//            }
//        }
//        System.out.println(wd);


        int[] array = {1,3,2,8,63,1,4,7};


        for (int i = 0; i < array.length ; i++) {

            for (int j = i+1; j< array.length;j++)

                if (array[i] > array[j]) {
                   int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;


            }
        }
        System.out.println(Arrays.toString(array));

    }
}
