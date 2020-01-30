Time and Space complexity is O(n)
    Insert a node,pop it and add its children into the queue
    
    Queue should not be of int type it should be of node type and if we make it of int type we would not be able to find from which node
    it is coming

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
class  BinaryTree{
    static Node root;
    BinaryTree(){
        root=null;
    }
    static void printLevelOrder(){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node tempNode=queue.poll();
            System.out.println(tempNode.key+" ");
            if(tempNode.left!=null){
                queue.add(tempNode.left);
                
            }
            if(tempNode.right!=null){
                queue.add(tempNode.right);
                
            }
        }
    }



    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root=new Node(1);

        tree.root.left=new Node(2);

        tree.root.right=new Node(3);

        tree.root.left.left=new Node(4);

        tree.root.left.right = new Node(5);

        System.out.println("Level order traversal of Binary tree using Queue:- ");
        tree.printLevelOrder();

    }
}
