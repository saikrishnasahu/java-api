package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
//Creating and adding elements
        Set<String> set = new TreeSet<>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
//traversing elements
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        TreeSet<String> set2 = new TreeSet<>();
        set2.add("Ravi");
        set2.add("Vijay");
        set2.add("Ajay");
        System.out.println("Traversing element through Iterator in descending order");
        Iterator<String> i = set2.descendingIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        navigableSetOperation();
        sortedSetOperation();
        bookSetOperation();
    }

    private static void navigableSetOperation() {
        TreeSet<String> set = new TreeSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        System.out.println("Initial Set: " + set);

        System.out.println("Reverse Set: " + set.descendingSet());

        System.out.println("Head Set: " + set.headSet("C", true));

        System.out.println("SubSet: " + set.subSet("A", false, "E", true));

        System.out.println("TailSet: " + set.tailSet("C", false));
    }

    private static void bookSetOperation() {
        Set<Book> set = new TreeSet<Book>();
        //Creating Books
        Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
        Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        //Adding Books to TreeSet
        set.add(b1);
        set.add(b2);
        set.add(b3);
        //Traversing TreeSet
        for (Book b : set) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }

    private static void sortedSetOperation() {
        TreeSet<String> set = new TreeSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        System.out.println("Initial Set: " + set);

        System.out.println("Reverse Set: " + set.descendingSet());

        System.out.println("Head Set: " + set.headSet("C", true));

        System.out.println("SubSet: " + set.subSet("A", false, "E", true));

        System.out.println("TailSet: " + set.tailSet("C", false));
    }

    static class Book implements Comparable<collection.Book> {
        int id;
        String name, author, publisher;
        int quantity;

        public Book(int id, String name, String author, String publisher, int quantity) {
            this.id = id;
            this.name = name;
            this.author = author;
            this.publisher = publisher;
            this.quantity = quantity;
        }

        public int compareTo(collection.Book b) {
            if (id > b.id) {
                return 1;
            } else if (id < b.id) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}