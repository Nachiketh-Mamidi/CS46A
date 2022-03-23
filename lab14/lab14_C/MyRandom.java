
/**
 * Write a description of class MyRandom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyRandom
{
    // instance variables - replace the example below with your own
    private int num;

    /**
     * Constructor for objects of class MyRandom
     */
    public MyRandom(int var)
    {
        num = var;
    }

    /**
     * Generating an integer between m and n (inclusive)
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String randomInt(int m, int n)
    {
        String str= "";
        for (int i = 1; i <= num; i++)
        {  
            double var = (n - m) * Math.random();
            int result = m + (int)var; 
            str += result + " ";
        }
        return str;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String randomDouble(double x, double y)
    {
        String str= "";
        for (int i = 1; i <= num; i++)
        {  
            double result = x + Math.random() * (y - x);
            str = result + " ";
        }
        return str;
    }
}
