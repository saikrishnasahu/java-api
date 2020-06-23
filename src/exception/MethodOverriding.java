package exception;

public class MethodOverriding {
    public static void main(String[] args) {
        Parent p = new Test();
        p.msg();
        try {
            p.errorThrown();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Test t = new Test();
        t.msg();
        t.errorThrown();

    }
}

class Parent {
    void msg() {
        System.out.println("parent");
    }

    void errorThrown() throws Exception {
        System.out.println("throwing error");
    }
}

class Test extends Parent {

//    cannot as parent has not declared an exception
//    void msg() throws IOException {
//        System.out.println("TestExceptionChild");
//    }

    //    can as checked exception
    void msg() throws ArithmeticException {
        System.out.println("TestExceptionChild");
    }

    //    can throw same or child or no exception
    void errorThrown() {
        System.out.println("throwing error");
    }

}
