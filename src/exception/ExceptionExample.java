package exception;

public class ExceptionExample {

    public static void main(String[] args) {
        try {
            //code that may raise exception
            int data = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        //rest code of the program
        System.out.println("rest of the code...");

        int a = 50 / 0;//ArithmeticException

        String s = null;
        System.out.println(s.length());//NullPointerException

        s = "abc";
        int i = Integer.parseInt(s);//NumberFormatException

        int array[] = new int[5];
        array[10] = 50; //ArrayIndexOutOfBoundsException
    }
}
