package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//It is an abstract class for writing to character streams.
// The methods that a subclass must implement are write(char[], int, int), flush(), and close().
// Most subclasses will override some of the methods defined here to provide higher efficiency, functionality or both.
public class WriterExample {
    public static void main(String[] args) {
        try (Writer w = new FileWriter("output.txt")) {
            String content = "I love my country";
            w.write(content);
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
