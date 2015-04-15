//Country names in French are feminine when they end with the letter e,
//masculine otherwise, except for the following which are masculine
//even though they end with e:

//le Belize
//le Cambodge
//le Mexique
//le Mozambique
//le Zaire
//le Zimbabwe


//Complete the method getCompleteName in the class CountryNames.
//getCompleteName takes the French name of a country as a parameter
//and adds the article: le for masculine or la for feminine,
//such as le Canada or la Belgique. However, if the country name starts
//with a vowel, use l'; for example, l'Afghanistan.

//For the following plural country names, use les:
//les Etats-Unis
//les Pays-Bas

//Here is a URL that gives English and French names for countries:
//http://www.btb.gc.ca/btb.php?lang=eng&cont=690

//Use helper methods to simplify your code and make it easier to read.

//For the draft: handle the case where the French name starts with a vowel .
//(If the name starts with a vowel, add l'). Leave all other names unchanged.

public class CountryNames
{
    /**
     * Gets the name with the proper article
     * @param name the country name
     * @return the name prepended with the proper article
     */
    public String getCompleteName(String name)
    {

        String FrenchName = ""; 
        //your code goes here
                     
        if (name.contains("Etats-Unis") ||
            name.contains("Pays-Bas"))
        {
            FrenchName = "les " + name;   // Special plural names
            }
        else if (name.contains("Belize") ||
                 name.contains("Cambodge") ||
                 name.contains("Mexique") ||
                 name.contains("Mozambique") ||
                 name.contains("Zaire") ||
                 name.contains("Zimbabwe"))
        {    
            FrenchName = "le " + name;     // Special masculine names
        }
        else if (isVowel(name.substring(0,1)))
        {
            FrenchName = "l'" + name;      // Start with a vowel 
        }
        else if (isE(name.substring(name.length()-1)))  
        {
            FrenchName = "la " + name;     // Last letter is an e   - feminine
        }
        else
        {    
            FrenchName = "le " + name;     // non-vowel - masculine
        }
        return FrenchName;    
         
    }
    
    /**
     * Checks if the letter is a Vowel
     * @param name the letter to check
     * @return true if a vowel, false otherwise
     */
    public boolean isVowel(String letter)
    {
       return ("aeiouAEIOU".contains(letter)); 
        
    }
    
    /**
     * Checks if the letter is an "E"
     * @param name the letter to check
     * @return true if an E, false otherwise
     */
    public boolean isE(String letter)
    {
       return ("eE".contains(letter)); 
        
    }

}


