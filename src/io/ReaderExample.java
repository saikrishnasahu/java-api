package io;

import java.io.FileReader;
import java.io.Reader;

//Java Reader is an abstract class for reading character streams.
// The only methods that a subclass must implement are read(char[], int, int) and close().
// Most subclasses, however, will override some of the methods to provide higher efficiency, additional functionality, or both.
//Some of the implementation class are BufferedReader, CharArrayReader, FilterReader, InputStreamReader, PipedReader, StringReader
public class ReaderExample {
    public static void main(String[] args) {
        try (Reader reader = new FileReader("file.txt");){
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
