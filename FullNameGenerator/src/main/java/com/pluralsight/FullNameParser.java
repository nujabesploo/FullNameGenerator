package com.pluralsight;
import java.util.Scanner;

// Main class for parsing full names into components
public class FullNameParser {
    // Main method - starting point of the program
    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner in = new Scanner(System.in);

        // Display header and prompt for name input
        System.out.println("-----Full Name Parser-----");
        System.out.print("Please enter your name: \t \t \t");

        // Get name input and remove extra spaces
        String name = in.nextLine().trim();

        // Split the full name into parts based on spaces
        String[] split_name = name.split(" ");

        // Get first name (first element is always first name)
        String first_name = split_name[0];

        // Handle two-word name format (first last)
        if (split_name.length == 2) {
            // Get last name from second element
            String last_name = split_name[1];
            // Display name components
            System.out.println("First name: " + first_name);
            System.out.println("Middle name: (none)");
            System.out.println("Last name: " + last_name);
        }
        // Handle three-word name format (first middle last)
        else if (split_name.length == 3) {
            // Get middle and last names
            String middle_name = split_name[1];
            String last_name = split_name[2];
            // Display name components
            System.out.println("First name: " + first_name);
            System.out.println("Middle name: " + middle_name);
            System.out.println("Last name: " + last_name);
        }

        // Note: You might want to add error handling for invalid inputs
        // and close the Scanner when done
    }


}

