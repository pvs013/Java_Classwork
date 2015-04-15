// Write code for the shorten(String longPost) method.   
public class Twitterizer
{
    /**
     * Shortens and prints longPost by removing vowels
     * @param longPost the post whose vowels need to be removed.
     */
    public String shorten(String longPost) 
    {
        String shortPost ="";
        
        for (int i=0; i < longPost.length(); i++)
        {
	        String letter = longPost.substring(i, i+1);
	        if ("aeiouAEIOU".contains(letter))
	        {
	            continue;
	        }
	        else
	        {
		       shortPost = shortPost + letter;
	        }
        }
        return shortPost;
    }
}
