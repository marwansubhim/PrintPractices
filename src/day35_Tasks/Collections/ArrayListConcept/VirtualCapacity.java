package day35_Tasks.Collections.ArrayListConcept;

import java.util.ArrayList;

public class VirtualCapacity {
    public static void main(String[] args) {

        ArrayList<Object> ar = new ArrayList(20);
        // default Virtual capacity of arrayList is 10, from index 0 to index 9
        // Physical capacity is 0
        System.out.println(ar.size()); // PC = 0;
        ar.add(100);
        System.out.println(ar.size()); // PC = 1;

        ar.add(25);
        ar.add(65);
        ar.add(78);
        System.out.println(ar.size()); // PC = 1;



    }
}
