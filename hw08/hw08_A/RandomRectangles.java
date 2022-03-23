import java.util.Scanner;
import java.util.Random;

/**
 * Write a description of class RandomRectangles here.
 * constructs random rectangles and fills yellow in smallest rectangle.
 *
 * @author Nachiketh Mamidi
 * @version 04/13/2021
 */
public class RandomRectangles
{
    public static final int MAX_X = 100;
    public static final int MAX_Y = 500;
    public static final int MIN_WIDTH = 30;
    public static final int MAX_WIDTH = 100;
    public static final int MIN_HEIGHT = 20;
    public static final int MAX_HEIGHT = 80;
    public static final int GENERATOR_SEED = 202104;
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.print("Enter an positive integer for the number of rectangle: ");
        boolean pos = false;
        
        while (!pos)
        {
            if (in.hasNextInt())
            {
                int var = in.nextInt();
                if (var <= 0)
                {    
                    System.out.printf("Not positive: %d.%n", var);
                    System.out.print("Enter an positive integer for the number of rectangle: ");
                }
                else
                {    
                    num = var;
                    pos = true;
                }
            }   
            else
            {
                System.out.printf("Not an integer: \"%s\".%n", in.next());
                System.out.print("Enter an positive integer for the number of rectangle: ");
            }
        }
        
        Random generator = new Random(GENERATOR_SEED);
        Rectangle smallRec = new Rectangle();
        int minArea= Integer.MAX_VALUE;
        
        for (int i = 0; i < num; i ++)
        {
            int x = generator.nextInt(MAX_X);
            int y = generator.nextInt(MAX_Y);
            int width = MIN_WIDTH + generator.nextInt(MAX_WIDTH - MIN_WIDTH);
            int height = MIN_HEIGHT + generator.nextInt(MAX_HEIGHT - MIN_HEIGHT);
            Rectangle rec = new Rectangle(x, y, width, height);
            rec.setColor(Color.RED);
            rec.draw();
            
            int area = width * height;
            if (area < minArea)
            {
                minArea = area;
                smallRec = rec;
            }
        }
        
        smallRec.setColor(Color.YELLOW);
        smallRec.fill();
        
        System.out.printf("The number of rectangle: %d%n", num);
        System.out.printf("The min area: %d.%n", minArea);
        
    }
}

