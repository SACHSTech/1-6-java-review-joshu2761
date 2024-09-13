package gr11review.part1;

import java.util.Random;
import java.io.*;

public class Review8 {

    /*
     * A program that simulates 1000 pulls of a slot machine and outputs the number of times a triple was pulled
     * @author: Joshua Yin
     */
    public static void main (String [] args) {
            
            // Declare variables
            int intRandom1;
            int intRandom2;
            int intRandom3;
            int intTripleCount;
            Random random = new Random();
    
            // Initialize variables
            intTripleCount = 0;
    
            // Loop to simulate 1000 pulls of a slot machine
            for (int i = 0; i < 1000; i++) {
                intRandom1 = random.nextInt(9);
                intRandom2 = random.nextInt(9);
                intRandom3 = random.nextInt(9);
                System.out.println(intRandom1 + " " + intRandom2 + " " + intRandom3);
                if (intRandom1 == intRandom2 && intRandom2 == intRandom3) {
                    intTripleCount++;
                }
            }
    
            // Output the total count of the number of times a triple was pulled
            System.out.println(intTripleCount);
    }
}
