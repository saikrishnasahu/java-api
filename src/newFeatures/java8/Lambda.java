package newFeatures.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

// without functional interface
interface Drawable1 {
    void draw();
}

@FunctionalInterface
        //It is optional
interface Drawable2 {
    //    without arguments
    void draw();
}

@FunctionalInterface
interface Sayable1 {
    //    single argument
    String say(String name);
}

@FunctionalInterface
interface Addable {
    //    double arguments
    int add(int a, int b);
}

@FunctionalInterface
interface Sayable2 {
    String say(String message);
}

public class Lambda {
    public static void main(String[] args) {
        int width = 10;

        //without lambda, Drawable implementation using anonymous class
        Drawable1 d1 = new Drawable1() {
            public void draw() {
                System.out.println("Drawing " + width);
            }
        };
        d1.draw();

        //with lambda
//        without arguments
        Drawable2 d2 = () -> {
            System.out.println("Drawing " + width);
        };
        d2.draw();

        // Lambda expression with single parameter.
        Sayable1 s1 = (name) -> {
            return "Hello, " + name;
        };
        System.out.println(s1.say("Sonoo"));

        // You can omit function parentheses
        Sayable1 s2 = name -> {
            return "Hello, " + name;
        };
        System.out.println(s2.say("Sonoo"));

        // Multiple parameters in lambda expression
        Addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(10, 20));

        // Multiple parameters with data type in lambda expression
        Addable ad2 = (int a, int b) -> (a + b);
        System.out.println(ad2.add(100, 200));

        // Lambda expression with return keyword.
        Addable ad3 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(ad3.add(100, 200));

        List<String> list = new ArrayList<>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");

        list.forEach((n) -> System.out.println(n));

        // You can pass multiple statements in lambda expression
        Sayable2 person = (message) -> {
            String str1 = "I would like to say, ";
            String str2 = str1 + message;
            return str2;
        };
        System.out.println(person.say("time is precious."));

        //Thread Example without lambda
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("Thread1 is running...");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
        //Thread Example with lambda
        Runnable r2 = () -> {
            System.out.println("Thread2 is running...");
        };
        Thread t2 = new Thread(r2);
        t2.start();

        List<Product> list1 = new ArrayList<Product>();

        //Adding Products
        list1.add(new Product(1, "HP Laptop", 25000f));
        list1.add(new Product(3, "Keyboard", 300f));
        list1.add(new Product(2, "Dell Mouse", 150f));

        System.out.println("Sorting on the basis of name...");

        // implementing lambda expression
        Collections.sort(list1, (p1, p2) -> {
            return p1.name.compareTo(p2.name);
        });
        for (Product p : list1) {
            System.out.println(p.id + " " + p.name + " " + p.price);
        }

        // using lambda to filter data
        Stream<Product> filtered_data = list1.stream().filter(p -> p.price > 20000);

        // using lambda to iterate through collection
        filtered_data.forEach(
                product -> System.out.println(product.name + ": " + product.price)
        );

    }
}

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
}
