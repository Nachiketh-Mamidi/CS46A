
/**
 * Write a description of class Robot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Robot
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private Picture pic;

    
    
    
    /**
     * Constructor for objects of class Robot
     * 
     * @param theX displays the x-coordinate of the upper-left corner of the robot
     * @param theY displays the y-coordinate of the upper-left corner of the robot
     * 
     */
    public Robot(int theX, int theY)
    {
        x = theX;
        y = theY;
        pic = new Picture("myrobot.jpeg");
        pic.draw();      
        pic.translate(theX * pic.getWidth(), theY * pic.getHeight());
    }
    
    
    /**
     * Moves the robot to right
     * 
     * 
     */
    public void moveRight()
    {
        moveHorizontally(1);
    }
    
    /**
     * Moves the robot down
     * 
     * 
     */
    public void moveDown()
    {
        moveVertically(1);
    }
 
    /**
     * Moves robot horizontally by a multiple of its width
     * 
     * @param steps Movement distance by the times of its width
     * 
     */
    public void moveHorizontally(int steps)
    {
        pic.translate(steps*pic.getWidth(), y);
        x = x + steps;
        
    }
    
    /**
     * Moves robot vertically by a multiple of its height
     * 
     * @param steps Movement distance by the times of its height
     * 
     */
    public void moveVertically(int steps)
    {
        pic.translate(x, steps*pic.getHeight());
        y = y + steps;
    }
    
    /**
    *  Gets the horizontal grid location of this robot.
    *  @return the horizontal grid location
    */        
    public int getX()
    {
        return pic.getX() / pic.getWidth();
    }
    
    /**
    *  Gets the horizontal grid location of this robot.
    *  @return the horizontal grid location
    */        
    public int getY()
    {
       return pic.getY() / pic.getHeight();  
    }
    
    
}
