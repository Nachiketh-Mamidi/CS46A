/**
 * The Java class models circle objects.
 * 
 * Step 1: Enter your name and a date
 * @author  Nachiketh Mamidi
 * @version 05/13/2021
 */
// Step 2: Implement interface HasArea
public class Circle implements HasArea
{
    private double radius;

    /**
     * Constructor for objects of class Circle.
     * 
     * @param radius the radius of this Circle object
     */
    public Circle(double radius)
    {
        this.radius = radius;
    }
    
    /**
     * Gets the radius of this circle.
     * 
     * @return the radius of this circle
     */
    public double getRadius()
    {
        return radius;
    }
    
    /**
     * Sets the radius of this circle.
     * 
     * @param newRadius the new radius
     */
    public void setRadius(int newRadius)
    {
        radius = newRadius;
    }
    
    /**
     * Gets a string representation for this circle.
     * 
     * @return a string for this circle in the format
     *         Circle[Radius=12.45]
     */
    @Override
    public String toString()
    {
        return "Circle[Radius=" + radius + "]";
    }
    
    // Step 3: Implement the method for interface HasArea
    /**
     * uses method from interface
     * 
     * @return area of circle
     */
    public double area()
    {
        return radius * radius * Math.PI;
    }
}