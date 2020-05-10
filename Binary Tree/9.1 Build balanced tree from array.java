//Height of balanced binary tree is log n
//Height of skewd tree is O(n)
//Height of left and right subtree should be similar
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



    static Node buildTreeFromArray(int[] arr,int s,int e){
       if(s>e)//or(s==e)
       {
           return null;
       }
       int mid=(s+e)/2;
       Node root = new Node(arr[mid]);
       root.left=buildTreeFromArray(arr,s,mid-1);
       root.right=buildTreeFromArray(arr,mid+1,e);

       return root;
    }
    static void printPreorder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.key+" ");
        
        printPreorder(node.left);
       
        printPreorder(node.right);
        
    }





    public static void main(String[] args) {
       int arr[]={1,2,3,4,2,1,4,2};
       int n = 8;
       Node root = buildTreeFromArray(arr,0,n-1);
       printPreorder(root);






    }
}
