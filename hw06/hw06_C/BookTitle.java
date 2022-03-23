/**
 * Write a description of class BookTitle here.
 * Outputs a string with first letters of word,
 * and another string with last letters of the word.
 *
 * @author Nachiketh Mamidi
 * @version March 23, 2021
 */
public class BookTitle
{
    // instance variables - replace the example below with your own
    private String str;
    /**
     * Constructor for objects of class BookTitle
     * 
     * @param title is the string we perform methods on
     */
    public BookTitle(String title)
    {
        str = title;
    }

    /**
     * Returns a string consisting of the first character of every 
     * word in the title
     * 
     * 
     * @return firstLetters returns the first character of every word.
     */
    public String firstLetters()
    {
        boolean v = true;
        String result = "";
        for (int i = 0; i < str.length(); i++) 
        {
            if (str.charAt(i) == ' ') 
            {
                v = true;
            }

            else if (str.charAt(i) != ' ' && v == true) 
            {
                result += (str.charAt(i));
                v = false;
            }
        }
        return result;
    }
    
    /**
     * Returns a string consisting of the last letter of every word 
     * in the title
     *
     * @return lastLetters returns a string consisting of the letter of
     * every word in the line
     */
    public String lastLetters()
    {
        String result = "";
        for (int i = 0; i < str.length(); i++) 
        { 
            if (str.charAt(i) == ' ' && str.charAt(i  - 1) != '!' && 
            str.charAt(i - 1) != '1' && str.charAt(i - 1) != ':' && 
            str.charAt(i - 1) != ',') 
            {
                result += (str.charAt(i - 1));
            } 
            if (str.charAt(i) == ' ' && str.charAt(i - 1) == '!') 
            {
                result += (str.charAt(i - 2));
            }                 
            if (str.charAt(i) == ' ' && str.charAt(i - 1) == '1') 
            {
                result += (str.charAt(i - 2));
            }                
            if (str.charAt(i) == ' ' && str.charAt(i - 1) == ':') 
            {
                result += (str.charAt(i - 2));
            }            
            if (str.charAt(i) == ' ' && str.charAt(i - 1) == ',') 
            {
                result += (str.charAt(i - 2));
            }             
            if (i == (str.length() - 1) && str.charAt(i) == '2')
            {
                result += (str.charAt(i-1));
            }            
            if (i == (str.length() - 1) && str.charAt(i) == '!')
            {
                result += (str.charAt(i-1));
            }           
            if (i == (str.length() - 1) && str.charAt(i) != '2' && 
            str.charAt(i) != '!')
            {
                result += (str.charAt(i));
            } 
        }
        return result;
    }
}
