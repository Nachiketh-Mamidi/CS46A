
/**
 * Write a description of class Cube here.
 * Creating a class Cube and lits constructors and methods
 *
 * @author Nachiketh Mamidi
 * @version March 5, 2021
 */
public class Cube
{
    // instance variables - replace the example below with your own
    private double x;

    /**
     * Constructs an object Cube with side as parameter
     * 
     * @param takes the value of side as parameter
     */
    public Cube(double side)
    {
        // initialise instance variables
        x = side;
    }
    
    /**
     * Returns the value of slide
     *
     * @return returns value of slide
     */
    public double getSide()
    {
        return x;
    }
    
    /**
     * Sets new value to side
     *
     * @param  sets new value to instance variable
     */
    public void setSide(double newSide)
    {
        x = newSide;
    }
    
    /**
     * Calculates surface area and returns it
     *   
     * @return returns surface area
     */
    public double getSurfaceArea()
    {
        double surfaceArea = 6 * Math.pow(x, 2);
        return surfaceArea;
    }
    
    
}
