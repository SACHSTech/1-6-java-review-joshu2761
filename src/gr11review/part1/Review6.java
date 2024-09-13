package gr11review.part1;

import java.io.*;
import java.text.DecimalFormat;

public class Review6 {

    /*
     * A program that calculates the subtotal, tax, and total of a cash register based on user input of item prices
     * @author: Joshua Yin
     */

     public static void main (String [] args) throws IOException {

        // Declare variables
        double dblPrice;
        double dblSubtotal;
        double dblTax;
        double dblTotal;
        DecimalFormat decimalFormat;

        // BufferedReader for user input
        BufferedReader priceReader = new BufferedReader(new InputStreamReader(System.in));

        // Initialize variables
        dblSubtotal = 0;
        decimalFormat = new DecimalFormat("$0.00");

        // Ask user for price of an item
        System.out.print("Enter the price for an item: ");
        dblPrice = Double.parseDouble(priceReader.readLine());

        // Loop to calculate subtotal
        while (dblPrice != 0) {
            dblSubtotal += dblPrice;
            System.out.print("Enter the price for an item: ");
            dblPrice = Double.parseDouble(priceReader.readLine());
        }

        // Calculate tax and total
        dblTax = dblSubtotal * 0.13;
        dblTotal = dblSubtotal + dblTax;

        // Output subtotal, tax, and total
        System.out.println("Subtotal: " + decimalFormat.format(dblSubtotal));
        System.out.println("Tax: " + decimalFormat.format(dblTax));
        System.out.println("Total: " + decimalFormat.format(dblTotal));

     }
}