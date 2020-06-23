package fundamentalClasses;

public class ClassExample {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        A a = new A();   // Any class A
        Class c = A.class; // No error
//         c = a.class; // Error
        a = new A();   // Any class A
        c = a.getClass();

        // returns the Class object for the class
        // with the specified name
        Class c1 = Class.forName("java.lang.String");
        Class c2 = int.class;
        Class c3 = void.class;

        System.out.print("Class represented by c1: ");

        // toString method on c1
        System.out.println(c1.toString());

        System.out.print("Class represented by c2: ");

        // toString method on c2
        System.out.println(c2.toString());

        System.out.print("Class represented by c3: ");

        // toString method on c3
        System.out.println(c3.toString());

        // forName method
        // it returns the Class object for the class
        // with the specified name
        c = Class.forName("java.lang.String");

        System.out.print("Class represented by c : " + c.toString());

        // returns the Class object for this class
        Class myClass = Class.forName("Test");

        // creating new instance of this class
        // newInstance method
        Object obj = myClass.newInstance();

        // returns the runtime class of obj
        System.out.println("Class of obj : " + obj.getClass());

        // returns the Class object for the class
        // with the specified name
        c = Class.forName("java.lang.String");

        String s = "GeeksForGeeks";
        int i = 10;


        // checking for Class instance
        // isInstance method
        boolean b1 = c.isInstance(s);
        boolean b2 = c.isInstance(i);

        System.out.println("is s instance of String : " + b1);
        System.out.println("is i instance of String : " + b2);

        // returns the Class object for the class
        // with the specified name
        c1 = Class.forName("java.lang.String");
        c2 = Class.forName("java.lang.Runnable");

        // checking for interface type

        // isInterface method on c1
        b1 = c1.isInterface();

        // is Interface method on c2
        b2 = c2.isInterface();

        System.out.println("is java.lang.String an interface : " + b1);
        System.out.println("is java.lang.Runnable an interface : " + b2);

        // returns the Class object associated with an integer;
         c1 = int.class;

        // returns the Class object associated with Test class
         c2 = A.class;

        // checking for primitive type

        // isPrimitive method on c1
         b1 = c1.isPrimitive();

        // isPrimitive method on c2
         b2 = c2.isPrimitive();

        System.out.println("is "+c1.toString()+" primitive : " + b1);
        System.out.println("is "+c2.toString()+" primitive : " + b2);
    }
}

class A {

}
