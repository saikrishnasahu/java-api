package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {

        List<String> al = new ArrayList<>();
        al.add("Viru");
        al.add("Saurav");
        al.add("Mukesh");
        al.add("Tahir");

        Collections.sort(al);
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

//        reverse order
        Collections.sort(al, Collections.reverseOrder());
        Iterator<String> i = al.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(101, "Vijay", 23));
        students.add(new Student(106, "Ajay", 27));
        students.add(new Student(105, "Jai", 21));

        System.out.println("Default Sorting by Roll No");
        Collections.sort(students);
        for (Student st : students) {
            System.out.println(st.rollNo + " " + st.name + " " + st.age);
        }

        System.out.println("Sorting by Name");

        Collections.sort(students, new NameComparator());
        for (Student st : students) {
            System.out.println(st.rollNo + " " + st.name + " " + st.age);
        }

        System.out.println("Sorting by age");

        Collections.sort(students, new AgeComparator());
        for (Student st : students) {
            System.out.println(st.rollNo + " " + st.name + " " + st.age);
        }

    }


}

class AgeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.age, s2.age);
    }
}

class Student implements Comparable<Student> {
    int rollNo;
    String name;
    int age;

    Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return this.rollNo - o.rollNo;
    }
}

class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}
