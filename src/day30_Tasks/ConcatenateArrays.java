package day30_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ConcatenateArrays {
    public static void main(String[] args) {

        // solution 1
        String[] strArr1 = {"a", "b", "c"};
        String[] strArr2 = {"d", "e", "f"};
        ArrayList<String> strings = new ArrayList<>(Arrays.asList(strArr1));
        strings.addAll(Arrays.asList(strArr2));
        System.out.println(strings);

        // solution 2
        String[] strings1 = new String[strArr1.length + strArr2.length];
        int j = 0;
        for (String each : strArr1) strings1[j++] = each;
        for (String each : strArr2) strings1[j++] = each;
        System.out.println(Arrays.toString(strings1));

        // solution 3
        String[] strings2 = new String[strArr1.length + strArr2.length];
        int k = 0;
        for (int i = 0; i < strArr1.length; i++, k++) {
            strings2[k] = strArr1[i];
        }
        for (int i = 0; i < strArr2.length; i++, k++) {
            strings2[k] = strArr2[i];
        }
        System.out.println(Arrays.toString(strings2));

        //solution 4
        ArrayList<String> arrList = new ArrayList<>();

        for (String each : strArr1) arrList.add(each);
        for (String each : strArr2) arrList.add(each);
        System.out.println(arrList);

        // solution 5
        ArrayList<String> arrList1 = new ArrayList<>();
        for (int i = 0; i < strArr1.length; i++) {
            arrList1.add(strArr1[i]);
        }
        for (int i = 0; i < strArr2.length; i++) {
            arrList1.add(strArr2[i]);
        }
        System.out.println(arrList1);

    }
}






//        ArrayList<Integer> list = new ArrayList<>();
//
//        char[] chArr1 = {'a', 'b', 'j'};
//        char[] chArr2 = {'w', 'e', 'r'};
//        Character[] newArr = new Character[chArr1.length+chArr2.length];
//        int j = 0;
//        for (int i = 0; i <chArr1.length ; i++){
//            newArr[j++] = Character.valueOf(chArr1[i]);
//        }
//        for (int i = 0; i <chArr1.length ; i++){
//            newArr[j++] = Character.valueOf(chArr2[i]);
//        }
//
//        System.out.println(Arrays.toString(newArr));
//
//        ArrayList<Character> charList = new ArrayList<>(Arrays.asList(newArr));
//        System.out.println(charList);

//
//        for (int each :arr1) list.add(each);
//        for (int each: arr2) list.add(each);
//        System.out.println(list);


//        int[] arr3 = new int[arr1.length+arr2.length];
//
//        int  j =0;
//        for (int i  = 0; i<arr1.length; i++){
//            arr3[j++] = arr1[i];
//        }
//        for (int i  = 0; i<arr2.length; i++){
//            arr3[j++] = arr2[i];
//        }
//        System.out.println(Arrays.toString(arr3));



