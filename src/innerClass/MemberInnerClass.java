package innerClass;

public class MemberInnerClass {
    private final int data = 30;

    public static void main(String[] args) {
        MemberInnerClass obj = new MemberInnerClass();
        MemberInnerClass.Inner in = obj.new Inner();
        in.msg();
    }

    class Inner {
        void msg() {
            System.out.println("data is " + data);
        }
    }
}
