import java.util.Scanner;
/**
 * A Java application to process a sequence of integers
 * as temperatures.
 *
 * @author  Nachiketh Mamidi
 * @version April 4th, 2021
 */
public class Temperatures
{
    public static final int FREEZE_POINT = 32;
    public static final int ZERO = 0;
    
    public static int high, secondHigh;
    public static int negativeCount = 0, belowFreezeCount = 0;
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the first temperature Fahrenheit: ");
        high = in.nextInt();
        updateCounts(high);
        
        System.out.print("Enter the second temperature Fahrenheit: ");
        secondHigh = in.nextInt();
        updateCounts(secondHigh);
        
        if (secondHigh > high)
        {
            swapTwoHighest();
        }
        
        System.out.print("Enter another temperature Fahrenheit or Q to quit: ");
        while (in.hasNextInt())
        {
            int temp = in.nextInt();
            updateCounts(temp);
            if (temp > secondHigh)
            {
                secondHigh = temp;
                if (secondHigh > high)
                {
                    swapTwoHighest();
                }
            }
            System.out.print("Enter another temperature Fahrenheit or Q to quit: ");
        }
        
        System.out.printf("Number of negative temperatures: %d%n", negativeCount);
        System.out.printf("Number of below freezing point temperatures: %d%n", belowFreezeCount);
        System.out.printf("The highest temperature: %d%n", high);
        System.out.printf("The second highest temperature: %d%n", secondHigh);
        
        
        

    }

    /**
     * Swaps the two highest temperatures stored in
     * high and secondHigh.
     */
    private static void swapTwoHighest()
    {
        int var = ZERO;
        var = secondHigh;
        secondHigh = high;
        high = var;
    }
    
    /**
     * Updates negativeCount and belowFreezeCount
     * using a temperatures value.
     * 
     * @param value the temperature used to update
     *        the two counts
     */
    private static void updateCounts(int value)
    {
        if (value < FREEZE_POINT)
        {
            belowFreezeCount ++;
        }
        if (value < ZERO)
        {
            negativeCount ++;
        }
    }
}