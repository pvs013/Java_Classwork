// Bluej project: plurals
public class Word
{
    private String letters;

    public Word(String letters)
    {
        this.letters = letters.toLowerCase();
    }

    /**
        Forms the plural of this word.
        @return the plural, using the rules for regular nouns
    */
    public String getPluralForm()
    {
        // TODO: Complete this method
        String plural;
        
        // Check for invalid input words
        if (letters.length() < 2)
        {
            System.out.printf("Invalid word provided\n");
            plural = "invalid";
        }
        else
        {
        
            int last = letters.length()-1;  // position of last letter
                
            // If the word ends in y preceded by a consonant you take away the y and add ies.
            if (is(last,"y"))
            {
                // if second last is a vawel
                if (isVowel(last-1))
                {
                    // Add a s to end
                    plural = letters + "s";
                }
                else
                {
                    // Its a consonant, remove the y and add "ies"
                    plural = letters.substring(0,last) + "ies";
                }
            }
            else if ( is(last,"o") || is(last,"s") || 
                      (is(last,"h") && (is(last-1,"s") || is(last-1,"c"))))
                    
            {
                // ends in o, s, sh, ch   add an es
                plural = letters + "es";
            }
            else
            {
                // add an s
                plural = letters + "s";
            }
            
        }
        return plural;
    }

    /**
       Tests whether the ith letter is a vowel.
       @param i the index of the letter to test
       @return true if the ith letter is a vowel
    */
    public boolean isVowel(int i)
    {
        return is(i, "a")
               || is(i, "e")
               || is(i, "i")
               || is(i, "o")
               || is(i, "u");
    }

    /**
       Tests whether the ith letter is a consonant.
       @param i the index of the letter to test
       @return true if the ith letter is a consonant
    */
    public boolean isConsonant(int i)
    {
        return !isVowel(i);
    }

    /**
     * Checks what letter is in position i
     * @return true when the the letter of letters is the given letter.
     *         false otherwise.
     * @param i index in letters
     * @param letter the letter to match with. must be one character long.
     */
    public boolean is(int i, String letter)
    {
        return letters.substring(i, i + 1).equals(letter);
    }
}
