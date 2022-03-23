/**
 * Call some string methods on different string objects.
 * 
 * @author   Nachiketh Mamidi
 * @version  Feb 12, 2021
 */
public class SpringBreak
{
    public static void main(String[] args)
    {
        String word =  "St. Patrick's Day"; 
        int index = 0;                      
        int size = 5;                       
        // Do not change the lines above
        
        // Display the String word
        System.out.println("The given string: " + word);
        
        // Display the length of the string
        System.out.println("The length: " + word.length());
        
        // Display char at index 0
        System.out.print("The character at index " + index);
        System.out.println(": " + word.charAt(index));
        
        // Display size 5 substring starting at index 0
        System.out.print("The size " + size);
        System.out.print(" substring starting at index " + index + ": ");
        System.out.println(word.substring(index, index + size));
        
        // Display word in all uppercase
        System.out.println("ALL UPPER CASE: " + word.toUpperCase());
        
        // Display word in all lowercase
        System.out.println("all lower case: " + word.toLowerCase());
        
        // Display all lower case with spaces removed
        System.out.print("all lower case with space removed: ");
        System.out.println(word.toLowerCase().replace(" ", ""));
        
        // Display original word with ' ' replaced by '_'
        System.out.print("The original word with ' ' replaced by '_': ");
        System.out.println(word.replace(" ", "_"));
        
    }
}