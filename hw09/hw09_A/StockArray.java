/**
 * Write a description of class StockArray here.
 * The StockArray class manages Stock objects but uses an array instead of an 
 * array list
 *
 * @author Nachiketh Mamidi
 * @version 04/21/2021
 */
public class StockArray
{
    private Stock[] stockArray;
    private int numOfStocks;

    /**
     * Constructor for objects of class StockArray
     * 
     * @param length is the length of the array we constructed
     */
    public StockArray(int length)
    {
        stockArray = new Stock[length];
        numOfStocks = 0;
        
    }

    /**
     * Adds the stock at the specified index position and maintain the order of 
     * all elements in the array and updates numOfStocks if the array is not full
     * and the index is valid
     *
     * @param stock is the stock to be inserted  
     * @param index is the position at which the stock is to be inserted 
     */
    public void insert(Stock stock, int index)
    {
        if (numOfStocks < stockArray.length && index >= 0 && index <= numOfStocks)
        {
            for (int i = numOfStocks; i > index; i --)
            {
                stockArray[i] = stockArray[i - 1];
            }
            stockArray[index] = stock;
            numOfStocks ++;
        }
        
    }
    
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param index1 is the first index
     * @param index2 is the index to be switched with
     */
    public void swap(int index1, int index2)
    {
        if (index1 >= 0 && index1 < numOfStocks && index2 >= 0 && index2 < numOfStocks)
        {
            Stock temp = stockArray[index1];
            stockArray[index1] = stockArray[index2];
            stockArray[index2] = temp;
        }
    }
    
    /**
     * Gets the price for the stock in the array specified by the parameter symbol.
     *
     * @param  symbol the method scearches for the symbol 
     * @return price of the stock with the symbol
     */
    public double quote(String symbol) 
    {
        double price = -1;
        for(int i = 0; i < numOfStocks; i ++)
        {
            String var = stockArray[i].getSymbol();
            if (var.equals(symbol))
                price = stockArray[i].getPrice();
        }
        return price;
    }
    
    /**
     * Returns a string containing all stocks in the array in the format
     *
     * @return the array in string format 
     */
    public String toString()
    {
        String s = "[";
        if (numOfStocks > 0)
        {
            s += stockArray[0].toString();
            for (int i = 1; i < numOfStocks; i ++)
                s += ", " + stockArray[i].toString();
        }
        return s + "]";
    }
}
