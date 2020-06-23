package io;

import java.io.FileInputStream;

//Java FileInputStream class obtains input bytes from a file.
// It is used for reading byte-oriented data (streams of raw bytes) such as image data, audio, video etc.
// You can also read character-stream data.
// But, for reading streams of characters, it is recommended to use FileReader class.
public class FISExample {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("test.txt")) {
            int i = fin.read();
            System.out.print((char) i);
        } catch (Exception e) {
            System.out.println(e);
        }

        try (FileInputStream fin = new FileInputStream("test.txt")) {
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}