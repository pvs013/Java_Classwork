
/**
 * Complete the method to find sum of all the even numbers less than or equal to the given
 * number. Use a loop
 */
public class Sum
{
   /**
    * Gets the sum of all the even numbers less than or equal to the given number
    * @param n the given number, th ceiling
    * @return the sum of all the even numbers less that the ceiling
    */

   public int sum(int n)
   {
       int num = 2;  // even number counter
       int total = 0;  // track total sum
       
       while (num <= n)
       {
           total = total + num;
           num = num + 2;
       }
       
       return total;

   }
}
