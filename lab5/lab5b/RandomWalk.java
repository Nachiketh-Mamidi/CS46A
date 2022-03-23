
/**
 * Write a description of class RandomWalk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomWalk
{
    public static void main(String[] args)
    {
        Picture vacuum = new Picture("large_roomba.png");
        vacuum.translate(200, 200);
        vacuum.draw(); 
        double randomNum = 360 * Math.random();
        double distance = 5;
        for (int i = 1; i <= 3000; i++)
        {
           double angle = Math.toRadians(randomNum);
           double dx = distance * Math.cos(angle);
           double dy = distance * Math.sin(angle);
           vacuum.translate(dx, dy); 
           Ellipse circle = new Ellipse(vacuum.getX(), vacuum.getY(), 10, 10);
           circle.draw();
           circle.fill();
        }
    }
}
