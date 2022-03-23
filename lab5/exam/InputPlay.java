import java.util.Scanner;
/**
 * Write a description of class InputPlay here.
 * Using scanner object and if commands
 *
 * @author Nachiketh Mamidi
 * @version March 5, 2021
 */
public class InputPlay
{
    public static void main(String[] args)
    {
        // Scanner object
        Scanner in = new Scanner(System.in);
        
        // taking fav color as input
        System.out.print("Enter your favorite color: ");
        String fav_color = in.nextLine();
        
        // Taking shirt color as input
        System.out.print("Enter the color of your shirt: ");
        String shirt_color = in.nextLine();
        
        if (fav_color.equals(shirt_color))
            System.out.println("Good choice");
        else
            System.out.println("You like variety");
            
        // Taking a double as input
        System.out.print("Enter a double: ");
        double double1 = in.nextDouble();
        
        // Taking another double as input
        System.out.print("Enter a second double: ");
        double double2 = in.nextDouble();
        
        if (double2 != 0)
            System.out.println(double1 / double2);
        else 
            System.out.println("Can not divide by 0");

                
    }
}
