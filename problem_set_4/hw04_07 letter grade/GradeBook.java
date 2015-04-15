//hw04_07
/**
 * Complete the method below so that it returns the correct letter grade
 * for the number grade and return the letter grade as a string
 */
public class GradeBook
{
    /*
     * Gets the letter grade associated with this numberic grade
     * @param grade the numeric grade
     * @return the corresponding letter grade
     */

    public String getLetterGrade(int grade)
    {
        String letter = "";
        if (grade >= 90)
        {
           letter = "A";
        }
        else if (grade >= 80)
        {
            letter = "B";
        }
        else if (grade >= 70)
        {
            letter = "C";  
        }
        else if (grade >= 60)
        {
            letter = "D";
        }
        else 
        {
            letter = "F";
        }
        
        return letter;   
    }
}
