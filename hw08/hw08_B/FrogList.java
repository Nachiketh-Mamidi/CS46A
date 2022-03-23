import java.util.ArrayList;

/**
 * Write a description of class FrogList here.
 * Class FrogList manages an array list of class Frog
 *
 * @author Nachiketh Mamidi
 * @version 04/13/2021
 */
public class FrogList
{
    private ArrayList<Frog> frogList;
    /**
     * Constructor for objects of class FrogList
     */
    public FrogList()
    {
        frogList = new ArrayList<Frog>();
    }

    /**
     * Adds a frog at the beginning of the list.
     * 
     * @param frog adds a frog to the array list
     */
    public void add(Frog frog)
    {
        frogList.add(0, frog);
    }

    
    /**
     * Returns the Frog object at position index without changing the 
     * list if the index is valid and returns null otherwise.
     *
     * @param  index of the frog object
     * @return Returns the Frog object at position index without
     *  changing the list if the index is valid and returns null 
     *  otherwise
     */
    public Frog get(int index)
    {
        if (index < frogList.size())
        {
            return frogList.get(index);
        }
        else
            return null;
    }
    
    /**
     * Gets the number of frogs in the list that have a weight in the 
     * range between lowLimit and highLimit, inclusive.
     *
     * @param  lowLimit lower limit of weight
     * @param  highLimit higher limit of weight
     * 
     * @return Gets the number of frogs in the list that have a 
     *  weight in the range between lowLimit and highLimit
     */
    public int countInRange(int lowLimit, int highLimit)
    {
        int counter = 0;
        for (Frog frog : frogList)
        {
            int var = frog.getWeight();
            if (var >= lowLimit && var <= highLimit)
            {
                counter ++;
            }
        }
        return counter;
    }
    
    /**
     * Returns the string returned from calling the toString() 
     * method on the list.
     *
     * @return Returns the string returned from calling the
     *  toString() method on the list.
     */
    public String toString()
    {
        return frogList.toString();
    }
}
