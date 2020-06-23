package newFeatures.java5;

public class CovariantReturnType {
    public static void main(String[] args) {
//        As you can see in the above example, the return type of the get() method of A class is A
//        but the return type of the get() method of B class is B.
//        Both methods have different return type but it is method overriding. This is known as covariant return type.
        new B().get().message();
    }
}

class A {
    A get() {
        return this;
    }
}

class B extends A {

    B get() {
        return this;
    }

    void message() {
        System.out.println("welcome to covariant return type");
    }
}
