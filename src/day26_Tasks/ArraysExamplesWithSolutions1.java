package day26_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysExamplesWithSolutions1 {
    public static void main(String[] args) {
        String str = "01100001";
        String[] arr = str.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        ArrayList<Integer> intArrList = new ArrayList<>();
        for (int i = 0; i<list.size(); i++){
            intArrList.add(Integer.parseInt(list.get(i)));
        }
        String newStr = "";
        int sum = 0;

//
//        for (int i =0; i<=intArrList.size()-1; i++){
//            sum+= intArrList.get((int) Math.pow(2,i));
//        }
//        for (int each : intArrList){
//            sum+= Math.pow()
//        }
        System.out.println(Math.pow(2,3));
        String str2 = "abc";
        System.out.println(str2.indexOf("b"));

    }
}
