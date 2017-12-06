
package f17comp1030dec6;

import java.security.SecureRandom;

/**
 *
 * @author jwright
 */
public class NameLoops {
    public static void main(String[] args)
    {
        //generate a random number 1-10
        SecureRandom rng = new SecureRandom();
        int randomNum = rng.nextInt(10)+1;
        
        //print the random to the screen
        System.out.println("The random number is " + randomNum);
        
        //loop the amount of times in the random number & display my name
        for (int i=1; i<=randomNum; i++)
            System.out.println("My name is Jaret");
        
    }
}
