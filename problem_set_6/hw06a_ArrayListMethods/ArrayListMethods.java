//
//Complete the class ArrayListMethods. It consists of four short methods to manipulate an array list of strings.
//The method header and javadoc are given to you.
//
//For the draft, provide the isSorted method.
//

import java.util.ArrayList;
public class ArrayListMethods
{
    ArrayList<String> list; //instance variable
    /**
     * Constructor for objects of class ArrayListMethods
     */
    public ArrayListMethods(ArrayList<String> arrayList)
    {
        // initialise instance variables
        list = arrayList;
    }

    /**
     * Determines if the array list is sorted (do not sort)
     * When Strings are sorted, they are in alphabetical order
     * Use the compareTo method to determine which string comes first
     * You can look at the String compareTo method in the Java API
     * @return true if the array list is sorted else false.
     */
    public boolean isSorted()
    {
        boolean sorted = true;
        int i = 1;  // starting at 2nd entry, if there isn't one its sorted ;-)
        

        // TODO: Determine if the array is sorted.
        while (sorted && i< list.size()) 
        {
            String word1 = list.get(i-1);
            String word2 = list.get(i);
            if (word1.compareTo(word2) > 0)
            {
                sorted = false;
            }
            else
                i++;
        }

        return sorted;
    }

    /**
     * Replaces all but the first and last with the larger of its to neighbors
     * You can use compareT to determine which string is larger (later in alphabetical
     * order.
     * @return a string representation of the array list. (do this with list.toString()
     */
    public void replaceWithLargerNeighbor()
    {

        // TODO: Replace all but the first and last elements with the larger of its to neighbors
    
        for (int i = 1; i< list.size(); i++) 
        {
            String word1 = list.get(i-1);
            String word2 = list.get(i);
            if (word1.compareTo(word2) < 0)
            {
                // if word1 is not the 1st entry
                // replace word1 with word2
                if (i-1 > 0)
                {
                    list.set(i-1, word2);
                }
            }
            else
            {
                // if word2 is not the last entry
                // replace word1 with word2
                if (i < list.size()-1)
                {
                    list.set(i, word1);
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
        ArrayList<String> testlist = new ArrayList<String>(list);
        
        // TODO: Write the code to get the number of duplicates in the list
        for (int i = 0; i < testlist.size(); i++)
        {
            String word = testlist.get(i);
                        
            for (int j = i+1; j < testlist.size(); j++)
            {
                if (word.equals(testlist.get(j)) == true)
                {
                    testlist.remove(j);
                    j--;  /// decrease j after remove from testlist
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
    public void xyzToFront()
    {
        int insertAt = 0;

        // TODO:  Move any word that starts with x, y, or z to the front of the arraylist, but otherwise preserves the order
        for (int i = 0; i < list.size(); i++)
        {
            String word = list.get(i);
            if (word.startsWith("x") || word.startsWith("y") || word.startsWith("z"))
            {
                // move the word to the front
                list.remove(i);
                list.add(insertAt, word);
                insertAt++;
            }
        }
    }

    /**
     * gets the string representation of this array list
     * @returns the string representation of this array list in
     * standard collectiuon format
     */
    public String toString()
    {
        return list.toString();
    }
}


