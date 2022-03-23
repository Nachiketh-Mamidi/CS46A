import java.text.NumberFormat;
import java.util.Locale;

/**
 * Write a description of class MyNumber here.
 * Uses if statemnts and formats the number by using commas
 *
 * @author Nachiketh Mamidi
 * @version 03/08/2021
 */
public class MyNumber
{
    // instance variables
    private int x;

    /**
     * Constructor for objects of class MyNumber
     * 
     * @param  value is the number 
     */
    public MyNumber(int value)
    {
        setNumber(value);
    }

    /**
     * Returns the number
     *
     * @return  getNumber returns the number
     */
    public int getNumber()
    {
        return x;
    }
    
    /**
     * Sets the stored number to a new value.
     *
     * @param value New value of x
     */
    public void setNumber(int value)
    {
        if (value < 0)
        
            x = value * -1;
        
        else
            x = value;
    }
    
    /**
     * Gets the number of digits in this number.
     * 
     * @return  getNumber returns the number of digits
     */
    public int digitCount()
    {
        int digitCount = String.valueOf(x).length();
        return digitCount;
    }
    
    /**
     * Sets the stored number to a new value.
     *
     * @return formatted number or if the number is too big if not, the 
     * formatted number
     */
    public String formatWithComma()
    {
        if (x < 1000000)
        {
            NumberFormat nf = NumberFormat.getInstance(new Locale("en", "US"));
            String val = nf.format(x);
            return val;
        }
        else
        { 
            String end = "too big";
            return end;
        }
    }
}
