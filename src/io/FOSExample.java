package io;

import java.io.FileOutputStream;

//Java FileOutputStream is an output stream used for writing data to a file.
//If you have to write primitive values into a file, use FileOutputStream class.
//You can write byte-oriented as well as character-oriented data through FileOutputStream class.
//But, for character-oriented data, it is preferred to use FileWriter than FileOutputStream.
public class FOSExample {
    public static void main(String[] args) {
        try (FileOutputStream fout = new FileOutputStream("test.txt")) {
            fout.write(65);
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }

        try (FileOutputStream fout = new FileOutputStream("test.txt")) {
            String s = "Welcome to java";
            byte[] b = s.getBytes();//converting string into byte array
            fout.write(b);
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
