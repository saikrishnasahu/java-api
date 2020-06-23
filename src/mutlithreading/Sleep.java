package mutlithreading;

//The sleep() method of Thread class is used to sleep a thread for the specified amount of time.
//As you know well that at a time only one thread is executed.
//If you sleep a thread for the specified time,the thread scheduler picks up another thread and so on.
public class Sleep {
    public static void main(String[] args) {
        TestSleepMethod1 t1 = new TestSleepMethod1();
        TestSleepMethod1 t2 = new TestSleepMethod1();

        t1.start();
        t2.start();
    }
}

class TestSleepMethod1 extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

}
