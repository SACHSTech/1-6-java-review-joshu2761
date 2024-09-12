package gr11review.part1;

/*
 * Review3.java - Iteration - for loop 1
Create a program that prints the odd numbers from 20 to 100 and prints the numbers from 29 to 2 in decreasing order. You will need to create two separate loops with a blank line between them.
 */

 public class Review3 {
 
    public static void main (String [] args) {
         
        // Declare variables
        int intOdd;
        int intDecreasing;

        // Loop to print odd numbers from 20 to 100
        for (intOdd = 21; intOdd <= 100; intOdd += 2) {
            System.out.println(intOdd);
        }

        // Blank line
        System.out.println();

        // Loop to print numbers from 29 to 2 in decreasing order
        for (intDecreasing = 29; intDecreasing >= 2; intDecreasing--) {
            System.out.println(intDecreasing);
        }
    }
 }