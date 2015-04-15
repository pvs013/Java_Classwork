import java.util.Scanner;

public class MileagePrinter
{
   
   
    public static void main(String[] args)
   {
       final double COST_PER_GALLON = 3.95;
       // Asks the user to input the following values:
       //	The number of gallons currently in the tank
       //	The fuel efficiency in miles per gallon
       Scanner in = new Scanner(System.in);
       System.out.print("Enter the number of gallons of gas in the tank ");    // prompt fuel
       double fuel = in.nextDouble();
       
       System.out.print("Enter the fuel efficiency ");  // prompt fuel efficiency
       double mpg = in.nextDouble();
       
       // If mgp <= 0 print No can go
       if (mpg <= 0)
       {
           System.out.print("No can go");
       }
       else
       {
           System.out.printf("Distance: %8.1f\n", fuel * mpg);
           double cost = ((100/mpg)*COST_PER_GALLON);
           System.out.printf("Cost: %8.2f\n", cost);   
       }
   }
}
