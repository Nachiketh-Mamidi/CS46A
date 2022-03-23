/**
 * Models an AI interacting with crew members
 * 
 * @author Nachiketh Mamidi
 * @version Feb 22, 2021
 * 
 */
public class Hal9000
{
    //Instance variables
    String name;
    
    /**
     * Constructs a new Crew member name with a given name
     * 
     * @param crewName the name of the crew member
     */
    public Hal9000 (String crewName)
    {
         name = crewName;
    }
    
    /**
     * Returns the name of the crew member
     * 
     * @return getName returns the name of the crew member
     */
    public String getName()
    {
       return name; 
    }
    
    /**
     * Sets a new name
     * 
     * @param newName takes the name of the new crew member
     */
    public void setName(String newName)
    {
        name = newName;
    }
    
    /**
     * Greets a crew member
     * 
     * @return Returs a string greeting the crew member 
     */
    public String greet()
    {
        return ("Greetings, ") + name + (".");
        
    }
    
    /**
     * Gives status to a crew member
     * 
     * @return Returns a string giving status to a crew member
     */
    public String giveStatus()
    {
        return ("Everything is a go, ") + name + (".");
    }
    
    /**
     * Gives a response to a command
     * 
     * @param whatToDo gives a command to the AI
     * @return Returns a string responding to a command
     */
    public String executeCommand(String whatToDo)
    {
        return ("I am sorry, ") + name + (". I can't ") + whatToDo + (".");
    }
    
}