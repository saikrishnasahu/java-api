package mutlithreading;

//The join() method waits for a thread to die. In other words, it causes the currently running threads to stop executing
//until the thread it joins with completes its task.
public class JoinExample {
    public static void main(String[] args) {
        TestJoinMethod1 t1 = new TestJoinMethod1();
        TestJoinMethod1 t2 = new TestJoinMethod1();
        TestJoinMethod1 t3 = new TestJoinMethod1();
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        t2.start();
        t3.start();

        TestJoinMethod2 t12 = new TestJoinMethod2();
        TestJoinMethod2 t22 = new TestJoinMethod2();
        TestJoinMethod2 t32 = new TestJoinMethod2();
        t12.start();
        try {
            t12.join(1500);
        } catch (Exception e) {
            System.out.println(e);
        }

        t22.start();
        t32.start();
    }
}


class TestJoinMethod2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}

class TestJoinMethod1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

}
