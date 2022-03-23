
/**
 * Write a description of class Tree here.
 * To create a Tree class that has the information of the type and
 * height of the tree.
 *
 * @author Nachiketh Mamidi
 * @version 05/13/2021
 */
public class Tree implements Comparable
{
    private String type;
    private int height;
    
    /**
     * Constructor for objects of class Tree
     * 
     * @param str is the type of tree we are adding
     * @param num is the height of the tree
     */
    public Tree(String str, int num)
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
    public int getHeight()
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
    
    public int compareTo(Object obj)
    {
        Tree tree = (Tree) obj;
        int treeHeight = this.height - tree.height;
        if (treeHeight == 0)
            treeHeight = this.type.compareTo(tree.type);
        return treeHeight;
            
    }
}
