import java.util.Scanner;
/**
 * Write a description of class DecisionsWithInput here.
 *
 * @author Nachiketh Mamidi
 * @version April 4th, 2021
 */
public class DecisionsWithInput1
{
    final int LUCKY_NUMBER = 5;
    final int EVEN_NUMBER_BASE = 2;
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int positive = 0;
        String five = "";
        int small = 0;
        System.out.print("Enter an integer or Q to quit: ");
        while (in.hasNextInt())
        {
            int var = in.nextInt();
            small = var;
            if (var % 2 != 0)
            {
                sum += var;
            }
            if (var == 5)
            {
                five = ("5 is my lucky number!");
            }
            else
            {
                five = ( "No fives!");
            }
            if (var > 0)
            {
                positive ++;
            }            
            if (var < small)
            {
                small = var;
            }
            System.out.print("Enter an integer or Q to quit: ");
        }
        
        System.out.printf("The sum of all odd numbers: %d.%n", sum);
        System.out.printf("The smallest number: %d.%n", small);
        System.out.println(five);
        System.out.printf("The count of positive numbers: %d.%n", positive);

    }
}
