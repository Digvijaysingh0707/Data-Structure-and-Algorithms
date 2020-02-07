import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Node {
    int key;
    Node left,right;
    public Node(int item){
        this.key=item;
        left=right=null;

    }
}

class  BinaryTree{
    static Node root;
    BinaryTree(){
        root=null;
    }
    
    static int replaceSum(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null&& root.right==null){
            return root.key;
        }
        int leftsum=replaceSum(root.left);
        int rightSum=replaceSum(root.right);
        int temp=root.key;
        root.key=leftsum+rightSum;
        return temp+root.key;
    }


    static void Inorder(Node root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.key+" ");
        Inorder(root.right);
    }

   


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root=new Node(1);

        tree.root.left=new Node(2);

        tree.root.right=new Node(3);

        tree.root.left.left=new Node(4);

        tree.root.left.right = new Node(5);

       replaceSum(root);
       Inorder(root);

    }
}
