package newFeatures.java5;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        //declaring an array
        int[] arr = {12, 13, 14, 44};
        //traversing the array with for-each loop
        for (int i : arr) {
            System.out.println(i);
        }

        int[] arr1 = {12, 13, 14, 44};
        int total = 0;
        for (int i : arr1) {
            total = total + i;
        }
        System.out.println("Total: " + total);

        //Creating a list of elements
        List<String> list = new ArrayList<>();
        list.add("vimal");
        list.add("sonoo");
        list.add("ratan");
        //traversing the list of elements using for-each loop
        for (String s : list) {
            System.out.println(s);
        }
    }
}

