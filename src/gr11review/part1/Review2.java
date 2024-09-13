package gr11review.part1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Review2 {

    /*
     * A program that outputs a joke based on the user's menu option
     * @author: Joshua Yin
     */

     public static void main(String [] args) throws IOException {

        // Declare variables
        int intOption;
        
        // BufferedReader for user input
        BufferedReader optionReader = new BufferedReader(new InputStreamReader(System.in));

        // Ask user for option
        System.out.println("0 - print a joke about your hair");
        System.out.println("1 - print a joke about your feet");
        System.out.println("2 - print a joke about your clothes");
        System.out.println("3 - print a joke about your teacher");
        System.out.print("Choose a menu option: ");

        // Parse user input
        intOption = Integer.parseInt(optionReader.readLine());

        // Switch case to output joke based on option
        switch (intOption) {

            // Case 0: output joke about hair
            case 0:
                System.out.println("Why do bees have sticky hair?");
                System.out.println("They always use honeycombs.");
                break;

            // Case 1: output joke about feet
            case 1:
                System.out.println("Why did the golfer take an extra pair of socks?");
                System.out.println("In case he got a hole in one!");
                break;

            // Case 2: output joke about clothes
            case 2:
                System.out.println("Why don't clothes ever go on vacation?");
                System.out.println("Because they're always packed!");
                break;

            // Case 3: output joke about teacher
            case 3:
                System.out.println("Why did the teacher write on the window?");
                System.out.println("Because she wanted the lesson to be very clear.");
                break;
            
            // Default case: invalid menu option
            default:
                System.out.println("Invalid menu option");
                break;
        }
     }
}