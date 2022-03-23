import java.util.Scanner;

/**
 * Write a description of class IntegerAndDouble1 here.
 * Using if statements it check if input is correct and using mathematical operations
 *
 * @author Nachiketh Mamidi
 * @version March 9, 2021
 */
public class IntegerAndDouble
{
     public static void main(String[] args)
    {
        // Scanner object
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        
        if(!in.hasNextInt())
        {
           String integerNumberTester = in.next(); 
           System.out.printf("%s is not an integer!%n", integerNumberTester );
           System.out.println("Program terminated!");
           return;
        }
        
        int integerNumber = in.nextInt();
        System.out.println("The integer number is " + integerNumber+".");
        System.out.print("Enter a double number: ");
        
        if(!in.hasNextDouble())
        {
           String decimalNumberTester = in.next();
           System.out.printf("%s is not a double number!%n", decimalNumberTester );
           System.out.println("Program terminated!");
           return;
        }
        
        double decimalNumber = in.nextDouble();
        System.out.println("The double number is " + decimalNumber + ".");
        
        if(decimalNumber<0)
        {
            System.out.println("No square root, since the double number is negative.");  
        }
        else
        {
           double squareRoot = Math.sqrt(decimalNumber);
           System.out.printf("The square root of the double number is %.4f.%n", squareRoot);
        }
        
        double Number1 = integerNumber / decimalNumber;
        
        if(decimalNumber == 0)
        {
          System.out.println("No quotient, since the double number is zero.");
        }
        else
        {
           System.out.printf("The quotient of the integer number divided by the double number is %.3f.%n", Number1);
        }
        
        System.out.println("The integer part of the double number is "+(int) decimalNumber+".");
        
        if((int) decimalNumber==0)
        {
            System.out.println("No quotients or remainder, since the integer part of the double number is zero.");
            return;
        }
        else
        {
           double Number2 = (double) integerNumber / (int) decimalNumber;
           System.out.printf("The double quotient of the integer number divided by the integer part of the double number is %.2f.%n",Number2);
           
           int Number3 = integerNumber / (int) decimalNumber;
           System.out.println("The integer quotient of the integer number divided by the integer part of the double number is " + Number3 + ".");
           
           int Number4 = integerNumber % (int) decimalNumber;
           System.out.println("The remainder of the integer number divided by the integer part of the double number is " + Number4 + "." );
        }
    }
}