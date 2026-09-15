package Class_Work;

import java.util.Scanner;

public class DemoIO {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name please: ");

        if(name.equals("Fred")){
            System.out.println("You're banned, get out!");
        }elif(!name,equals("admin")){
            System.out.println("Continue ");
        }

        String name = input.nextLine();
        system.out.printls("Hello there, " + name);

        System.out.println("Please enter your age: ");
        int age = input.nextInt();

        if (age < 18) {
            System.out.println("You're under age, Out!");
        }else if(age < 25){
            System.out.println("No car rental for y!");
        }else{
            System.out.println("Welcome in!");
        }
    }
}