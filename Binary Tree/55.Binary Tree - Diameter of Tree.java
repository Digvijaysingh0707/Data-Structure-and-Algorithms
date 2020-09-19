It have a complexity of O(n^2)
    Diameter of a tree is the longest distance between any two nodes of a tree
    this is the preorder traversal as we are computing height first and then we are going to left and right



import java.util.LinkedList;
import java.util.Queue;

public class Node {
    int key;
    Node left,right;
    public Node(int item){
        this.key=item;
        left=right=null;

    }
}
class  BinaryTree {
     Node root;
    static int height(Node root){
        if(root==null){
            return 0;
        }
        int Lheight=height(root.left);
        int Rheight=height(root.right);

        if(Lheight>Rheight){
            return (Lheight+1);

        }
        else{
            return (Rheight+1);
        }



    }
     static int diameter(Node root){
         if(root==null){
             return 0;
         }
         int h1=height(root.left);
         int h2=height(root.right);
         int Op1=h1+h2;
         int Op2=diameter(root.left);
         int Op3=diameter(root.right);
         return Math.max(Op1,Math.max(Op2,Op3));
     }






    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root=new Node(1);

        tree.root.left=new Node(2);

        tree.root.right=new Node(3);

        tree.root.left.left=new Node(4);

        tree.root.left.right = new Node(5);
        System.out.println(diameter(tree.root));





    }
}
