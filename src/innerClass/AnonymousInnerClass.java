package innerClass;

interface Eatable {
    void eat();
}

abstract class Person {
    abstract void eat();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Person p = new Person() {
            void eat() {
                System.out.println("nice fruits");
            }
        };
        p.eat();

        Eatable e = new Eatable() {
            public void eat() {
                System.out.println("nice fruits");
            }
        };
        e.eat();

    }
}
