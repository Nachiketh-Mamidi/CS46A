
/**
 * Class representing a Fish and it state and
 * hungry level.
 *
 * @author Nachiketh Mamidi
 * @version 05/05/2021
 */
public class Fish
{
    public static final int NOT_HUNGRY = 1;
    public static final int SOMEWHAT_HUNGRY = 2;
    public static final int HUNGRY = 3;
    public static final int VERY_HUNGRY = 4;

    private int state;
    
    /**
     * Constructor for objects of class Fish
     */
    public Fish()
    {
        state = NOT_HUNGRY;
    }

    /**
     * Changes the fish state to one level hungrier if not in 
     * state VERY_HUNGRY.
     *   
     */
    public void swim()
    {
        if (state != VERY_HUNGRY)
            state ++;
    }
    
    /**
     * Changes the fish state to one level less hungry if not 
     * in state NOT_HUNGRY.
     *  
     */
    public void eat()
    {
        if (state != NOT_HUNGRY)
            state --;
    }
    
    /**
     * Gets the integer representing the state
     *
     * @return returns the integer representing the state
     */
    public int getState()
    {
        return state;
    }
    
    /**
     * Gets a string describing the current hunger 
     * state of the Fish
     *  
     * @return string describing the current hunger 
     * state of the Fish  
     */
    public String getHungerLevel()
    {
        if (state == NOT_HUNGRY)
            return "Not hungry";
        else if  (state == SOMEWHAT_HUNGRY)
            return "Somewhat hungry";
        else if (state == HUNGRY)
            return "Hungry";
        else 
            return "Very hungry";
    }
}
