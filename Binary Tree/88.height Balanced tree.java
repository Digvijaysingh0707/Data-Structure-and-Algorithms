Compelxity:- O(n2) tree in which abs(h1-h2)<=1
    Height balanced condition should be followed at every node
    
    Top down approach
    O(n^2)
    
    
    
    
import java.util.LinkedList;
import java.util.Queue;

public class Node {
    int key;
    Node left,right;
    public Node(int item){
        this.key=item;
        left=right=null;

    }
}class  BinaryTree {
      static Node root;


   static boolean isBalanced(Node node){
        if(node==null){
            return true;
        }
        int lh = height(node.left);
        int rh=height(node.right);
        if (Math.abs(lh - rh) <= 1 && isBalanced(node.left) && isBalanced(node.right)) {

            return true;
        }
        else{
            return false;
        }
    }
    static int height(Node node){
        if (node==null){
            return 0;
        }
        int lh=height(node.left);
        int rh = height(node.right);

        if(lh>rh){
            return (1+lh);
        }
        else {
            return (1+rh);
        }
    }





    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root=new Node(1);

        tree.root.left=new Node(2);

        tree.root.right=new Node(3);

        tree.root.left.left=new Node(4);

        tree.root.left.right = new Node(5);
        tree.root.left.left.left=new Node(8);
        if (tree.isBalanced(tree.root)) {
            System.out.println("Balanced tree");


        }
        else

        {
            System.out.println("Not");

        }
        
        //Another approach: Bottom up approach O(n)
            
            
         class Tree
{
    static class Pair{
        int height;
        boolean balance;
    }
    static Pair balance(Node root){
        Pair p= new Pair();
        if(root==null){
            p.height=0;
            p.balance=true;
            return p;
        }
        Pair left=balance(root.left);
        Pair right=balance(root.right);
        p.height=Math.max(left.height,right.height)+1;
        if(Math.abs(left.height-right.height)<=1&&left.balance&&right.balance){
            p.balance=true;
        }
        else p.balance= false;
        return p;
    }
     
    boolean isBalanced(Node root)
    {
       if(balance(root).balance){
           return true;
       }
       return false;
	
    }
}

