import java.util.Scanner;

/**
 * Write a description of class StringApplication here.
 * Creates scanner object and uses various methods to call substrings
 *
 * @author Nachiketh Mamidi
 * @version Feb 27, 2021
 */
public class StringApplication
{
    public static void main(String[] args)
    {
        // Scanner object
        Scanner in = new Scanner(System.in);
        
        // Taking input book title
        System.out.print("Enter a book title: ");
        String title = in.nextLine();
        title = title.trim();
        
        // Display first character
        System.out.println("The first character is \'" + title.charAt(0)
                            + "\'.");
        
        int firstSpace = title.indexOf(" ");
        
        // Display first word
        System.out.println("The first word is \"" + 
                            title.substring(0, firstSpace) + "\".");
                            
        // Display rest of the title
        System.out.println("The rest of title is \"" + title.substring(firstSpace + 1)
                            + "\".");
        
        // Take starting position of nect substring as input
        System.out.print("Enter the starting position for a substring: ");
        int startingPos = in.nextInt();
        
        // Take length of the substring as input
        System.out.print("Enter the length for the substring: ");
        int length = in.nextInt();
        
        // Display the substring
        System.out.println("The " + length + "-char substring starting at index "
                            + startingPos + " is \"" + title.substring(startingPos, startingPos + length)
                            + "\".");
        
    }
}
