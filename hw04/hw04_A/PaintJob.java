
/**
 * Write a description of class PaintJob here.
 * Make a class paintJob that has constructors and methods 
 * to find cost of painting a room
 * 
 * @author Nachiketh Mamidi
 * @version Feb 27,2021
 */
public class PaintJob
{
    public static final int SQ_INCHES_PER_SQ_FOOT = 144;
    public static final double WALL_HEIGHT_IN_FEET = 8;
    public static final double DOOR_HEIGHT_IN_INCHES = 80;
    public static final double DOOR_WIDTH_IN_INCHES = 32;
    public static final double WINDOW_HEIGHT_IN_FEET = 5;
    public static final double WINDOW_WIDTH_IN_FEET = 4;
    public static final double COST_GALLON_PAINT = 31.95;
    public static final double COST_OF_LABOUR = 100;
    public static final double SQ_FEET_PER_GALLON = 300;
    
    // instance variables
    private double l;
    private double w;
    
    /**
     * Constructor for objects of class PaintJob
     * 
     * @param theLength is the length of the room to paint
     * @param theWidth is the width of the room to paint
     */
    public PaintJob(double theLength, double theWidth)
    {
        l = theLength;
        w = theWidth;
    }

    /**
     * This method return the length of the room
     *
     * @return getLength returns length
     */
    public double getLength()
    {
        return l;
    }
    
    /**
     * This method return the width of the room
     *
     * @return getWidth returns width
     */
    public double getWidth()
    {
        return w;
    }
    
    /**
     * This methond sets a new length and width 
     * in feet for the room
     * 
     * @param newLength sets new length in feet for the room
     * @param newWidth sets new width in feet for the room
     */
    public void setDimensions(double newLength, double newWidth)
    {
        l = newLength;
        w = newWidth;
    }
    
    /**
     * This methond sets Gets the surface area to paint,
     * excluding the area of the door or window.
     * 
     * @return surfaceArea returns surface area of room 
     *         excluding the area of the door or window
     */
    public double surfaceArea()
    {
        double area = (2 * (l * w + l * WALL_HEIGHT_IN_FEET +
                      w * WALL_HEIGHT_IN_FEET)) - l * w;
        double windowA =  WINDOW_HEIGHT_IN_FEET * WINDOW_WIDTH_IN_FEET;
        double doorA = DOOR_HEIGHT_IN_INCHES * DOOR_WIDTH_IN_INCHES / 
                        SQ_INCHES_PER_SQ_FOOT;
        double surfaceArea = area - windowA - doorA;
        return surfaceArea;           
    }
    
    /**
     * This methond gets the cost of the paint 
     * for thisjob.
     * 
     * @return costOfPaint returns cost of paint
     */
    public double costOfPaint()
    {
        double costOfPaint = (surfaceArea()* COST_GALLON_PAINT)
                                / SQ_FEET_PER_GALLON;
        return costOfPaint;
    }
    
    /**
     * This methond gets the cost of thisjob
     * 
     * @return totalJobCost returns cost of total job.
     */
    public double totalJobCost()
    {
        double totalJobCost = COST_OF_LABOUR + costOfPaint();
        return totalJobCost;
    }
}
