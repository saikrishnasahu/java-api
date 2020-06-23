package collection;

import java.util.Hashtable;
import java.util.Map.Entry;

class HashtableExample {
    public static void main(String[] args) {
        Hashtable<Integer, String> hm = new Hashtable<>();

        hm.put(100, "Amit");
        hm.put(102, "Ravi");
        hm.put(101, "Vijay");
        hm.put(103, "Rahul");

        for (Entry<Integer, String> m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        //Here, we specify the if and else statement as arguments of the method
        System.out.println(hm.getOrDefault(101, "Not Found"));
        System.out.println(hm.getOrDefault(105, "Not Found"));

        //Inserts, as the specified pair is unique
        hm.putIfAbsent(104, "Gaurav");
        System.out.println("Updated Map: " + hm);
        //Returns the current value, as the specified pair already exist
        hm.putIfAbsent(101, "Vijay");
        System.out.println("Updated Map: " + hm);

        Hashtable<Integer, String> map = new Hashtable<>();
        map.put(100, "Amit");
        map.put(102, "Ravi");
        map.put(101, "Vijay");
        map.put(103, "Rahul");
        System.out.println("Before remove: " + map);
        // Remove value for key 102
        map.remove(102);
        System.out.println("After remove: " + map);
    }
}  