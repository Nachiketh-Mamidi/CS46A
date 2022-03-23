import java.util.ArrayList;

/**
 * Write a description of class Orchard here.
 * Orchard class manages an ArrayList of trees, adds, finds a
 * specific type and tallest tree and returns it.
 *
 * @author Nachiketh Mamidi
 * @version 05/05/2021
 */
public class Orchard
{
    ArrayList<Tree> treeList;

    /**
     * Constructor for objects of class Orchard
     */
    public Orchard()
    {
        treeList = new ArrayList<Tree>();
    }
    
    /**
     * to add a tree at a given position of the array list if 
     * the index is valid
     *
     * @param tree is the tree to be added
     * @param index is the position at which the tree should be added
     * @return  
     */
    public void add(Tree tree, int index)
    {
        if (index >= 0 && index <= treeList.size())
        {
            treeList.add(index, tree);
        }
    }
    
    /**
     * to return the first tallest tree
     *
     * @return returns the first tallest tree
     */
    public Tree tallest()
    {
        double max = Integer.MIN_VALUE;
        Tree result = null;
        for (int i = 0; i < treeList.size(); i ++)
        {
            if (treeList.get(i).getHeight() > max)
            {
                max = treeList.get(i).getHeight();
                result = treeList.get(i);
            }
        }
        return result;
    }
    
    /**
     * to determine if the array list contains a Tree object 
     * of a given type
     *
     * @param var is the object we are looking for
     * @return returns either true or false de
     */
    public String contains(String var)
    {
        for (int i = 0; i < treeList.size(); i ++)
        {
            if ((treeList.get(i).getType()).equals(var))
            {
                return "true";
            }
        }
        
        return "false";
    }
    
    /**
     * to return an ArrayList<String> containing the types of 
     * all the Tree objects in the array list.
     * 
     * @return return an ArrayList<String> containing the types of 
     * all the Tree objects in the array list.
     */
    public String treeList()
    {
        ArrayList<String> types = new ArrayList<String>();
        for (int i = 0; i < treeList.size(); i ++)
        {
            Tree var = treeList.get(i);
            types.add(var.getType());
        }
        return types.toString();
    }
}
