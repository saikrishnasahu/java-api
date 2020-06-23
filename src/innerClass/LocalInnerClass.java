package innerClass;

public class LocalInnerClass {
    private final int data = 30;//instance variable

    public static void main(String[] args) {
        LocalInnerClass obj = new LocalInnerClass();
        obj.display();
        obj.displayLocalVariable();
    }

    void display() {
        class Local {
            void msg() {
                System.out.println(data);
            }
        }
        Local l = new Local();
        l.msg();
    }

    void displayLocalVariable() {
        int value = 50;//local variable must be final till jdk 1.7 only
        class Local {
            void msg() {
                System.out.println(value);
            }
        }
        Local l = new Local();
        l.msg();
    }

}
