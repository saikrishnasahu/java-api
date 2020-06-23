package io;

import java.io.File;
import java.io.IOException;

//The File class is an abstract representation of file and directory pathname.
// A pathname can be either absolute or relative.
//The File class have several methods for working with directories and files
// such as creating new directories or files, deleting and renaming directories or files,
// listing the contents of a directory etc.
public class FileExample {
    public static void main(String[] args) {
        try {
            File file = new File("javaFile123.txt");
            if (file.createNewFile()) {
                System.out.println("New File is created!");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String path = "";
        boolean bool = false;
        try {
            // createing  new files
            File file = new File("testFile1.txt");
            file.createNewFile();
            System.out.println(file);
            // createing new canonical from file object
            File file2 = file.getCanonicalFile();
            // returns true if the file exists
            System.out.println(file2);
            bool = file2.exists();
            // returns absolute pathname
            path = file2.getAbsolutePath();
            System.out.println(bool);
            // if file exists
            if (bool) {
                // prints
                System.out.print(path + " Exists? " + bool);
            }
        } catch (Exception e) {
            // if any error occurs
            e.printStackTrace();
        }

        File f = new File("/Users/sonoojaiswal/Documents");
        String[] filenames = f.list();
        for (String filename : filenames) {
            System.out.println(filename);
        }

        File dir = new File("/Users/sonoojaiswal/Documents");
        File[] files = dir.listFiles();
        for (File file : files) {
            System.out.println(file.getName() + " Can Write: " + file.canWrite()
                    + " Is Hidden: " + file.isHidden() + " Length: " + file.length() + " bytes");
        }
    }
}
