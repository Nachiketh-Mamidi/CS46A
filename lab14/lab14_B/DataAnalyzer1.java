import java.util.Scanner;

/**
   This program computes the average and maximum of a set
   of input values.
*/
public class DataAnalyzer1
{  
   public static void main(String[] args)
   {  
      Scanner in = new Scanner(System.in);
      DataSet data = new DataSet();
      DataSet data2 = new DataSet();

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
            data.add(x);
         }
      }
      
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
            data2.add(x);
         }
      }

      System.out.println("Average_1 = " + data.getAverage());
      System.out.println("Maximum_1 = " + data.getMaximum());
      
      System.out.println("Average_2 = " + data2.getAverage());
      System.out.println("Maximum_2 = " + data2.getMaximum());
   }
}