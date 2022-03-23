import java.util.Scanner;

/**
 * Write a description of class IntegerAndDouble here.
 * Scanner object to take integer and decimal and use mathematical
 * operations.
 *
 * @author Nachiketh Mamidi
 * @version Feb 27, 2021
 */
public class IntegerAndDouble2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask the user to enter an integer using prompt 
        // "Enter an integer: " 
        System.out.print("Enter an integer: ");
        
        if (in.hasNextInt())
        {
            int var = in.nextInt();
            System.out.println("The integer number is " + var + ".");
            
        }
        else
        {
            String var = in.next();
            System.out.println(var + " is not an integer!");
            System.out.println("Program terminated!");
            return;
        }
        

        if (in.hasNextDouble())
        {
            System.out.print("Enter a double number: ");
            double doubleVar = in.nextDouble();
            int var2 = (int)doubleVar;
            System.out.println("The double number is " + doubleVar + ".");
            
            if (doubleVar < 0)
            System.out.println("No square root, since the double number is negative.");
            else
            {
                double sqrt = Math.sqrt(doubleVar);
                System.out.printf("The square root of the double number is %.4f.%n", sqrt);
            }
            
            
            if (doubleVar == 0)
            {
                System.out.println("divison not possible");
            }
            else
            {
                int var = in.nextInt();
                doubleVar = in.nextDouble();
                System.out.println("The quotient of the integer number divided by the double number is "
                                    + var / doubleVar + ".");
            }
            
            
            if (var2 == 0)
            {
                System.out.println("division not possible");
            }
            else
            {
                int var= in.nextInt();
                var2 = (int)doubleVar;
                System.out.print("The double quotient of the integer number divided by the integer ");
                System.out.println("part of the double number is " + var / (double)var2 + ".");
                
                System.out.print("The integer quotient of the integer number divided by the integer ");
                System.out.println("part of the double number is " + var / var2 + ".");
                
                System.out.print("The remainder of the integer number divided by the ");
                System.out.println("integer part of the double number is " +
                                    var % var2 + ".");
            }
        }
        else
        {
            System.out.print("Enter a double number: ");
            String doubleVar = in.next();
            System.out.println(doubleVar + " is not a double number!");
            System.out.println("Program terminated!");
            return;
        }

    }
}
