package in_class;

import java.util.Scanner;

public class DemoIO {
    static void main() {
        // Create scanner to allow us to read from the terminal/console
        Scanner input = new Scanner(System.in);
        // Prompt user
        System.out.println("Please enter your username: ");

        // Read in from terminal (input.nextLine()) and store in a variable
        String name = input.nextLine();
        System.out.println("Hello there, " + name);

        // Check the name supplied against a fixed value
        // ! means not - if the value entered is not "admin", tell them they're not allowed in
        // Comparing to a string needs a method, as a String is an OBJECT
        if(!name.equals("admin")){
            System.out.println("You're not meant to be here, get out!");
        }else {
            // Otherwise, continue to age check
            System.out.println("Please enter your age: ");
            // Read in age - different method (input.nextInt()) this time as we're reading in a number
            int age = input.nextInt();

            // If the admin is under 18, they're too young
            // Numeric comparison is done with > and < operators (like python)
            // but the condition still needs to be within brackets
            if (age < 18) {
                System.out.println("You're too young, get out!");
                // If the age is under 25, limit their abilities
            } else if (age < 25) {
                System.out.println("No car rental for you!");
            } else {
                System.out.println("Welcome in!");
            }
        }
    }
}
