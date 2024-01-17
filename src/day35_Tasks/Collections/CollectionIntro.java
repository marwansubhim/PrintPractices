package day35_Tasks.Collections;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionIntro {
    /*
    *List:  1- An ordered based collection
    *       2-Index based
    *       3- ArrayList, LinkedList
    *       4- Dynamic Array
    * Set: cannot have duplicate elements
    *
    * Queue: First In First Out
    *
    * Maps: stores data into key and value pair format
    *
    * Iterator: to iterate the elements from a collection
    *
    * Collection advantages:
    * 1- It reduces programming efforts
    * 2- Provides in-built methods and classes
    * 3-Optimized/ highly performance
    * 4-Increase productivity
    * 5-Reduce operational time
    * 6-Interoperability / re usability
    *
    * */
    /*
    Common methods:
    1-add();
    2-addAll();
    3-remove();
    4-removeAll();
    5-size();
    6-clear();
    7-contains();
    8-containsAll();
    9-retain();
    10-retainAll();
    11-removeIf(); predicate
     */

    /*
    * Common Exceptions:
    * NullPointerException
    * ClassCastException
    * IllegalArgumentException
    * IllegalStateException
    * UnSupportedOperationException
    *
    *
    * */
    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
    ConcurrentHashMap  concurrentHashMap = new ConcurrentHashMap();

}
