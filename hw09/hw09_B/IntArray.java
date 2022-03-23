
/**
 * Int Array is an array of Integers in which we add values to end of array,
 * remove values from specified index, count the out of range values and find
 * the last negatives.
 * 
 * @author Nachiketh Mamidi
 * @version 04/21/2021
 */
public class IntArray
{
    // Instance variables are declared.
    private int currentSize;
    private int[] arrayInt;
   
    /**
     * Constructor an object of IntArray by initializing the
     * instance variable to parameter.
     *
     * @param integerArray the array of integers to be managed
     * @param size of the partially filled array
     */
    public IntArray(int[] integerArray, int size)
    {
        arrayInt = integerArray;
        currentSize = size;
    }
   
    /**
     * It adds an integer value to the end of arrayInt.
     *
     * @param value the integer value to be added to the end of
     * the arrayInt
     */
    public void add(int value)
    {
        if (currentSize < arrayInt.length)
        {
            currentSize++;
            arrayInt[currentSize - 1] = value;
        }
    }
   
    /**
     * It removes the integer element from the index specified by
     * the user.
     *
     * @param index the position of element to be removed from
     * arrayInt
     */
    public void remove(int index)
    {
        if (index >= 0 && index < currentSize)
        {
            currentSize --;
            for(int i = index; i < currentSize; i ++)
            {
                arrayInt[i] = arrayInt[i + 1];
            }
        }
    }
   
    /**
     * Counts integer values which are out of Range.
     *
     * @param low the min rang
     * @param high the max range
     *
     * @return the count out of range values in the
     * intArray
     */
    public int countOfOutRange(int low, int high)
    {
        int outOfRange = 0;
        for(int i = 0; i < currentSize; i ++)
        {
            if(arrayInt[i] < low || arrayInt[i] > high)
            {
                outOfRange ++;
            }
        }
        return outOfRange;
    }
 
    /**
     * Finds the last negative number in intArray.
     *
     * @return the last negative number in intArray
     */
    public int lastNegative ()
    {
        int lastNegative = 0;
        for(int i = currentSize - 1; i >= 0; i --)
        {
            if(arrayInt[i] < 0)
            {
                lastNegative = arrayInt[i];
                break;
            }
        }
        return lastNegative;
    }
    
    /**
     * Gets a string representation of intArray enclosed in square
     * braces.
     *
     * @return a string on intger value in intArray
     */
    @Override
    public String toString()
    {
        String str = "[";
        if(currentSize > 0)
        {
            str += arrayInt[0] ;
            for(int i = 1; i < currentSize; i++)
            {
                str += ", " + arrayInt[i];
            }
        }
        return str + "]";
 
    }
}
 