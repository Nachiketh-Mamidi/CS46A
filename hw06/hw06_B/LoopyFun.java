
/**
 * Write a description of class LoopyFun here.
 * Takes a integer as an input and calculates and 
 * returns the factoral and sum of powers of two.
 *
 * @author Nachiketh Mamidi
 * @version March 22, 2021
 */
public class LoopyFun
{
    private int x;
    /**
     * Constructor for objects of class LoopyFun
     * 
     * @param var is the number
     */
    public LoopyFun(int var)
    {
        if (var > 0)
        {
            x = Math.abs(var);
        }
        else if (var == 0)
        {
            x = 1;
        }
        else if (var < 0)
        {
            x = -1 * var;
        }
    }

    /**
     * Gets the stored number
     * 
     * @return getNum returns the stored number
     */
    public int getNum()
    {
        return x;
    }
    
    /**
     * Calculates and returns the factorial of the 
     * stored integer.
     *
     * @return The factorial of the number
     */
    public int factorial()
    {
        int factorial = 1;
        for (int i = 1; i <= x; i++)
        {
            factorial = factorial * i; 
        }
        return factorial;
    }
    
    /**
     * Calculates and returns the sum of powers of 
     * two for all integer powers from 0 (inclusive)
     * to the stored integer (exclusive)
     *
     * @return returns sum of powers of two from 0 
     * to the number.
     */
    public int sumOfPowersOfTwo()
    {
        int sum = 0;
        for (int i = 0; i < x; i++)
        {
            sum += Math.pow(2,i); 
        }
        return sum;
    }
}
