package day35_Tasks.Collections.HshMapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapBasics {
    public static void main(String[] args) {

        // no order - no indexing
        // stores values -- key-value <k,v>
        // key can not be duplicate
        // its not thread sate, its not synchronized
        // we can not iterate through the hashMap because there is no indexing

        HashMap<String,String> capitalMap = new HashMap<>();
        capitalMap.put("Iraq","Baghdad");
        capitalMap.put("USA","Washington DC");
        capitalMap.put("UK","London");
        capitalMap.put("India","New Delhi");
        capitalMap.put("UK","German");// key can only take one value, therefore if we try to add another value to the same key
                                      // we would overwrite the old value
      //  capitalMap.put(null,"one");
       // capitalMap.put(null,"two");// key can store only one value

       // capitalMap.put("Russia",null);
       // capitalMap.put("Texas",null);

        System.out.println(capitalMap.get("USA")); // WE CAN GET THE VALUE BY PASSING THE KEY AND WE WILL GET THE VALUE
        System.out.println(capitalMap.get("Iraq"));
        System.out.println(capitalMap);
        capitalMap.remove("Russia"); // we can remove by passing the key value

        // Iterator, there are two types of iteration, one with the keys and another one with the value
        // iterator: over the keys: by passing keySet()
        Iterator<String> iterator = capitalMap.keySet().iterator();

        while (iterator.hasNext()){
            String key = iterator.next();
            String value = capitalMap.get(key);

            System.out.println("key = "+key+", value = "+value);
        }
        System.out.println("**************************");
        // Iterator: over the set(pair): by using entrySet
      Iterator<Map.Entry<String,String>> iterator1=  capitalMap.entrySet().iterator();
        while (iterator1.hasNext()){
         Map.Entry<String,String> entry= iterator1.next();
            System.out.println("key= "+entry.getKey()+", value="+entry.getValue());
        }

        System.out.println("*********************************");
        //Iterate hashMap using java 8 for each and lambda:

        capitalMap.forEach((k,v)-> System.out.println("key: "+k+", value: "+v));
        System.out.println("**********************************");
        capitalMap.forEach((k,v)-> {if (k.startsWith("I")){ System.out.println(v);}});

        System.out.println("**********************************************");

        HashMap<Integer,String> integerStringHashMap = new HashMap<>();
        integerStringHashMap.put(1,"a");
        integerStringHashMap.put(2,"b");
        integerStringHashMap.put(3,"c");
        integerStringHashMap.put(4,"d");
        integerStringHashMap.put(5,"e");
        integerStringHashMap.put(6,"f");
        integerStringHashMap.put(7,"g");

        integerStringHashMap.forEach((k,v)->{if (k%2==0){ System.out.println(v);}});//Excellent
        integerStringHashMap.forEach((k,v)->{if (v.equals("a")){ System.out.println(k+1);}});//Excellent
        System.out.println("****************************************************");

        HashMap<Integer,Character> intChar = new HashMap<>();

        for (int i = 0, j = 65; i<26 ; i++, j++){
            intChar.put(i,(char) j);
        }
        System.out.println(intChar);
        System.out.println("**************************************************************************");
        System.out.println();
        Iterator iterator2 = intChar.keySet().iterator();

        while (iterator2.hasNext()){

            System.out.print(iterator2.next()+" ");
        }

        System.out.println();
        System.out.println("******************************************************************************");
        System.out.println();

        Iterator<Integer> iterator3 = intChar.keySet().iterator();
        while (iterator3.hasNext()){
            int n = iterator3.next();
            System.out.print(intChar.get(n)+" ");
        }
        System.out.println();
        System.out.println("******************************************************************************");
        System.out.println();

        Iterator<Map.Entry<Integer, Character>> iterator4 = intChar.entrySet().iterator();

        while (iterator4.hasNext()){
            Map.Entry<Integer, Character> entry = iterator4.next();
            System.out.println("key: "+entry.getKey()+", value: "+entry.getValue());
        }

        intChar.forEach((k,v)->{
            if (k%2==0) System.out.println(v);
        });
        System.out.println("*******************************************************************************");

        intChar.forEach((k,v)->{if (v=='B') System.out.println(k);});



    }
}
