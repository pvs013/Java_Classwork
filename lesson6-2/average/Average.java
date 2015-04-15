// Bluej project: lesson6/average

import java.util.Scanner;
// Write a program that helps a user compute their average time
// for sprinting 100 meters.
public class Average
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        double d = 0;

        do
        {
            System.out.print("Enter a value, 0 to quit: ");
            d = in.nextDouble();
            
            if (d != 0)
            {
                count++;
                sum = sum+d;
            }
        } while (d != 0);


        double average = sum / count;
        System.out.printf("Average: %.2f\n", average);
    }
}
