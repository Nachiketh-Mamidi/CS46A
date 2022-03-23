import java.util.Scanner;
/**
 * Write a description of class DatingCreepy2 here.
 *
 * @author Nachiketh Mamidi
 * @version Exam1
 */
public class DatingCreepy2
{
    public static void main(String[] args)
    {
        int  TWO = 2;
        int SEVEN = 7;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("What is your name?");
        String name = in.nextLine();
        
        System.out.print("What is your age?");
        int age = in.nextInt();
        
        if (age < 18 || age > 50)
        {
            System.out.println("You are too young or too old for our dating program.");
            System.out.printf("Goodbye, %s!\n", name);
            return;
        }
        
        System.out.print("What is your date age?");
        int dateAge = in.nextInt();
        
        int creepyAge = age / TWO + SEVEN;
        int dateCreepyAge = dateAge / TWO + SEVEN;
        if (dateAge <= 18 && dateAge >= 50)
        {
            System.out.printf("Your creepy age is %d.", creepyAge);
            System.out.printf("Your date's creepy age is %d.\n", dateCreepyAge);
        
            if (creepyAge < dateCreepyAge)
                System.out.printf("Creepy alert, %s! You are too young for your date!\n", name);
                
            else if (dateCreepyAge < creepyAge)
                System.out.printf("Creepy alert, %s! Your date is too young for you!\n", name);
                
            else
                System.out.printf("Have a good time, %s!\n", name);
        }
        else
        {
            System.out.println("Your date is too young or too old for our dating program.");
            System.out.printf("Goodbye,%s!\n", name);
        }
    }
}