
/**
 * Complete the method to find the largest power of 2 less than the given number
 * Use a loop
 */
public class MathUtil
{

   public int largestPowerOf2(int n)
   {
       int val=0;
       int p2 = 0;
       
       while (n > (int)Math.pow(2, val))
       {
           p2 = (int)Math.pow(2, val);
           val++;
       }
                 
       return p2;
   }
}
