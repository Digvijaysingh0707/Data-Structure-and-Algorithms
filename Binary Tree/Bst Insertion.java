Bst helps in searching as node are arranged in sorted order
Complexity:- O(logN) best case
    O(N) worst case
    
    Inorder of bst is always sorted
    
    Code link: https://ide.codingblocks.com/s/23076

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
    static Scanner sc = new Scanner(System.in);
    static Node InsertInBst(Node root,int data){
        if (root==null){
            return new Node(data);
        }
        if(data<=root.key){
            root.left=InsertInBst(root.left,data);
        }
        else{
            root.right=InsertInBst(root.right,data);
        }
        return root;
    }
    static Node build(){
        int d = sc.nextInt();
        Node root = null;
        while (d!=-1){
            root=InsertInBst(root,d);
            d=sc.nextInt();
        }
        return root;
    }
    static void Inorder(Node root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.key);
        Inorder(root.right);
    }
    static void bfs(Node root){
        Queue<Node> q = new LinkedList<Node>();
        ((LinkedList<Node>) q).push(root);
        ((LinkedList<Node>) q).push(null);

        while(!q.isEmpty()){
            Node f = q.poll();
            if(f==null){
                System.out.println();
                ((LinkedList<Node>) q).pop();
                if(!q.isEmpty()){
                    ((LinkedList<Node>) q).push(null);
                }
            }
            else{
                System.out.println(f.key+" ");
                ((LinkedList<Node>) q).pop();
                if(f.left!=null){
                    ((LinkedList<Node>) q).push(f.left);

                }
                if(f.right!=null){
                    ((LinkedList<Node>) q).push(f.right);
                }
            }
        }
        return;
    }
    static void printLevelOrder(Node root){
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
       
        Node root = build();
        Inorder(root);
        System.out.println();
        bfs(root);

    }
}
