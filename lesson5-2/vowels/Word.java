// BlueJ project: lesson5/vowels

public class Word
{
    private String letters;

    public Word(String letters)
    {
        this.letters = letters.toLowerCase();
    }

    /**
       Tests whether the ith letter is a vowel.
       @param i the index of the letter to test
       @return true if the ith letter is a vowel
    */
    public boolean isVowel(int i)
    {
        // TODO: Complete this method
        // A little piece of code to get you started
        String letter = letters.substring(i, i + 1);
               
        return (letter.equals("a") ||
               letter.equals("e") ||
               letter.equals("i") ||
               letter.equals("o") ||
               letter.equals("u") );
    }

    /**
       Tests whether the ith letter is a consonant.
       @param i the index of the letter to test
       @return true if the ith letter is a consonant
    */
    public boolean isConsonant(int i)
    {
        // TODO: Complete this method
        return !isVowel(i);
    }
}

