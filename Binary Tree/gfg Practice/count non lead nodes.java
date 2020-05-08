https://practice.geeksforgeeks.org/problems/count-non-leaf-nodes-in-tree/1
class GFG
{
	int countNonLeafNodes(Node root)
	{
	    if(root==null) return 0;
	    if(root.left==null && root.right==null) return 0;
	    else{
	        return 1+ countNonLeafNodes(root.left)+countNonLeafNodes(root.right);
	    }
	}
}
