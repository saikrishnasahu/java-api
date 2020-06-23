package innerClass;

public class StaticNestedClass {

    static int data = 30;

    public static void main(String[] args) {
        StaticNestedClass.Inner obj = new StaticNestedClass.Inner();
        obj.msg();

        StaticNestedClass.Inner2.msg();//no need to create the instance of static nested class
    }

    static class Inner {
        void msg() {
            System.out.println("data is " + data);
        }
    }

    static class Inner2 {
        static void msg() {
            System.out.println("data is " + data);
        }
    }
}
