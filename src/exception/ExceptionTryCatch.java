package exception;

public class ExceptionTryCatch {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7};
        try {
            System.out.println(arr[10]); //may throw exception
            System.out.println("this code would not execute");
        }
        // handling the array exception
        // multiple catch block
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println(arr[1]);
            System.out.println("all this would be executed");
        } catch (Exception e) {
            System.out.println(e);
        }
//        cannot add after Exception as child
//        catch (ArithmeticException e) {
//            System.out.println(e);
//        }

        System.out.println("rest of the code");
    }
}
