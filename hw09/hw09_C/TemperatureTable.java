/**
 * A Java class manages a 2-D array of integers for 
 * temperatures at a location.
 *
 * @author  Qi Yang
 * @version 2021-04-07
 */
public class TemperatureTable
{
    private int[][] tempTable;

    /**
     * Constructor for objects of class TemperatureTable.
     * 
     * @param temps the 2-D array of integers storing 
     *              temperatures for one location
     */
    public TemperatureTable(int[][] temps)
    {
        tempTable = temps;
    }

    /**
     * Gets the average of the specified column.
     *
     * @param colIndex the index of the specified column
     * @return the average of the specified column
     */
    public double columnAverage(int colIndex)
    {
        double sum = 0.0;
        for (int row = 0; row < tempTable.length; row ++)
            sum += tempTable[row][colIndex];
        return sum / tempTable.length;
    }

    /**
     * Gets the largest value of the specified row.
     * 
     * @param rowIndex the index of the specified row
     * @return the largest value of the specified row
     */
    public int rowMax(int rowIndex)
    {
        int highest = tempTable[rowIndex][0];
        for (int col = 1; col < tempTable[rowIndex].length; col ++)
                if (highest < tempTable[rowIndex][col])
                    highest = tempTable[rowIndex][col];
                    
        return highest;
    }
    
    /**
     * Returns the value that is larger than the specified limit,
     * has the max row index among all values larger than the
     * specified limit, and has the smallest column index among
     * all such values in the row.
     * Returns the limit if no values in the 2-D array is larger
     * than the limit.
     * 
     * @param limit the specified limit value
     * @return the special values as specified
     *         limit if no values is less than limit
     */
    public int largerValueInMaxRowMinColumn(int limit)
    {
        for (int row = tempTable.length -1; row >= 0; row --)
            for (int col = 0; col < tempTable[0].length; col ++)
                if (tempTable[row][col] > limit)
                    return tempTable[row][col];

        return limit;
    }
}
