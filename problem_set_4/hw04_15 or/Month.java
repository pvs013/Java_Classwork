
/**
 * Complete the method to determine if the parameter month is one of the summer
 * months, "June", "July", "August" Use a compound if
 */
public class Month
{
   /**
    * determine if the parameter  is one of the summer
    * months, "June", "July", "August"
    * @param month the month to test
    * @return true if month is "June", "July" or "August"
    */

   public boolean isSummer(String month)
   {
       if ((month.compareTo("June") == 0) ||
           (month.compareTo("July") == 0) ||
           (month.compareTo("August") == 0))
       {
           return true;
       }
       else
       {
           return false;
       }

   }
}
