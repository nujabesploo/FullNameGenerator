package com.pluralsight;
import java.util.Scanner;

public class FullNameApplication {

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);

        // Display program header and prompt for user input
        System.out.println("----Full Name Generator----");
        System.out.println("Please enter your name");

        // Get first name (required) and remove extra spaces
        System.out.print("First Name: ");
        String first_name = in.nextLine().trim();

        // Get middle name (optional) and remove extra spaces
        System.out.print("Middle Name: ");
        String middle_name = in.nextLine().trim();

        // Get last name (required) and remove extra spaces
        System.out.print("Last name: ");
        String last_name = in.nextLine().trim();

        // Get suffix (optional) and remove extra spaces
        System.out.print("Suffix name:");
        String suffix_name = in.nextLine().trim();

        // Create array to store all name parts
        String[] name_parts = new String[4];
        name_parts[0] = first_name;    // Store first name
        name_parts[1] = middle_name;   // Store middle name
        name_parts[2] = last_name;     // Store last name
        name_parts[3] = suffix_name;   // Store suffix

        // Start building full name with first name
        String full_name = name_parts[0];

        // Add middle name only if it was provided
        if (!name_parts[1].isEmpty()) {
            full_name = full_name + " " + name_parts[1];
        }

        // Always add last name after first/middle name
        full_name = full_name + " " + name_parts[2];

        // Add suffix with comma if it was provided
        if (!name_parts[3].isEmpty()) {
            full_name = full_name + ", " + name_parts[3];
        }

        // Print the final formatted name
        System.out.println("\nFull name: " + full_name);

        // Close Scanner to prevent resource leak
        in.close();


    }
}
