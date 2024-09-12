package gr11review.part1;
import java.io.*;

 public class Review4 {
    
    /*
     * A program that calculates the subtotal, tax, and total of items based on user input
     * @author: Joshua Yin
     */
    public static void main (String [] args) throws IOException {

        // Declare variables
        int intItems;
        double dblPrice;
        double dblSubtotal;
        double dblTax;
        double dblTotal;

        // Declare DecimalFormat
        java.text.DecimalFormat df = new java.text.DecimalFormat("0.00");

        // BufferedReader for user input
        java.io.BufferedReader itemReader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        // Ask user for number of items
        System.out.print("How many items do you want to buy? ");
        intItems = Integer.parseInt(itemReader.readLine());

        // Initialize dblSubtotal
        dblSubtotal = 0;

        // Loop to get prices for items
        for (int i = 1; i <= intItems; i++) {
            System.out.print("Enter the price for item " + i + ": ");
            dblPrice = Double.parseDouble(itemReader.readLine());
            dblSubtotal += dblPrice;
        }

        // Calculate tax and total
        dblTax = dblSubtotal * 0.13;
        dblTotal = dblSubtotal + dblTax;

        // Output subtotal, tax, and total
        System.out.println("Subtotal: $" + df.format(dblSubtotal));
        System.out.println("Tax: $" + df.format(dblTax));
        System.out.println("Total: $" + df.format(dblTotal));
    }
 }