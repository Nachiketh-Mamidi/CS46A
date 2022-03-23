
/**
 * Write a description of class DayProg here.
 * Creating day objects and calling methods to modify a date,
 * find the number of days between them etc.
 *
 * @author Nachiketh Mamidi
 * @version Feb 12, 2021
 */
public class DayProg
{
    public static void main(String []args)
    {
        // Create a day object for today
        Day day1 = new Day();
        
        //Display the day
        System.out.println("Today is " + day1 + ".");
        
        // Create another day object for the St. Patrick's Day
        Day day2 = new Day(2021, 3, 17);
        
        // Display the date for the St. Patrick’s Day
        System.out.println("The St. Patrick's Day is " + day2 + ".");
        
        // Call a method on the object for today to find out the 
        // number of days to the St. Patrick’s Day and store it 
        // in a variable
        int day = day2.daysFrom(day1);
        
        // Display the number of days
        System.out.print("There are ");
        System.out.print(day);
        System.out.println(" days until the St. Patrick's Day.");
        
        // Call another method on the object for today to change 
        // it to the date 23 days ago
        day1.addDays(-23);
        
        // Call methods on the object for today to display the year,
        // month, and day of the date 23 days ago
        System.out.println("The date of 23 days ago is:");
        System.out.println("   Year : " + day1.getYear());
        System.out.println("   Month: " + day1.getMonth());
        System.out.println("   Day  : " + day1.getDayOfMonth());

    }
}
