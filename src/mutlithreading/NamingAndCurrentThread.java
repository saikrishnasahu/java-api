package mutlithreading;

public class NamingAndCurrentThread {
    public static void main(String[] args) {
        TestMultiNaming1 t1 = new TestMultiNaming1();
        TestMultiNaming1 t2 = new TestMultiNaming1();
        System.out.println("Name of t1:" + t1.getName());
        System.out.println("Name of t2:" + t2.getName());

        t1.start();
        t2.start();

        t1.setName("Sonoo Jaiswal");
        System.out.println("After changing name of t1:" + t1.getName());

        TestMultiNaming2 tm1 = new TestMultiNaming2();
        TestMultiNaming2 tm2 = new TestMultiNaming2();

        tm1.start();
        tm2.start();
    }
}

class TestMultiNaming1 extends Thread {
    public void run() {
        System.out.println("running...");
    }
}

class TestMultiNaming2 extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
