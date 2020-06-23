package fundamentalClasses;

public class ObjectExample {

    public static void main(String[] args) {
        Student s = new Student();

        // Below two statements are equivalent
        System.out.println(s);
        System.out.println(s.toString());

        Object obj = "GeeksForGeeks";
        Class c = obj.getClass();
        System.out.println("Class of Object obj is : " + c.getName());

        ObjectExample t = new ObjectExample();
        System.out.println(t.hashCode());

        t = null;

        // calling garbage collector
        System.gc();

    }

    @Override
    protected void finalize() {
        System.out.println("finalize method called");
    }
}

class Student {
    static int last_roll = 100;
    int roll_no;

    // Constructor
    Student() {
        roll_no = last_roll;
        last_roll++;
    }

    // Overriding hashCode()
    @Override
    public int hashCode() {
        return roll_no;
    }
}
