package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        System.out.println("Traversing list through Iterator:");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Traversing list through for-each loop:");
        for (String name : list)
            System.out.println(name);

        System.out.println("Traversing list through for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("Traversing list through forEach() method:");
        //The forEach() method is a new feature, introduced in Java 8.
        list.forEach(a -> { //Here, we are using lambda expression
            System.out.println(a);
        });

        System.out.println("Traversing list through forEachRemaining() method:");
        itr = list.iterator();
        itr.forEachRemaining(a -> {//Here, we are using lambda expression
            System.out.println(a);
        });

        //accessing the element
        System.out.println("Returning element: " + list.get(1));//it will return the 2nd element, because index starts from 0

        //changing the element
        list.set(1, "David");
        //Traversing list
        for (String name : list)
            System.out.println(name);

        //Sorting the list
        Collections.sort(list);
        //Traversing list through the for-each loop
        for (String name : list)
            System.out.println(name);

        //Removing specific element from arraylist
        list.remove("Vijay");
        System.out.println("After invoking remove(object) method: " + list);
        //Removing element on the basis of specific position
        list.remove(0);
        System.out.println("After invoking remove(index) method: " + list);

//        Creating user-defined class objects
        Student s1 = new Student(101, "Sonoo", 23);
        Student s2 = new Student(102, "Ravi", 21);
        Student s3 = new Student(103, "Hanumat", 25);
        //creating arraylist
        ArrayList<Student> al = new ArrayList<>();
        al.add(s1);//adding Student class object
        al.add(s2);
        al.add(s3);
        //Getting Iterator
        Iterator<Student> itr1 = al.iterator();
        //traversing elements of ArrayList object
        while (itr1.hasNext()) {
            Student st = itr1.next();
            System.out.println(st.rollNo + " " + st.name + " " + st.age);
        }


    }

    static class Student {
        int rollNo;
        String name;
        int age;

        Student(int rollNo, String name, int age) {
            this.rollNo = rollNo;
            this.name = name;
            this.age = age;
        }
    }
}
