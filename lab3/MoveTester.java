
/**
 * Write a description of class MoveTester here.
 *
 * @author Nachiketh Mamidi
 * @version Feb 19, 2021
 */
public class MoveTester
{
    public static void main()
    {
       Robot one = new Robot (0,0);
       one.moveHorizontally(5);
       one.moveHorizontally(-3);
       System.out.println(one.getX());
       System.out.println("Expected: 2");
       
       one.moveVertically(6);
       one.moveVertically(-4);
       System.out.println(one.getY());
       System.out.println("Expected: 2");
       
       one.moveRight();
       System.out.println(one.getX());
       System.out.println("Expected: 3");
       
    }
}
