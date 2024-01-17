package day35_Tasks.Collections.HshMapConcepts;

import java.util.*;


public class HashMapConcept {
    public static void main(String[] args) {
        // Hash map is an associative array data structure that stores data in the form of key-value pair format
        // HashCode of null is always zero
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Naveen",100);
        marks.put("Tom",200);
        marks.put("Lisa",300);
        marks.put("Peter",400);
        marks.put("Robby",600);

        marks.put(null,500);
        marks.put(null,700);
        marks.put("Nav",900);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(70);

        List<String > strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("three");
        hashSet.add("four");

        LinkedList <Integer> linkedList = new LinkedList<>();
        linkedList.add(52);
        linkedList.add(78);


    }
}
