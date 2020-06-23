package newFeatures.java7;

public class NumericLiterals {
    public static void main(String[] args) {
        // Underscore in integral literal
        int a = 10_00000;
        System.out.println("a = " + a);
        // Underscore in floating literal
        float b = 10.5_000f;
        System.out.println("b = " + b);
        // Underscore in binary literal
        int c = 0B10_10;
        System.out.println("c = " + c);
        // Underscore in hexadecimal literal
        int d = 0x1_1;
        System.out.println("d = " + d);
        // Underscore in octal literal
        int e = 01_1;
        System.out.println("e = " + e);

//        You cannot use underscore at the beginning or end of a number.
//        int a = _10; // Error, this is an identifier, not a numeric literal
//        int a = 10_; // Error, cannot put underscores at the end of a number
//        You cannot use underscore adjacent to a decimal point in a floating point literal.
//        float a = 10._0; // Error, cannot put underscores adjacent to a decimal point
//        float a = 10_.0; // Error, cannot put underscores adjacent to a decimal point
//        You cannot use underscore prior to an F or L suffix
//        long a = 10_100_00_L; // Error, cannot put underscores prior to an L suffix
//        float a = 10_100_00_F; // Error, cannot put underscores prior to an F suffix
//        You cannot use underscore in positions where a string of digits is expected.
    }
}
