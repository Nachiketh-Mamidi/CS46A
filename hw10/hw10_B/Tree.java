
/**
 * Write a description of class Tree here.
 * To create a Tree class that has the information of the type and
 * height of the tree.
 *
 * @author Nachiketh Mamidi
 * @version 05/05/2021
 */
public class Tree
{
    private String type;
    private double height;
    
    /**
     * Constructor for objects of class Tree
     * 
     * @param str is the type of tree we are adding
     * @param num is the height of the tree
     */
    public Tree(String str, double num)
    {
        type = str;
        height = num;
    }

    /**
     * To return the type of tree.
     *
     * @return returns the type of tree.
     */
    public String getType()
    {
        return type;
    }
    
    /**
     * To return the height of tree.
     *
     * @return returns the height of tree.
     */
    public double getHeight()
    {
        return height;
    }
    
    /**
     * to return the tree in a string format
     *
     * @return returns the tree in a string format  
     */
    @Override
    public String toString()
    {
        return "Tree[Type:" + type + ",Height:" + height + "]";
    }
}
