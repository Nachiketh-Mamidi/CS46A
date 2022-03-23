import java.util.ArrayList;
import java.util.Arrays;

/**
 * Write a description of class Orchard here.
 * Provides methods for Tree class
 *
 * @author Nachiketh Mamidi
 * @version 05/13/2021
 */
public class Orchard
{
    Tree[] treeArray;
    int currentSize;
    /**
     * Constructor for objects of class Orchard
     */
    public Orchard(int length)
    {
        treeArray = new Tree[length];
        currentSize = 0;
    }

    /**
     * Add a tree at a given position of the array 
     * if the array is not full and the index is valid
     *
     * @param tree is the tree to be added
     * @param pos is the position at which it is 
     * to be added
     */
    public void add(Tree tree, int pos)
    {
        if (currentSize < treeArray.length && pos >= 0
            && pos <= currentSize)
        {
            for (int i = currentSize; i > pos; i --)
                treeArray[i] = treeArray[i - 1];
            treeArray[pos] = tree;
            currentSize ++;
        }
    }
    
    /**
     * Return the last tree with a height at least
     * 30 and null if the array has no such trees     
     *
     * @return Returns the last tree with a height 
     * at least 30 and null if the array has no such trees
     */
    public Tree lastTallTree()
    {
        for (int i = currentSize - 1; i >= 0; i --)
        {
            if (treeArray[i].getHeight() >= 30)
                return treeArray[i];
        }
        
        return null;
    }
    
    /**
     *  Determine if the array contains a Tree object of a given type
     *
     * @return returns either true or false.
     */
    public boolean contains(String str)
    {
        for (int i = 0; i < currentSize; i ++)
        {
            if (treeArray[i].getType().equals(str))
                return true;
        }
        return false;
    }
    
    /**
     * Return an ArrayList<String> containing the types of all Tree objects in 
     * the array.
     *
     * @return Returns an ArrayList<String> containing the types of all Tree 
     * objects in the array.
     */
    public ArrayList<String> treeList()
    {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < currentSize; i ++)
        {
            list.add(treeArray[i].getType());
        }
        return list;
    }
    
    /**
     * Sorts the array
     */
    public void sort()
    {
        Arrays.sort(treeArray, 0, currentSize);
    }
}
