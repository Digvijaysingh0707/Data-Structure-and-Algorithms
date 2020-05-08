https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
complexity isO(n)

class Tree

{
    int countLeaves(Node node) 
    {
        if(node==null)return 0;
        int count=0;
        if(node.right==null&&node.left==null)return 1;
        else 
        return countLeaves(node.left) + countLeaves(node.right);
    }
}
