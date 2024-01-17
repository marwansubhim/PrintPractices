package day35_Tasks.Collections.ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void main(String[] args) {
        // default class
        // dynamic array

        // Regular fixed size array
        /*
        int[] i = new int[4];

        i[0] = 100;
        i[4] = 5;
        System.out.println(i[0]);
        System.out.println(i[4]);

         */

        ArrayList <Object> ar = new ArrayList();

        ar.add(25);
        ar.add(2.5);
        ar.add(true);
        ar.add("Hello");
        ar.add('M');
        //System.out.println(ar.get(-1));
        // negative indexing and outsize indexing is not allowed in both static and dynamic array
        // exception: .ArrayIndexOutOfBoundsException

        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(2,5,6,4,8,9));
        System.out.println(integerArrayList);
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("python","PHP","C#","JS"));
        System.out.println(stringArrayList);
        int count = 0;
      integerArrayList.stream().forEach(p->{if (p%2==0){
          System.out.println(p);
      }});
        System.out.println("*****************");
      integerArrayList.forEach(p->{if (p%2!=0){
          System.out.println(p);
      }});



    }
}
