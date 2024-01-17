package InterviewQuestions.InterviewQuestions2;

import java.util.ArrayList;
import java.util.Arrays;

public class FibonacciNumber {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21 .....
        int number = 10;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for (int i = 2; i<=number; i++){
           list.add(list.get(i-1)+list.get(i-2));
        }
        for (Integer each: list) System.out.print(each+" ");
        System.out.println();
        System.out.println(list);


        System.out.println("***************************");

        int[] intArr = new int[number+1];

        intArr[0] = 0;
        intArr[1] = 1;

        for (int i = 2; i<=number ; i++){
            intArr[i] = intArr[i-2] + intArr[i-1];
        }
        System.out.println(Arrays.toString(intArr));
    }
}
