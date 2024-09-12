package gr11review.part1;
import java.io.*;

 public class Review7 {
 
    /*
     * A program that calculates stats about a sentence such as the number of characters, spaces, and letter a, and outputs a string with dashes for every odd character in the sentence
     * @author: Joshua Yin
     */
    public static void main (String [] args) {

        // Declare variables
        String theSentence;
        int intCharacters;
        int intSpaces;
        int intLetterA;
        String strOddCharacters;

        // BufferedReader for user input
        BufferedReader sentenceReader = new BufferedReader(new InputStreamReader(System.in));
        
        // Initialize variables
        intCharacters = 0;
        intSpaces = 0;
        intLetterA = 0;
        strOddCharacters = "";

        // Ask user for a sentence
        System.out.print("Enter a sentence: ");
        try {
            theSentence = sentenceReader.readLine();
        } catch (IOException e) {
            theSentence = "";
        }

        // Calculate stats about the sentence
        for (int i = 0; i < theSentence.length(); i++) {
            intCharacters++;
            if (theSentence.charAt(i) == ' ') {
                intSpaces++;
            }
            if (theSentence.charAt(i) == 'a') {
                intLetterA++;
            }
            if (i % 2 == 0) {
                strOddCharacters += "-";
            }
        }

        // Output stats about the sentence
        System.out.println("There are " + intCharacters + " characters in the sentence.");
        System.out.println("There are " + intSpaces + " spaces in the sentence.");
        System.out.println("There are " + intLetterA + " letter a in the sentence.");
        System.out.println(strOddCharacters);
    }
}