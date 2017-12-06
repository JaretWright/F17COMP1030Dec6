package f17comp1030dec6;

/**
 *
 * @author jwright
 */
public class StringExperiment {
    public static void main(String[] args)
    {
        String weather = "Snow";
        
        for (int i=0; i<weather.length(); i++)
        {
            System.out.printf("The character in position %d is %c%n",i,weather.charAt(i));
        }
        
        //create a method to check if the first character is upper case
        System.out.printf("The first letter in \"%s\" %s uppercase%n", 
                                 weather, firstLetterUpperCase(weather)?"is":"is not");
        
        System.out.printf("The first letter in \"%s\" %s uppercase%n", 
                                 "cat", firstLetterUpperCase("cat")?"is":"is not");
        
        
        System.out.printf("The word \"%s\" contains the character 'S' is %b%n",
                weather, weather.contains("S"));
    }
    
    /**
     * This method will return true if the first character in a word is upper case
     */
    public static boolean firstLetterUpperCase(String word)
    {
        return (word.charAt(0) >= 65 && word.charAt(0) <= 90);
    }
}
