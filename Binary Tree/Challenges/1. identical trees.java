
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
     Node root1, root2;
    static boolean identicalTrees(Node a,Node b){
        if(a==null&& b==null){
            return false;
        }
        if(a!=null && b!=null){
            if((a.key==b.key) && identicalTrees(a.left,b.left) && identicalTrees(a.right,b.right)){
                return true;
            }
        }
        return false;
}





    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root1=new Node(1);

        tree.root1.left=new Node(2);

        tree.root1.right=new Node(3);

        tree.root1.left.left=new Node(4);

        tree.root1.left.right = new Node(5);

        tree.root2=new Node(1);

        tree.root2.left=new Node(2);

        tree.root2.right=new Node(3);

        tree.root2.left.left=new Node(4);

        tree.root2.left.right = new Node(5);


            System.out.println(identicalTrees(tree.root1,tree.root2));




    }
}
