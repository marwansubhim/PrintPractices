package day35_Tasks.Collections.ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1,1,1,2,2,3,4,5,6,6,6,7,8,9,9,9));
        //1. LinkedHashSet; this class will accept only unique keys element, no duplicates are allowed

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(integers);
        ArrayList<Integer> numberWithoutDuplicates = new ArrayList<>(linkedHashSet);
        System.out.println(linkedHashSet);

        //2. JDK 8 - stream
        ArrayList<Integer> marks = new ArrayList<>(Arrays.asList(1,1,1,2,2,3,4,5,6,6,6,5,20,36,52,14,14,74,12,7,8,9,9,9));
        List<Integer> list = marks.stream().distinct().collect(Collectors.toList());
        System.out.println(list);
    }
}
