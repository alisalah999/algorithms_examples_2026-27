package in_class;

import java.util.Scanner;

public class InClassExercise_SecurityQuestion {
    static void main() {
        Scanner input = new Scanner(System.in);
        String question = "What is your favourite colour?";
        String answer = "blue";

        System.out.println("Security check - answer the following question:");
        System.out.println(question);
        String response = input.nextLine();

        if(response.equalsIgnoreCase(answer)){
            System.out.println("Authorised.");
        }else{
            System.out.println("Authorisation failed.");
        }

    }
}
