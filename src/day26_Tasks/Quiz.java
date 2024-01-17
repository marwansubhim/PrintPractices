package day26_Tasks;

import java.util.Arrays;

public class Quiz {
    public static void main(String[] args) {

        int num =5;
        while (isAvailable(num)){
            System.out.print(num);
            num--;
        }


    }
    public static boolean isAvailable(int num){
        return (num-->0)? true:false;

//        int x =7;
//        if (available(x)){
//            System.out.println("java se");
//        }else {
//            System.out.println("java ee");
//        }
//
//
//
//
//    }
//    public static boolean available(int x){
//        return x>1? true:false;
    }
    public static void main(int[] args){
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
    }

}
