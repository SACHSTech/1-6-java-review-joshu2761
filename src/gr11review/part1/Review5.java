package gr11review.part1;
import java.io.*;

 public class Review5 {
    
    /*
     * A program that calculates the number of years it will take to reach a target amount based on yearly invested amount, compound interest rate, and target amount
     * @author: Joshua Yin
     */
    
    public static void main (String [] args) throws IOException {

        // Declare variables
        double dbl_yearly_amount;
        double dbl_compound_interest_rate;
        double dbl_target_amount;
        double dbl_total_amount;
        int int_number_of_years;

        // BufferedReader for user input
        BufferedReader interestReader = new BufferedReader(new InputStreamReader(System.in));
        
        // Initialize number of years variable
        int_number_of_years = 0;
        dbl_total_amount = 0;

        // Ask user for yearly invested amount
        System.out.print("Enter the yearly invested amount: ");
        dbl_yearly_amount = Double.parseDouble(interestReader.readLine());

        // Ask user for compound interest rate
        System.out.print("Enter the compound interest rate: ");
        dbl_compound_interest_rate = Double.parseDouble(interestReader.readLine());

        // Ask user for target amount
        System.out.print("Enter the target amount: ");
        dbl_target_amount = Double.parseDouble(interestReader.readLine());

        // Loop to calculate number of years
        while (dbl_total_amount < dbl_target_amount) {
            dbl_total_amount = (dbl_total_amount + dbl_yearly_amount)  * (dbl_compound_interest_rate / 100 + 1);
            int_number_of_years++;
        }

        // Output number of years
        System.out.println("The target amount will be earned in " + int_number_of_years + " years.");
    }
 }