package gr11review.part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Review1 {

    /*
     * A program that asks the user for a month number and a day number and then calculates the day of the year
     * @author: Joshua Yin
     */
    
    public static void main (String[] args) throws IOException {

        // Declare variables
        int intMonth;
        int intDay;
        int intDayOfYear;
        int [] intDaysInMonth;

        // Declare BufferedReader for user input
        BufferedReader dateReader = new BufferedReader(new InputStreamReader(System.in));
        
        // Initialize intDayOfYear
        intDayOfYear = 0;

        // Ask user for month number
        System.out.print("Enter the month number: ");
        intMonth = Integer.parseInt(dateReader.readLine());
        
        // Ask user for day number
        System.out.print("Enter the day number: ");
        intDay = Integer.parseInt(dateReader.readLine());

        // Calculate the day of the year
        intDaysInMonth = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        for (int i = 0; i < intMonth - 1; i++) {
            intDayOfYear += intDaysInMonth[i];
        }

        intDayOfYear += intDay;

        // Output the day of the year
        System.out.println(intDayOfYear);
    }
}