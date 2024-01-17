package day35_Tasks.Collections.SetConcept;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


/*
* Set operation    Method             Description
union              addAll            Set of all elements that are in A, B, or both
intersection       retainAll         Set of all elements that are in both A and B
difference         removeAll         Set of all elements that are in A but not in B
superset,subset    containsAll       Returns true if A is a superset of (contains all elements of) B
* */


/*
* Collection                Strengths
HashSet :                   Extremely fast performance for add, contains, and remove tasks
                            Can be used with any type of objects as its elements


TreeSet :                   Elements are stored in sorted order
                            Must be used with elements that can be compared (such as Integer, String)
* */
public class SetPractice {
    public static void main(String[] args) {

        Set<Integer> first = new HashSet<>();
        first.addAll(Arrays.asList(1,3,4,5,6,8,9,10));
        Set<Integer> second = new HashSet<>();
        second.addAll(Arrays.asList(1,3,5,6,7,9));

        // Get the union:
        Set<Integer> union = new HashSet<>(first);
        union.addAll(second);
        System.out.println(union);

        System.out.println("************************");

        // get the intersection:

        Set<Integer> intersection = new HashSet<>(first);
        intersection.retainAll(second);
        System.out.println(intersection);

        System.out.println("***************************");

        // get the difference
        Set<Integer> diff = new HashSet<>(first);
        diff.removeAll(second);
        System.out.println(diff);

    }
}
