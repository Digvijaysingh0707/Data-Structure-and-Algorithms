import java.net.Socket;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Node {
    char key;
    Node left,right;
    public Node(char item){
        this.key=item;
        left=right=null;

    }
}
class  BinaryTree{
    static Node root;
    static int preindex=0;
    BinaryTree(){
        root=null;

    }
    Node buildTree(char in[],char pre[],int s,int e){
        if(s>e){
            return null;
        }
        Node tnode = new Node(pre[preindex++]);
        if(s==e){
            return tnode;
        }
        int inIndex = search(in,s,e,tnode.key);
        tnode.left=buildTree(in,pre,s,inIndex-1);
        tnode.right=buildTree(in,pre,inIndex+1,e);
        return tnode;
    }
    static int search(char arr[],int s,int e,char value){
        int i;
        for(i=s;i<=e;i++){
            if(arr[i]==value){
                return i;
            }

        }
        return i;

    }
    static void printInorder(Node node){
        if(node==null){
            return ;
        }
        printInorder(node.left);
        System.out.print(node.key+" ");
        printInorder(node.right);
    }



    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        char in[] = new char[] { 'D', 'B', 'E', 'A', 'F', 'C' };
        char pre[] = new char[] { 'A', 'B', 'D', 'E', 'C', 'F' };
        int len = in.length;
        Node root = tree.buildTree(in, pre, 0, len - 1);

        // building the tree by printing inorder traversal
        System.out.println("Inorder traversal of constructed tree is : ");
        tree.printInorder(root);

    }
}
