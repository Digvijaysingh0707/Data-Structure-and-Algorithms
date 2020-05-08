https://practice.geeksforgeeks.org/problems/size-of-binary-tree/1
class Tree
{
	public static int getSize(Node root)
	{
	    if(root==null) return 0;
	    else
	    return 1+getSize(root.left)+getSize(root.right);

    }
}
