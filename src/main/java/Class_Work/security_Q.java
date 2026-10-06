package Class_Work;

import java.util.Scanner;

public class ClassExercise_SecurityQuestion {
    static void main() {
        Scanner input = new Scanner(System.in);

        String question = "What's your favourite colour?";
        String answer = "Blue";

        System.out.println("Security check - answer the following question:");
        System.out.println(question);
        String response = input.nextLine();

        if (response.equalsIgnoreCase(answer)) {
            System.out.println("Authorised.");
        } else {
            System.out.println("Authorisation failed.");
        }
    }
}
