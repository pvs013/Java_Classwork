//
// Complete the method in this class to return the number of strings
// that start with the target
//

import java.util.ArrayList;
public class Counter
{
   /**
    * Gets the number of strings that starts with the target
    * @param text the array list to process
    * @param target the desired letter
    * @return the count of strings starting with target
    */
    public int getCount(ArrayList<String> text, String target)
    {
       int counter = 0;
       // TODO: Adapt an ArrayList algorithm to return the number of String that start withthe target
       for (int i = 0; i < text.size(); i++)
       {
           String word = text.get(i);
           if (word.startsWith(target))
           {
               counter++;
           }
       }

       return counter;
    }
}