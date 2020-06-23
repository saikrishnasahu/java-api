package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        //Elements can traverse in any order
        for (Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(100, "Amit");
        map2.put(101, "Vijay");
        map2.put(102, "Rahul");
        //Returns a Set view of the mappings contained in this map
        map2.entrySet()
                //Returns a sequential Stream with this collection as its source
                .stream()
                //Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByKey())
                //Performs an action for each element of this stream
                .forEach(System.out::println);

        Map<Integer, String> map3 = new HashMap<Integer, String>();
        map3.put(100, "Amit");
        map3.put(101, "Vijay");
        map3.put(102, "Rahul");
        //Returns a Set view of the mappings contained in this map
        map3.entrySet()
                //Returns a sequential Stream with this collection as its source
                .stream()
                //Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByValue())
                //Performs an action for each element of this stream
                .forEach(System.out::println);
    }
}  