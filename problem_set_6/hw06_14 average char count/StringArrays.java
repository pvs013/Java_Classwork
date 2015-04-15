//
// Complete the method in this class to find the average length of the words in an
// array list of strings and return it. The average length of words is sometimes used
// as a simple measure of reading difficulty.
//
// Note that you want to keep the fractional part of the average
//
// Hint: If yo udo not know where to start, look at the ArrayLit Algorithms to find an appropriate one.

import java.util.ArrayList;
public class StringArrays
{
   public double averageCountPerWord(ArrayList<String> words)
   {
       double average = 0;
       double sum = 0.0; //defined as double so we do double division

       // TODO: Find the total number of characters in all the words
       for (int i = 0; i < words.size(); i++)
       {
           String word = words.get(i);
           sum = sum + word.length();
       }
       
       int num_words = words.size();


       // TODO: Calculate the average
       if (num_words > 0) //supply the condition
       {
          //your code here
          average = sum / (double)num_words;
       }

       return average;
    }
}
