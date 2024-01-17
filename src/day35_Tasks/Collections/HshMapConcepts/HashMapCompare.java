package day35_Tasks.Collections.HshMapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompare {

    public static void main(String[] args) {
        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(1,"A");
        map1.put(2,"B");
        map1.put(3,"C");
        HashMap<Integer,String> map2 = new HashMap<>();
        map2.put(3,"C");
        map2.put(1,"A");
        map2.put(2,"B");
        HashMap<Integer,String> map3 = new HashMap<>();
        map3.put(1,"A");
        map3.put(2,"B");
        map3.put(3,"C");
        map3.put(3,"D");
        //1- compare two hashMaps on the basis of key-value: use equal method:
        System.out.println(map1.equals(map2));//true
        System.out.println(map1.equals(map3));//false
        System.out.println("***********************************");
        //2- compare two hashMaps for the same keys: keySet();
        System.out.println(map1.keySet().equals(map2.keySet()));//true
        System.out.println(map1.keySet().equals(map3.keySet()));//true
        //3- find out the extra keys:
        HashMap<Integer,String> map4 = new HashMap<>();
        map4.put(1,"A");
        map4.put(2,"B");
        map4.put(3,"C");
        map4.put(4,"D");


        // combine the keys from both maps: using HashSet:
        HashSet<Integer> combineKeys = new HashSet<>(map1.keySet()); //Remember: HashSet can store only unique elements
        // add the keySet from map4
        combineKeys.addAll(map4.keySet());// its only going to add 4 since it does not accept duplicate values
        // now lets use the removeAll method of map1 which will remove all the common keySet between map1 and map4 and leave us the unique value
        combineKeys.removeAll(map1.keySet());// now the only extra key coming from map4 is [4]
        System.out.println(combineKeys);
        System.out.println("*****************");
        //4- compare maps by values
        HashMap<Integer,String> map5 = new HashMap<>();
        map5.put(1,"A");
        map5.put(2,"B");
        map5.put(3,"C");
        HashMap<Integer,String> map6 = new HashMap<>();
        map6.put(4,"A");
        map6.put(5,"B");
        map6.put(6,"C");
        HashMap<Integer,String> map7 = new HashMap<>();
        map7.put(1,"A");
        map7.put(2,"B");
        map7.put(3,"C");
        map7.put(4,"C");

        //1. Duplicates are allowed IN ArrayList
        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));
        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values())));
        System.out.println("**************************");
        //2. Duplicates are not allowed IN HashSet

        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values())));// true
        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values())));// true
        // Notice that both print statements will give us a true since hashSet can only store unique elements, no keys duplicates are allowed.
        System.out.println(map7);

    }
}
