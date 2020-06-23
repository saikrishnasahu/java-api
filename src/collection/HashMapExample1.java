package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();//Creating HashMap
        map.put(1, "Mango");  //Put elements in Map
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(4, "Grapes");

        System.out.println("Iterating Hashmap...");
        for (Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        removeExample();
        replaceExample();
    }

    private static void removeExample() {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        map.put(103, "Gaurav");
        System.out.println("Initial list of elements: " + map);
        //key-based removal
        map.remove(100);
        System.out.println("Updated list of elements: " + map);
        //value-based removal
        map.remove(101);
        System.out.println("Updated list of elements: " + map);
        //key-value pair based removal
        map.remove(102, "Rahul");
        System.out.println("Updated list of elements: " + map);
    }

    private static void replaceExample() {

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(100, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");
        System.out.println("Initial list of elements:");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("Updated list of elements:");
        hm.replace(102, "Gaurav");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("Updated list of elements:");
        hm.replace(101, "Vijay", "Ravi");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("Updated list of elements:");
        hm.replaceAll((k, v) -> "Ajay");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}