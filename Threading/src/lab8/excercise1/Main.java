package lab8.excercise1;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main (String ars[]) throws IOException {
        System.out.println("Hi");

        File f = new File("C:\\LimProject");
        // Check if the directory exist
        if(! f.exists()) {
            f.mkdir();
        }

        File newFile = new File("C:\\LimProject\\test.txt");
        if(!newFile.exists()) {
            newFile.createNewFile();
        }

        File newFile1 = new File("C:\\LimProject\\test1.txt");
        if(!newFile1.exists()) {
            newFile1.createNewFile();
        }

        // List the names of the files in this directory

        File[] files = f.listFiles();

        for(File file : files) {
            System.out.println("File Name : " + file.getName());
        }

        System.out.println("Done");



    }
}
