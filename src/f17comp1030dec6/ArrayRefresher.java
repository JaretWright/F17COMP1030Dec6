
package f17comp1030dec6;

import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class ArrayRefresher {
    public static void main(String[] args)
    {
        //define an array to hold temperature data
        int[] temps = new int[7];
        String[] daysOfWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        
        //create a loop that will go over the array called temps
        //and have the user enter a temperature for each day
        for (int i=0; i<temps.length; i++)
        {
            System.out.printf("Please enter the temperature for %s: ", daysOfWeek[i]);
            Scanner keyboard = new Scanner(System.in);
            temps[i]=keyboard.nextInt();
        }
        
        //part 2 - now create a loop that will display what the user entered.
        //the display should include the name for the day of the week
        //for example:
        //On Monday, the temperature was 6
        //On Tuesdat, the temperature was 10
        //etc...
       for (int i=0; i<temps.length; i++)
       {
           System.out.printf("The temperature on %s was %dC%n", daysOfWeek[i],temps[i]);
       }
    }
}
