import java.util.Scanner;
/**
 * Write a description of class Triangle here.
 * Build a Isosceles triangle by cheaking input validation
 *
 * @author Nachiketh Mamidi
 * @version April 4th, 2021
 */
public class Triangle
{   
    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int TEN = 10;
    
    public static void main(String[] args)
    {
        boolean validInput = false;
        int rows = 0;
        Scanner in = new Scanner(System.in);
        while (!validInput)
        {
            System.out.printf("Enter an integer between %d and %d (inclusive): "
                            ,THREE, TEN);
            if (!in.hasNextInt())
            {
                String input = in.nextLine();
                System.out.printf("Invalid input: \"%s\".%n", input);
            }
            else
            {
                rows = in.nextInt();
                if (rows < THREE || rows > TEN)
                {
                    System.out.printf("Out of range: %d.%n", rows);                  
                }
                else
                {
                    validInput = true;
                }
            }
        }
                      
        for (int n = 0; n < rows; n++)
        {
            for (int m = 0; m < rows - ONE - n; m++)
            {
                System.out.print(" ");
            }
            for (int l = 0; l < (n * TWO + ONE); l++)
            {
                System.out.print("+");
            }
            System.out.println("");
        }  
    }            
}

