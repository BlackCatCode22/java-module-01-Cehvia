//FileIOPractice.java
//cGJ 9/4/25

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOPractice {
    public static void main(String[] args) {

        System.out.println("\nWelcome to File I/O practice! ");

        // Create a BufferedWriter object and use it.
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("myOutputFile.txt"));
            bufferedWriter.write("\n line one");
            bufferedWriter.write("\n line two");
            bufferedWriter.write("\n line three");
            bufferedWriter.close();
            System.out.println("\nFile named myOutputFile.txt successfully created or modified!\n");

        }   catch (IOException e) {
            e.printStackTrace();
        }
    }
}
