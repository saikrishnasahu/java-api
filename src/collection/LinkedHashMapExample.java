package collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

class LinkedHashMapExample {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> hm = new java.util.LinkedHashMap<>();

        hm.put(100, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");

        for (Entry<Integer, String> m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        //Fetching key
        System.out.println("Keys: " + map.keySet());
        //Fetching value
        System.out.println("Values: " + map.values());
        //Fetching key-value pair
        System.out.println("Key-Value pairs: " + map.entrySet());

        Map<Integer, String> map2 = new LinkedHashMap<>();
        map2.put(101, "Amit");
        map2.put(102, "Vijay");
        map2.put(103, "Rahul");
        System.out.println("Before invoking remove() method: " + map2);
        map2.remove(102);
        System.out.println("After invoking remove() method: " + map2);
    }
}  