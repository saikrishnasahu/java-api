package collection;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(100, "Amit");
        map.put(102, "Ravi");
        map.put(101, "Vijay");
        map.put(103, "Rahul");

        for (Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        TreeMap<Integer, String> map1 = new TreeMap<>();
        map1.put(100, "Amit");
        map1.put(102, "Ravi");
        map1.put(101, "Vijay");
        map1.put(103, "Rahul");
        System.out.println("Before invoking remove() method");
        for (Entry<Integer, String> m : map1.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        map1.remove(102);
        System.out.println("After invoking remove() method");
        for (Entry<Integer, String> m : map1.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        navigableSetOperation();
        sortedSetOperation();
    }

    private static void navigableSetOperation() {
        NavigableMap<Integer, String> map = new TreeMap<>();
        map.put(100, "Amit");
        map.put(102, "Ravi");
        map.put(101, "Vijay");
        map.put(103, "Rahul");
        //Maintains descending order
        System.out.println("descendingMap: " + map.descendingMap());
        //Returns key-value pairs whose keys are less than or equal to the specified key.
        System.out.println("headMap: " + map.headMap(102, true));
        //Returns key-value pairs whose keys are greater than or equal to the specified key.
        System.out.println("tailMap: " + map.tailMap(102, true));
        //Returns key-value pairs exists in between the specified key.
        System.out.println("subMap: " + map.subMap(100, false, 102, true));
    }

    private static void sortedSetOperation() {
        SortedMap<Integer, String> map = new TreeMap<>();
        map.put(100, "Amit");
        map.put(102, "Ravi");
        map.put(101, "Vijay");
        map.put(103, "Rahul");
        //Returns key-value pairs whose keys are less than the specified key.
        System.out.println("headMap: " + map.headMap(102));
        //Returns key-value pairs whose keys are greater than or equal to the specified key.
        System.out.println("tailMap: " + map.tailMap(102));
        //Returns key-value pairs exists in between the specified key.
        System.out.println("subMap: " + map.subMap(100, 102));
    }
}  