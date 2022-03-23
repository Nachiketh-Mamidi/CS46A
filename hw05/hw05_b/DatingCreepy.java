import java.util.Scanner;
/**
 * To read your age and your date's age and determine whether your pair
 * is creepy or not.
 *
 * @author Nachiketh Mamidi
 * @version 3/8/2021
 */
public class DatingCreepy
{
   public static void main(String[] args)
   {
       // Contants
       int NUMBER_TWO = 2;
       int NUMBER_SEVEN = 7;
       
       // Scanner object
       Scanner in = new Scanner(System.in);
       
       System.out.print("What is your name? ");
       String name = in.nextLine();
       
       System.out.print("What is your age? ");
       int age = in.nextInt();
       
       
       if(50 <age || 18> age)
       {
          System.out.println( "You are too young or too old for our dating program.");
          System.out.print("Goodbye, " + name + "!");
          
          return;
          
        }
        
       System.out.print("What is your date's age? ");
       int dateAge = in.nextInt();
       
       if(50 >= dateAge && 18 <= dateAge)
       {
           double creepAge = age / NUMBER_TWO + NUMBER_SEVEN;
           System.out.println("Your creepy age is " + (int)creepAge + ".");
           
           double dateCreepAge = dateAge / NUMBER_TWO + NUMBER_SEVEN;
           System.out.println("Your date's creepy age is " + (int)dateCreepAge + ".");
           
           if(dateCreepAge > age)
            {
               System.out.println("Creepy alert, " + name + "! You are too young for your date!");
                                   
            }
            else if(creepAge>dateAge)
            {
                System.out.println("Creepy alert, " + name + "! Your date is too young for you!");
            }
             else if(dateCreepAge <=age && creepAge<=dateAge)
            {
                System.out.print("Have a good time, "+ name + "!");
            }
        }
        else
        {
            System.out.println("Your date is too young or too old for our dating program.");
            System.out.print("Goodbye, "+ name + "!");
        }
    }
}