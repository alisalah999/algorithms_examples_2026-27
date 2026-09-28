package My_Class_Work;

import java.util.Scanner;

public class ConversionExercise_Loops1 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        int number = 0;

        System.out.println("Enter numbers: ");

        while (number != -1) {
            System.out.println("Please enter a number (-1 to terminate):");
            number = input.nextInt();

            if(number != -1){
                sum += number;
                count++;
            }
        }

        }
    }

