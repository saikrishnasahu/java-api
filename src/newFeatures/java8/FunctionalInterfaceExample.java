package newFeatures.java8;

@FunctionalInterface
interface Sayable3 {
    void say(String msg);
}

public class FunctionalInterfaceExample implements Sayable3 {
    public static void main(String[] args) {
        FunctionalInterfaceExample fie = new FunctionalInterfaceExample();
        fie.say("Hello there");
    }

    @Override
    public void say(String msg) {
        System.out.println(msg);
    }
}

@FunctionalInterface
interface Sayable4{
    void say(String msg);   // abstract method
    // It can contain any number of Object class methods.
    int hashCode();
    String toString();
    boolean equals(Object obj);
}

////Invalid Functional Interface
//@FunctionalInterface
//interface Doable extends Sayable3{
//    // Invalid '@FunctionalInterface' annotation; Doable is not a functional interface
//    void doIt();
//}
