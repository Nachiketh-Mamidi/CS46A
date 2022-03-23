import java.util.Scanner;
/**
 * Write a description of class DecisionsWithInput here.
 * Take integer as an input and use if and while statements to find
 * sum of odd number, samllest number, etc.
 *
 * @author Nachiketh Mamidi
 * @version April 4th, 2021
 */
public class DecisionsWithInput
{
    public static final int LUCKY_NUMBER = 5;
    public static final int EVEN_NUMBER_BASE = 2;
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean validInput = false;
        int num = 0;
        int sum = 0;
        int small = 1;
        boolean five = false;
        int positive = 0;
        
        while(!validInput)
        {
            System.out.print("Enter an integer or Q to quit: ");
            if (in.hasNextInt())
            {
                num = in.nextInt();
                if (num % EVEN_NUMBER_BASE != 0)
                {
                    sum += num;    
                }
                if (num < small)
                {
                    small = num;
                } 
                if (num > 0)
                {
                    positive ++;
                }
                if (num == LUCKY_NUMBER)
                {
                    five = true;
                }
            }
            else
            {
                validInput = true;
            }
        }
        
        System.out.printf("The sum of all odd numbers: %d.%n", sum);
        System.out.printf("The smallest number: %d.%n", small);
        if (five == true)
        {
            System.out.printf("%d is my lucky number!%n", LUCKY_NUMBER);
        }
        else
        {
            System.out.println("No fives!");
        }
        System.out.printf("The count of positive numbers: %d.%n", positive);
    }
}
