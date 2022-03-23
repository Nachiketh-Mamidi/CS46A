import java.util.Scanner;

/**
   This program computes the average and maximum of a set
   of input values.
*/
public class DataAnalyzer2
{  
   public static void main(String[] args)
   {  
      Scanner in = new Scanner(System.in);
      double sum = 0;
      double count = 0;
      double maximum = 0;
      boolean done = false;
      while (!done)
      {  
         System.out.print("Enter value, Q to quit: ");
         String input = in.next(); 
         if (input.equalsIgnoreCase("Q"))
            done = true;
         else
         {  
            double x = Double.parseDouble(input);
            sum = sum + x;
            if (count == 0 || maximum < x) maximum = x;
            count++;
         }
      }

      double average;
      if (count == 0) average = 0;
      else average = sum / count;
      
      double sum2 = 0;
      double count2 = 0;
      double maximum2 = 0;
      boolean done2 = false;
      while (!done2)
      {  
         System.out.print("Enter value, Q to quit: ");
         String input = in.next(); 
         if (input.equalsIgnoreCase("Q"))
            done2 = true;
         else
         {  
            double x = Double.parseDouble(input);
            sum2 = sum2 + x;
            if (count2 == 0 || maximum2 < x) maximum2 = x;
            count2++;
         }
      }

      double average2;
      if (count2 == 0) average2 = 0;
      else average2 = sum2 / count2;

      System.out.println("Average_1 = " + average);
      System.out.println("Maximum_1 = " + maximum);
      System.out.println("Average_2 = " + average2);
      System.out.println("Maximum_2 = " + maximum2);
   }
}