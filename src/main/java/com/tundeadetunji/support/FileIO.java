package com.tundeadetunji.support;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

    public static boolean writeText(String file_path, String text){
        // Try block to check for exceptions
        try {

            // Step 1: Create an object of BufferedWriter
            BufferedWriter f_writer = new BufferedWriter(new FileWriter(file_path));

            // Step 2: Write text(content) to file
            f_writer.write(text);

            // Step 3: Printing the content inside the file
            // on the terminal/CMD
            //System.out.print(text);

            // Step 4: Display message showcasing
            // successful execution of the program
            //System.out.print("File is created successfully with the content.");

            // Step 5: Close the BufferedWriter object
            f_writer.close();
            return true;
        }

        // Catch block to handle if exceptions occurs
        catch (IOException e) {

            // Print the exception on console
            // using getMessage() method
            //System.out.print(e.getMessage());
            return false;
        }
    }

}
