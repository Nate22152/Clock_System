/*The purpose of this program is to keep data of hours on specified day. 
it will first check if the file exist within the program. If it doesn't exist
it will go create and input the data that the user will input using an array system.
Otherwise it will display the read file, and determine the average value while reading.
It then displays the options such as Delete, Edit, Add, Exit.
Delete (Least Valued)
- Deletes the inputted data within the specified day
Edit
- replaces the data within the specified day
Add
- Adds data such as Day, Time, Hours, and Possible Amount
Exit
- Displays the Average Hour(Total Hour/Inputted Data), Possible Amount, how many hours left (Total Hours - 1040)*/
//libraries

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.*;

public class main {

    public static void main(String[] args) {

        // input scanner system
        Scanner scnr = new Scanner(System.in);

        // Reads file name and determines whether it exists or not
        System.out.println("Enter filename: ");
        String filename = scnr.nextLine();

        String filePath = "C:\\Users\\Nate1\\OneDrive\\Desktop\\Projects\\Clock_System\\" + filename + ".txt";
        Path path = FileSystems.getDefault().getPath(filePath);

        try {
            // compares the file path to determine whether the file exists or not
            if (Files.exists(path)) {
                System.out.println("File Exists");
                FileInputStream fin = new FileInputStream(filePath);
                // function that uses the filePath use the for loop below
                fin.close();
            } else {
                System.out.println("File does not exist");
                FileOutputStream fout = new FileOutputStream(filePath);
                // function that uses the filePath use the for loop below
                fout.close();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Displays the options (add, delete, edit, exit)
        System.out.println("Options: add, delete, edit, or exit");
        System.out.println("Enter option: ");
        String option = scnr.nextLine();

        while (true) {
            // if statement to determine the option
            if (option.equalsIgnoreCase("add")) {
                // if add is selected it will add the data
                System.out.println("Enter day: ");
                String day = scnr.nextLine();
                System.out.println("Enter time: ");
                String time = scnr.nextLine();
                System.out.println("Enter hours: ");
                String hours = scnr.nextLine();
                System.out.println("Enter possible amount: ");
                String amount = scnr.nextLine();
                // writes the data into the file

            } else if (option.equalsIgnoreCase("delete")) {
                // if delete is selected it will delete the data
                System.out.println("Enter day: ");
                String day = scnr.nextLine();
                // writes the data into the file

            } else if (option.equalsIgnoreCase("edit")) {
                // if edit is selected it will edit the data
                System.out.println("Enter day: ");
                String day = scnr.nextLine();
                System.out.println("Enter time: ");
                String time = scnr.nextLine();
                System.out.println("Enter hours: ");
                String hours = scnr.nextLine();
                System.out.println("Enter possible amount: ");
                String amount = scnr.nextLine();
                // writes the data into the file

            } else if (option.equalsIgnoreCase("exit")) {
                // if exit is selected it will exit the program
                System.out.println("Exiting program");
                // writes the data into the console display total AVG hours, and hours left
                System.exit(0);
                scnr.close();
            }
        }
    }
}
