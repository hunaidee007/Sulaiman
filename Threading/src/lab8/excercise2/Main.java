package lab8.excercise2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main (String ars[]) throws IOException {
        System.out.println("Hi");

        //Handle to existing folder
        File dir = new File("C:\\LimProject");

        //Path of new directory to be created
        File newDir = new File("C:\\LimProject_targ");

        //Create new dir if it doesnot exists
        if(!newDir.exists()) {
            newDir.mkdir();
        }

        //Loop through all the files in the directory
        for(File file : dir.listFiles()) {
            Path sourceDirectory = Paths.get(file.getAbsolutePath());
            Path targetDirectory = Paths.get("C:\\LimProject_targ\\"+file.getName());
            //copy source to target using Files Class
            Files.copy(sourceDirectory, targetDirectory);
        }





    }
}
