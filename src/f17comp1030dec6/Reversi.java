package f17comp1030dec6;

import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class Reversi {
    public static void main(String[] args)
    {
        //get the user to input a word
        System.out.print("Please enter a word and this program will reverse it: ");
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.nextLine();
        
        //use a loop to print the word backwards
        for (int i=word.length()-1; i>=0;  i--)
            System.out.print(word.charAt(i));
        
        System.out.println();
    }
}
