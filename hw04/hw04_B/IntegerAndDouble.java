import java.util.Scanner;

/**
 * Write a description of class IntegerAndDouble here.
 * Scanner object to take integer and decimal and use mathematical
 * operations.
 *
 * @author Nachiketh Mamidi
 * @version Feb 27, 2021
 */
public class IntegerAndDouble
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask the user to enter an integer using prompt 
        // "Enter an integer: " 
        System.out.print("Enter an integer: ");
        
        // Get the integer and store it in an integer variable
        int var = in.nextInt();
        
        // Print the integer on a new line
        System.out.println("The integer number is " + var + ".");
        
        // Ask the user to enter a double numberusing prompt
        // "Enter a doublenumber:" 
        System.out.print("Enter a double number: ");
        
        // Get the double numberand store it in a double variable
        double doubleVar = in.nextDouble();
        
        // Print the double numberon a new line
        System.out.println("The double number is " + doubleVar + ".");
        
        // Calculate and display the square rootof the double number
        System.out.println("The square root of the double number is " +
                            Math.sqrt(doubleVar) + ".");
                            
        // Get the integer part of the double number and store it in an 
        // integer variable
        int var2 = (int)doubleVar;
        
        // Display the integer part of the double number on a new line
        System.out.println("The integer part of the double number is " + 
                            var2 + ".");
            
        // Calculate and display the quotient of the integer number divided
        // by the double number
        System.out.println("The quotient of the integer number divided by the double number is "
                            + var / doubleVar + ".");
                            
        // Calculate and display the double quotient of the integer number 
        // divided by the integer part of the double numberr
        System.out.print("The double quotient of the integer number divided by the integer ");
        System.out.println("part of the double number is " + var / (double)var2 + ".");
        
        
        System.out.print("The integer quotient of the integer number divided by the integer ");
        System.out.println("part of the double number is " + var / var2 + ".");
        
        // Calculate and display the remainder of the integer number divided 
        // by the integer part of the double number
        System.out.print("The remainder of the integer number divided by the ");
        System.out.println("integer part of the double number is " +
                            var % var2 + ".");
        
    }
}
