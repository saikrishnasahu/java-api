package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsBasics {
    public static void main(String[] args) {
//        Without Generics, we can store any type of objects.
        List list = new ArrayList();
        list.add(10);
        list.add("10");

//        With Generics, it is required to specify the type of object we need to store.
        List<Integer> newList = new ArrayList<Integer>();
        newList.add(10);
//        newList.add("10");// compile-time error

//        Before Generics, we need to type cast.
        List list2 = new ArrayList();
        list.add("hello");
        String s = (String) list.get(0);//typecasting

//        After Generics, we don't need to typecast the object.
        List<String> newList2 = new ArrayList<>();
        newList2.add("hello");
        String newS = newList2.get(0);

//        Compile-Time Checking
        List<String> list3 = new ArrayList<String>();
        list3.add("hello");
//        list3.add(32);//Compile Time Error
    }
}
