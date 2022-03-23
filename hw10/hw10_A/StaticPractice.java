import java.util.ArrayList;

/**
 * Write a description of class StaticPractice here.
 * Contains methods for arrays and arraylists
 *
 * @author Nachiketh Mamidi
 * @version 05/05/2021
 */
public class StaticPractice
{
    /**
     * Gets the average value of all positive elements in the array
     *
     * @param int[] numbers is a array of integers
     * @param size is the length of array
     * 
     * @return average value of all positive elements in the array
     */
    public static double averageOfPositive (int[] numbers, int size) 
    {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < size; i ++)
        {
            int var = numbers[i];
            if (var > 0)
            {
                sum += var;
                count ++;
            }
        }
        if (sum == 0)
            return 0;
        else
            return sum / count;
    }
    
    /**
     * Gets the average value of all positive elements in the array list.
     *
     * @param ArrayList<Integer> numbers is an arraylist of integers
     * 
     * @return average value of all positive elements in the array list
     */
    public static double averageOfPositive (ArrayList<Integer> numbers)
    {
        int count = 0;
        int sum = 0;
        for (int var : numbers)
        {
            if (var > 0)
            {
                sum += var;
                count ++;
            }
        }
        if (sum == 0)
            return 0;
        else
            return sum / count;
    }
    
    /**
     * Gets the count of occurrences of target in the array
     *
     * @param String[] list is an array of strings
     * @param int size is the length of array
     * @param String target is what we are trying to find
     * 
     * @return count of occurrences of target in the array    
     */
    public static int count(String[] list, int size, String target)
    {
        int count = 0;
        for (int i = 0; i < size; i ++)
        {
            String var = list[i];
            if (var.equals(target))
            {
                count ++;
            }
        }
        return count;
    }
    /**
     * Gets the count of occurrences of target in the array list
     *
     * @param ArrayList<String> list is an arraylist of strings
     * @param String target is the what we are trying to find
     * 
     * @return count of occurrences of target in the array list
     */
    public static int count(ArrayList<String> list, String target)
    {
        int count = 0;
        for (String var : list)
        {
            if (var.equals(target))
            {
                count ++;
            }
        }
        return count;
    }
    
}
