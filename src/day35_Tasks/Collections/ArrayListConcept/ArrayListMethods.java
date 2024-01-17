package day35_Tasks.Collections.ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {
    public static void main(String[] args) {

        String [] strArr = {"a","b","c","d"};
        ArrayList<String> ar1 = new ArrayList<>();

        ar1.add("Java");
        ar1.add("Python");
        ar1.add("ruby");
        ar1.add("javaScript");

        ArrayList<String> ar2 = new ArrayList<>(Arrays.asList("bvf","hyt","plk","DevOps","DevOps"));
        ar2.add("Testing");
        ar2.add("DevOps");
        ar2.add("WebDevelopment");

        ArrayList<String> ar3 = new ArrayList<>();
        ar3.add("ONE");
        ar3.add("two");
        ar3.add("four");
        ar3.add("five");

        ar3.addAll(2,ar2); // you can use addAll method from a given index


        ar1.addAll(ar2);// add another array as a collection type
        ar1.addAll(Arrays.asList(strArr)); // passing another array as a collection type
        System.out.println("ar1= "+ar1);
        System.out.println("ar3= "+ar3);
        System.out.println("ar2= "+ar2);
        System.out.println("******************");
        ar1.clear();
        System.out.println("ar1= "+ar1);

        System.out.println("*******************");

        ArrayList<String> cloneList = (ArrayList<String>)ar2.clone();
        System.out.println(cloneList);

        System.out.println("*******************");
        System.out.println(cloneList.contains("Testing"));
        System.out.println(cloneList.indexOf("DevOps"));
        int i = ar2.lastIndexOf("DevOps");
        System.out.println(i);

        ar2.remove("DevOps");
        System.out.println(ar2);
        ar2.remove("DevOps");
        System.out.println(ar2);
        ar2.remove("DevOps");
        System.out.println(ar2);
        ar2.remove("DevOps");
        System.out.println(ar2);

        System.out.println("*********************");
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(numbers);
        numbers.removeIf(p-> p%2==0);
        System.out.println(numbers);
        numbers.removeIf(p-> p%2!=0);
        System.out.println(numbers);

        System.out.println("********************");

        ArrayList<String> nameList = new ArrayList<>(Arrays.asList("a","b","c","a","d","a","t","a"));
        System.out.println(nameList);
        nameList.retainAll(Arrays.asList("a","b")); // use arrays.asList method if you have more than one object that you wish to retain
        nameList.retainAll(Collections.singleton("a"));// use Collections.singleton if you wish to retain single object
        System.out.println(nameList);

        System.out.println("*******************************");
        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,32,56,48,74,58,92,81,36,45,30));
        ArrayList<Integer> subList = new ArrayList<>(numbers1.subList(0,6)); // 6th index will be excluded
        System.out.println(subList);
        System.out.println("*******************************");

        ArrayList <String> newList = new ArrayList<>(Arrays.asList("one","two","three","four","five","six"));
        Object [] objects = newList.toArray();
        System.out.println(Arrays.toString(objects));
        for (Object each: objects) System.out.println(each);


    }
}
