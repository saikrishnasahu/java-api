package newFeatures.java7;

public class CatchMultipleException {
    public static void main(String[] args) {
//        An old, prior to Java 7 approach to handle multiple exceptions.
        try {
            int[] array = new int[10];
            array[10] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

//        new in java 7
        try {
            int[] array = new int[10];
            array[10] = 30 / 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

//        adding exception at first gives compilation issue
//        try {
//            int[] array = new int[10];
//            array[10] = 30 / 0;
//        } catch (Exception | ArithmeticException | ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        }

    }
}
