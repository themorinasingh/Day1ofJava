// Importing the necessary Java package for standard input-output
import java.util.Scanner;

public class Exercise {
    public void displayText() {
        // Prompt the user to enter a message
        System.out.println("Enter your message:");
        // Use a Scanner to read the user's input
        Scanner myObj = new Scanner(System.in);
        String message = myObj.nextLine();
        

        // Print the message using println (with a newline)
        //TODO
        System.out.println("Using println:");
        System.out.println(message);

        // Print the message using print (without a newline)
        //TODO
        System.out.print("Using print:");
        System.out.print(message);
        // Print a new line with escape sequences
        //TODO
        System.out.println("\n\nText with escape sequences:");
        System.out.println("Hello, \"Java Masterclass\" students!");
        System.out.println("Welcome to Day 1.");
        System.out.println("Let's get started!");
}}