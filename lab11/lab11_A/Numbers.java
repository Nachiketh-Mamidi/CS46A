import java.util.Scanner;
/**
 * Write a description of class Numbers here.
 *
 * @author Nachiketh MAmid
 * @version 04/16/2021
 */
public class Numbers
{
    /**
       Computes the number of even and odd values in a given array
       @param values an array of integer values
       @return an array of length 2 whose 0 entry contains the count
       of even elements and whose 1 entry contains the count of odd
       values
    */  
    public static int[] evenOdds(int[] values)
    {
        int evenCounter = 0;
        int oddCounter = 0;
        for (int var : values)
        {
            if (var % 2 != 0)
            {
               oddCounter ++;
            }
            else
                evenCounter ++;
        }
        int[] result = new int[2];
        result[0] = evenCounter;
        result[1] = oddCounter;
        return result;
    }
}

