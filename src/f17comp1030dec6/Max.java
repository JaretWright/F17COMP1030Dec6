
package f17comp1030dec6;

/**
 *
 * @author jwright
 */
public class Max {
    public static void main(String[] args)
    {
        //declare an array with 4 integers
        int[] numbers = {88,55,44,-10};
        
        //send the array to a method called max
        System.out.printf("The largest number is %d", max(numbers));
    }
    
    //the method returns the largest integer in the array
    public static int max(int[] array)
    {
        int highestNum = array[0];
        
        for (int i=1; i<array.length; i++)
        {
            if (array[i]>highestNum)
                highestNum = array[i];
        }
        return highestNum;
    }
}
