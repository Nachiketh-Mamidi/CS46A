
/**
 * Write a description of class SnowmanViewer here.
 * Use Rectangle, line and circles to draw a Snowman
 *
 * @author Nachiketh Mamidi
 * @version Feb 12, 2021
 */
public class SnowmanViewer
{
  public static void main(String[] args)
    {
        // Draw a rectangle
        Rectangle box = new Rectangle(50,10, 20, 20);
        box.draw();
        
        // Fill the hat with black color
        box.fill();
        
        // Draw a line at the bottom of the hat
        Line line = new Line(40, 30, 80, 30);
        line.draw();
        
        // Draw a small circle of diameter 20 at position (50, 30)
        Ellipse circle1 = new Ellipse(50, 30, 20, 20);
        circle1.draw();
        
        // Draw a middle circle of diameter 40 at position (40, 50)
        Ellipse circle2 = new Ellipse(40, 50, 40, 40);
        circle2.draw();
         
        // Draw a middle circle of diameter 60 at position (30, 90)
        Ellipse circle3 = new Ellipse(30, 90, 60, 60);
        circle3.draw();
    }
}
