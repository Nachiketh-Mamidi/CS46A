import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class StockList here.
 * Class StockList manages an array list of class Stock 
 *
 * @author Nachiketh Mamidi
 * @version 05/13/2021
 */
public class StockList
{
    private ArrayList<Stock> stockList;
    /**
     * Constructor for objects of class StockList
     */
    public StockList()
    {
        stockList = new ArrayList<Stock>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param s Adds a stock s to the end of the list.
     */
    public void add(Stock s)
    {
        stockList.add(s);
    }
    
    /**
     * Swaps the element at index1 with the element at index2. 
     * If either index is out of bounds, do not changing anything.
     *
     * @param index1 is the index to be swapped.
     * @param index2 is the index1 to be swapped with.
     */
    public void swap(int index1, int index2)
    {
        if (index1 >= 0 && index1 < stockList.size() && index2 >= 0 && index2 < stockList.size())
        {
            Stock var = stockList.get(index1);
            stockList.set(index1, stockList.get(index2));        
            stockList.set(index2, var);
        }
    }
    
    /**
     * Gets the symbol for the Stock with the lowest price
     * per share. If more than one Stock has the same price, 
     * return the symbol for the first. If the list is empty, 
     * return the empty string.
     *
     *
     * @return the symbol for the first lowest price
     */
    public String cheapest()
    {
        double maxPrice = Double.MAX_VALUE;
        Stock max = null;
        for (Stock stock : stockList)
        {
            double price = stock.getPrice();
            if (price < maxPrice)
            {
                max = stock;
                maxPrice = price;
            }
        }
        if (stockList.size() == 0)
            return "";
        else
            return max.getSymbol();
    }
    
    /**
     * Returns the string returned from calling the toString() 
     * method on the list.
     *
     * @return Returns the string returned from calling the
     *  toString() method on the list.
     */
    public String toString()
    {
        return stockList.toString();
    }
    
    /**
     * Sorts the array
     */
    public void sort()
    {
        Collections.sort(stockList);
    }
}
