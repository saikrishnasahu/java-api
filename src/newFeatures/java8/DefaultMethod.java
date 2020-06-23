package newFeatures.java8;

interface Sayable5 {
    // static method
    static void sayLouder(String msg) {
        System.out.println(msg);
    }

    // Default method
    default void say() {
        System.out.println("Hello, this is default method");
    }

    // Abstract method
    void sayMore(String msg);
}

abstract class AbstractClass {
    public AbstractClass() {        // constructor
        System.out.println("You can create constructor in abstract class");
    }

    static int multiply(int a, int b) {  // static method
        return a * b;
    }

    abstract int add(int a, int b); // abstract method

    int sub(int a, int b) {      // non-abstract method
        return a - b;
    }
}

class AbstractTest extends AbstractClass {
    public static void main(String[] args) {

    }

    public int add(int a, int b) {        // implementing abstract method
        return a + b;
    }
}

public class DefaultMethod implements Sayable5 {
    public static void main(String[] args) {
        DefaultMethod dm = new DefaultMethod();
        dm.say();   // calling default method
        dm.sayMore("Work is worship");  // calling abstract method
        Sayable5.sayLouder("Helloooo...");   // calling static method

        AbstractTest a = new AbstractTest();
        int result1 = a.add(20, 10);    // calling abstract method
        int result2 = a.sub(20, 10);    // calling non-abstract method
        int result3 = AbstractClass.multiply(20, 10); // calling static method
        System.out.println("Addition: " + result1);
        System.out.println("Substraction: " + result2);
        System.out.println("Multiplication: " + result3);

    }

    public void sayMore(String msg) {        // implementing abstract method
        System.out.println(msg);
    }
}
