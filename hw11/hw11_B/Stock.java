/**
 * Models stock objects managed by a financial company.
 * 
 * @author  Nachiketh Mamidi
 * @version 05/13/2021
 */
public class Stock implements Comparable
{
    private String symbol;
    private double price;

    /**
     * Constructs a Stock object with the given symbol and price.
     * 
     * @param theSymbol this stock's symbol
     * @param the Price this stock's price
     */
    public Stock(String theSymbol, double thePrice)
    {
        symbol = theSymbol;
        price = thePrice;
    }

    /**
     * Gets the price of this stock.
     * 
     * @return the current price
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * Gets the symbol for this stock.
     * 
     * @return the symbol
     */
    public String getSymbol()
    {
        return symbol;
    }

    /**
     * Returns a string representing this stock.
     * 
     * @return a string in the format
     *         Stock[symbol=AAPL,price=134.87]
     */
    @Override
    public String toString()
    {
        String s = getClass().getName() + "[symbol=" + symbol
          + ",price=" + price + "]";
        return s;
    }
    
    /**
     * Compares stocks
     * 
     * @return an int -1, 0, 1 after comparing stocks
     */
    public int compareTo(Object obj)
    {
        Stock other = (Stock) obj;
        int price = Double.compare(this.price, other.price);
        if (price == 0)
            price = this.symbol.compareTo(other.symbol);
        return price;
    }
}