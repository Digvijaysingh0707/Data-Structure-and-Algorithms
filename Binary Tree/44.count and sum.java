import java.util.LinkedList;
import java.util.Queue;
import java.util.zip.CheckedOutputStream;

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
    

    
   static int count(Node root){
        if(root==null){
            return 0;
        }
        return 1+ count(root.left)+count(root.right);
    }
     static int sum(Node root){
        if(root==null){
            return 0;
        }
        return (root.key+sum(root.left)+sum(root.right));
    }



    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root=new Node(1);

        tree.root.left=new Node(2);

        tree.root.right=new Node(3);

        tree.root.left.left=new Node(4);

        tree.root.left.right = new Node(5);

        
        System.out.print(count(root));

    }
}
