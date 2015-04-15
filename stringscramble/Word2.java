
/**
 * Write a description of class Word2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Word2
{
    // instance variables - replace the example below with your own
    private String word;

    /**
     * Constructor for objects of class Word2
     */
    public Word2(String thisWord)
    {
        // initialise instance variables
        word = thisWord;
    }

    /**
     * Gets all the substrings of this Word.
     * @return all substrings of this Word separated by newline
     */
    public String getSubstrings()
    {
        // put your code here
        String result = "";
        
        // get each letter
        for (int c=1; c <= word.length(); c++)
        {
            for (int i=0; i <= word.length()-c;i++)
            {
                result = result + word.substring(i, i+c) + "\n";
            }
        }
        return result;
    }
}
