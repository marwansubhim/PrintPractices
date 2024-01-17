package day35_Tasks.Collections.ArrayListConcept;

import java.util.ArrayList;

public class GenericArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList= new ArrayList<Integer>();
        integerArrayList.add(2);
        integerArrayList.add(65);
        ArrayList<Double> doubleArrayList = new ArrayList<Double>();

        doubleArrayList.add(10.5);
        doubleArrayList.add(12.6);

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Marwan");
        stringArrayList.add("Mahdi");

        //Remember arrayList can only accept reference type, not primitives
    }
}
