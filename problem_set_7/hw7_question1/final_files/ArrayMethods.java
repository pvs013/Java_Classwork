
//
// Complete the methods below. These methods manipulate Arrays of Strings
// For the draft, complete the first method
//
import java.util.Arrays;
public class ArrayMethods
{
    String[] list; //instance variable
    /**
     * Constructor for objects of class ArrayMethods
     */
    public ArrayMethods(String[] list)
    {
        // initialise instance variables
        this.list = list;
    }

    /**
     * Determines if the array is sorted (do not sort)
     * When Strings are sorted, they are in alphabetical order
     * Use the compareTo method to determine which string comes first
     * You can look at the String compareTo method in the Java API
     * @return true if the array  is sorted else false.
     */
    public boolean isSorted()
    {
        boolean sorted = true;

        // TODO: Write the code to loop through the array and determine that each
        // successive element is larger than the one before it
        int i = 1;  // index - start at 2nd entry.  if only one it is sorted
        while (sorted && i < list.length)
        {
            String word1 = list[i-1];
            String word2 = list[i];
            if (word1.compareTo(word2) > 0)
            {
                sorted = false;
            }
            else
            {
                i++;
            }
        }

        return sorted;
    }

    /**
     * Replaces all but the first and last with the larger of its to neighbors
     * You can use the compareTo to determine which string is larger (later in alphabetical
     * order.
     * @return a string representation of the array list. (do this with list.toString()
     */
    public void replaceWithLargerNeighbor()
    {
        for (int i = 1; i< list.length; i++) 
        {
            String word1 = list[i-1];
            String word2 = list[i];
            if (word1.compareTo(word2) < 0)
            {
                // if word1 is not the 1st entry
                // replace word1 with word2
                if (i-1 > 0)
                {
                    list[i-1] = word2;
                }
            }
            else
            {
                // if word2 is not the last entry
                // replace word1 with word2
                if (i < list.length-1)
                {
                    list[i] = word1;
                }
            }
            
        }


    }

    /**
     * Gets the number of duplicates in the list.
     * (Be careful to only count each duplicate once. Start at index 0. Does it match any of the other element?
     * Get the next word. It is at index i. Does it match any of the words with index > i?)
     * @return the number of duplicate words in the list
     */
    public int countDuplicates()
    {
        int duplicates = 0;
        String[] dups = new String[list.length];
        
        // TODO: Write the code to get the number of duplicates in the list
        for (int i = 0; i < list.length; i++)
        {
            String word = list[i];
                        
            for (int j = i+1; j < list.length; j++)
            {
                if (word.equals(list[j]) == true)
                {
                    // if word is not already in dups list
                    // add to dups list
                    // add to counter
                    duplicates++;
                }
            }
            
        }
       

        return duplicates;
    }

     /**
     * Moves any word that startw with x, y, or z to the front of the arraylist, but
     * otherwise prserves the order
     */
    public void xyzToBack()
    {
        int insertAt = list.length-1;

        // TODO:  Move any word that starts with x, y, or z to the back of the arraylist, but otherwise preserves the order
        for (int i = list.length-1; i >=0 ; i--)
        {
            String word = list[i];
            if (word.startsWith("x") || word.startsWith("y") || word.startsWith("z"))
            {
                // move the word to the back
                move(i, insertAt);
                insertAt--;
            }
        }
    }
     /**
     * Moves any word that startw with x, y, or z to the front of the arraylist, but
     * otherwise prserves the order
     */
    public void xyzToFront()
    {
        int insertAt = 0;

        // TODO:  Move any word that starts with x, y, or z to the front of the arraylist, but otherwise preserves the order
        for (int i = 0; i < list.length; i++)
        {
            String word = list[i];
            if (word.startsWith("x") || word.startsWith("y") || word.startsWith("z"))
            {
                // move the word to the front
                move(i, insertAt);
                insertAt++;
            }
        }
    }

    /**
     * Moves a value within the array
     * @param index_from moving from index position
     * @param index_to moving to index position
     */
    public void move(int index_from, int index_to)
    {
       String savevalue= list[index_from];
       
       if (index_from == index_to)
       {
           //no move needed
           return;
       }
       else if (index_from > index_to)
       {
           
           for (int i = index_from; i > index_to; i--)
           {
               list[i] = list[i-1];   //move to right
           }
           list[index_to] = savevalue;  // move saved value
       }
       else
       {
           for (int i = index_from; i <= index_to; i++)
           {
               list[i] = list[i+1];   //move to left
           }
           list[index_to] = savevalue;
       }
       
    
    }
    
    /**
     * Swaps the values from two index positions
     * @param index1 1st index position
     * @param index2 2nd index position
     */
    public void swap(int index1, int index2)
    {
        String save_value = list[index1];
        
        list[index2] = list[index1];
        list[index1] = save_value;
        
        return;
    }
    
    /**
     * gets the string representati of tis array list
     * @returns the string representat-ion of thiarray list in
     * standard collectiuon format
     */
    public String toString()
    {
        return Arrays.toString(list);
    }
}