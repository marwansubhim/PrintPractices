package day35_Tasks.Collections.ArrayListConcept;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {
    /*
    ArrayList is not synchronized by defaults therefore it is not a thread safe
    there is a way to make array list synchronized or thread safe is by converting it to be safe using two methods
    1- Collections.synchronizedList() method, ---> will return synchronized list
    2- copyOnWriteArrayList- class- Thread Safe variant of ArrayList

     */

    public static void main(String[] args) {
        // how to synchronize arrayList to be a thread safe
        //1- by using Collections.synchronizedList
     List<String> nameList=  Collections.synchronizedList(new ArrayList<String>());
     nameList.add("Java");
     nameList.add("Python");
     nameList.add("Ruby");
     // add, remove---> we do not need synchronization
     // to fetch/traverse the values from this list---> we have to use explicit synchronization
        synchronized (nameList){
            Iterator<String> it = nameList.iterator();

            while (it.hasNext()){
                System.out.println(it.next());
            }

        }
        System.out.println(nameList.get(0));

        //2- by using CopyOnWriteArrayList CLASS, in JDK
        CopyOnWriteArrayList<String> employeeList = new CopyOnWriteArrayList<>();
        employeeList.add("Tom");
        employeeList.add("John");
        employeeList.add("Jack");
        // We don't need explicit synchronization for those operation: add / remove / traverse(loop)
        Iterator<String> it = employeeList.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
