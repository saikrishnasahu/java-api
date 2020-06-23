package newFeatures.java8;

import java.util.function.BiFunction;

interface Sayable {
    void say();
}

interface Messageable {
    Message getMessage(String msg);
}

class Message {
    Message(String msg) {
        System.out.print(msg);
    }
}

public class MethodReference {
    public static void saySomethingStatic() {
        System.out.println("Hello, this is static method.");
    }

    public static void main(String[] args) {
        // Referring static method
        Sayable sayable = MethodReference::saySomethingStatic;
        // Calling interface method
        sayable.say();

        BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
        int result = adder.apply(10, 20);
        System.out.println(result);

        MethodReference methodReference = new MethodReference(); // Creating object
        // Referring non-static method using reference
        Sayable sayable1 = methodReference::saySomething;
        // Calling interface method
        sayable.say();
        // Referring non-static method using anonymous object
        Sayable sayable2 = new MethodReference()::saySomething; // You can use anonymous object also
        // Calling interface method
        sayable2.say();

        Messageable hello = Message::new;
        hello.getMessage("Hello");
    }

    public void saySomething() {
        System.out.println("Hello, this is non-static method.");
    }
}

class Arithmetic {
    public static int add(int a, int b) {
        return a + b;
    }
}