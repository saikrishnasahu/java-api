package wrapper;

public class WrapperExample {
    public static void main(String[] args) {

        //Converting int into Integer
        int a = 20;
        Integer i = Integer.valueOf(a);//converting int into Integer explicitly
        Integer j = a;//autoboxing, now compiler will write Integer.valueOf(a) internally

        System.out.println(a + " " + i + " " + j);

        //Converting Integer to int
        Integer a1 = new Integer(3);
        int i1 = a1.intValue();//converting Integer to int explicitly
        int j1 = a1;//unboxing, now compiler will write a.intValue() internally

        System.out.println(a1 + " " + i1 + " " + j1);

        byte b = 10;
        short s = 20;
        long l = 40;
        float f = 50.0F;
        double d = 60.0D;
        char c = 'a';
        boolean b2 = true;

//Autoboxing: Converting primitives into objects
        Byte byteobj = b;
        Short shortobj = s;
        Long longobj = l;
        Float floatobj = f;
        Double doubleobj = d;
        Character charobj = c;
        Boolean boolobj = b2;

//Printing objects
        System.out.println("---Printing object values---");
        System.out.println("Byte object: " + byteobj);
        System.out.println("Short object: " + shortobj);
        System.out.println("Long object: " + longobj);
        System.out.println("Float object: " + floatobj);
        System.out.println("Double object: " + doubleobj);
        System.out.println("Character object: " + charobj);
        System.out.println("Boolean object: " + boolobj);

//Unboxing: Converting Objects to Primitives
        byte bytevalue = byteobj;
        short shortvalue = shortobj;
        long longvalue = longobj;
        float floatvalue = floatobj;
        double doublevalue = doubleobj;
        char charvalue = charobj;
        boolean boolvalue = boolobj;

//Printing primitives
        System.out.println("---Printing primitive values---");
        System.out.println("byte value: " + bytevalue);
        System.out.println("short value: " + shortvalue);
        System.out.println("long value: " + longvalue);
        System.out.println("float value: " + floatvalue);
        System.out.println("double value: " + doublevalue);
        System.out.println("char value: " + charvalue);
        System.out.println("boolean value: " + boolvalue);

        //Testing the custom wrapper class
        MyClass myClass = new MyClass(10);
        System.out.println(myClass);
    }
}

//Creating the custom wrapper class
class MyClass {
    private int i;

    MyClass() {
    }

    MyClass(int i) {
        this.i = i;
    }

    public int getValue() {
        return i;
    }

    public void setValue(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return Integer.toString(i);
    }
}