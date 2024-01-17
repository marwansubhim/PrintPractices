package day35_Tasks.Collections.ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {
    public static void main(String[] args) {

        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Mahdi");
        studentList.add("Manara");
        studentList.add("Majd");
        studentList.add("Marwan");
        // for loop
        for (int  i = 0; i<studentList.size(); i++){
            System.out.println(studentList.get(i));
        }

        System.out.println("**********************");
        //for each
        for (String each: studentList) System.out.println(each);

        System.out.println("**********************");
        // streams with Lambda
        studentList.stream().forEach(p-> System.out.println(p));

        //Iterator
        System.out.println("***************************");
        Iterator <String> it = studentList.iterator();
        while (it.hasNext()) System.out.println(it.next());

        /*
        * foreach() loop	stream().foreach() loop	parallelStream().foreach() loop
Lambda operators is not used	Lambda operator is used	Lambda operator is used
Can be used to access arrays and collections	Can access collections only	Can access collections only
The return or control statements work within the loop	The return or control statements don’t work within the loop	The return or control statements don’t work within the loop
No multithreading thus slow data is in sequence	No multithreading thus slow data is in sequence	It is multithreaded thus very fast and sequence is different
        * */

    }
}
