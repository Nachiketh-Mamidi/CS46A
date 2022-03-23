
/**
 * Write a description of class SnowMan here.
 * Constructs a Snowman at the coordinates x, y
 *
 * @author Nachiketh Mamidi
 * @version Feb 22, 2021
 */
public class SnowMan
{
    public static final int HAT_SIZE = 20;
    public static final int HAT_BRIM_SIDE_SIZE = 10;
    public static final int SMALL_DIAMETER = 20;
    public static final int DIAMETER_INCREMENT = 20;
    public static final int RADIUS_INCREMENT = 10;
    
    
    // instance variables 
    private int x;
    private int y;
    

    /**
     * Constructs a snowman at the coordinates x, y
     * 
     * @param xPos x-coordinate of the upper left corner of the snowman
     * @param yPos y-coordinate of the upper left corner of the snowman
     */
    public SnowMan(int xPos, int yPos)
    {
        x = xPos;
        y = yPos;
        
    }

    /**
     * Draws a snowman at the coordinates x, y
     *
     */
    public void draw()
    {
        Rectangle box = new Rectangle(x, y, HAT_SIZE, HAT_SIZE);
        box.draw();
        box.fill();
        
        Line line = new Line(x - HAT_BRIM_SIDE_SIZE, y + HAT_SIZE, x + HAT_SIZE + HAT_BRIM_SIDE_SIZE , y + HAT_SIZE);
        line.draw();
        
        Ellipse circleOne = new Ellipse(x, y + HAT_SIZE , SMALL_DIAMETER, SMALL_DIAMETER);
        circleOne.draw();
        
        Ellipse circleTwo = new Ellipse(x - RADIUS_INCREMENT, y + 2 * DIAMETER_INCREMENT, 2 * SMALL_DIAMETER, 2 * SMALL_DIAMETER);
        circleTwo.draw();
        
        Ellipse circleThree = new Ellipse(x - DIAMETER_INCREMENT, y + 2 * 2 * DIAMETER_INCREMENT, 2 * SMALL_DIAMETER + SMALL_DIAMETER, 2 * SMALL_DIAMETER + SMALL_DIAMETER);
        circleThree.draw();
    }
}
