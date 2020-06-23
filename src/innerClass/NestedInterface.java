package innerClass;

interface Showable {
    void show();

    interface Message {
        void msg();
    }
}

public class NestedInterface implements Showable.Message, A.Showable {
    public static void main(String[] args) {
        Showable.Message message = new NestedInterface();//upcasting here
        message.msg();

        A.Showable showable = new NestedInterface();//upcasting here
        showable.show();
    }

    public void msg() {
        System.out.println("Hello nested interface");
    }

    public void show() {
        System.out.println("Hello nested interface within class");
    }
}

class A {
    interface Showable {
        void show();
    }
}
