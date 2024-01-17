package day35_Tasks.Collections.SetConcept;

import java.util.*;
import java.util.stream.IntStream;

public class SetIntro {
    /*

    A major limitation of both linked and array lists is that searching them takes a
    long time. Generally, if you want to search a list, you have to look at each
    element sequentially to see whether you've found the target. This can take a
    long time for a large list.
    Another limitation of lists is that it's not easy to prevent a list from storing
    duplicate values. In many cases this isn't a problem, but if, for example, you
    are storing a collection to count the number of unique words in a book, you
    don't want any duplicates to exist. To prevent duplicates in a list, you have to
    sequentially search the list every time you add to it, in order to make sure you
    aren't adding a word that's already present.
    When you want to maintain a collection of elements that can be searched
    quickly and that prevents duplicates, you're better off using another abstract
    data type called a set.

    Set:
    A collection that cannot contain duplicates.
    The Set collection is very much like the mathematical notion of a set. Sets do
    not support all the operations you can perform on lists (namely, any operation
    that requires an index), but they do offer the benefits of fast searching and
    effortless elimination of duplicates.

    The two primary implementations of the Java Collections Framework's Set
    interface are called HashSet and TreeSet.HashSet is the general-purpose set
    class, whereas TreeSet offers a few advantages that will be discussed later. If
    you wanted to store a set of String values, you could write code like the
    following:
    Set<String> stooges = new HashSet<String>();
    stooges.add("Larry");
    stooges.add("Moe");
    stooges.add("Curly");
    stooges.add("Moe"); // duplicate, won't be added
    stooges.add("Shemp");
    stooges.add("Moe"); // duplicate, won't be added


    * Set interface extends Collection
    * SortedSet interface extends Set interface
    * HashSet Class implements SortedSet interface and extends Abstract Class
    * LinkedHashSet class extends HashSet Class
    * AbstractSet class implements Set interface
    * TreeSet extends AbstractSet
    * EnumSet extends AbstractSet
    * CopyOnWriteArraySet class extends AbstractSet
    *
    *
    *
    * */

    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();
        hs.add("Marwan");
        hs.add("Ali");
        hs.add("Hello");
        hs.add("Marwan");
        hs.add("Miray");
        //  hs.add(null);

        System.out.println(hs);
        //  for (String each: hs) each.
        /*
        for (int i = 0; i<hs.size() ; i++){
            hs.
        }

         */ //typical for loop won't give you access to the elements
        // the only way we can iterate through the elements is using the Iterator.
        Iterator<String> it = hs.iterator();
        while (it.hasNext()) {
            if (it.next().endsWith("n")) System.out.println(it.next());

        }

        // common methods from java collections
        int num = hs.size();
        hs.add("x");
        hs.addAll(Arrays.asList("a", "b", "c"));
        boolean isContain = hs.contains("x");
        hs.remove("a");
        hs.equals("x");
        hs.containsAll(Arrays.asList("c","d","f"));
        hs.isEmpty();
        hs.removeAll(Arrays.asList("j","p","w"));
        hs.retainAll(Arrays.asList("z","a","e"));
        hs.removeIf(p->p.length()==5);
        hs.toArray();
        hs.clear();
        Random random = new Random();
        IntStream intStream = random.ints(5,50,150);
        intStream.forEach(p-> System.out.println(p));
        System.out.println("**********************************************");
        int i = 0;
        while (i<10){
            System.out.println(random.nextInt(60));
            i++;
        }

        /*
        * One of the most important benefits of using a Set such as HashSet is that it
        can be searched incredibly quickly. Recall that the contains method of an
        ArrayList or LinkedList must examine every element of the list in order
        until it finds the target value. By contrast, the contains method of a HashSet
        is implemented in such a way that it often needs to examine just one element,
        making it a much more efficient operation.
        *
        *
        * *********************************************************************************
        * A HashSet is implemented using a special internal array called a hash table
        that places elements into specific positions based upon integers called hash
        codes. (Every Java object has a hash code that can be accessed through its
        hashCode method.)
        *
        * */







    }
}
