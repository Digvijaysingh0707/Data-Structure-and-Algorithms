Complexity is O(N^2)
    using BFS this can be done in O(N) time
    
    skewed tree- tree having nodes in one direction

package com.company;
 class Node {

    int key;
    Node left,right;
    public Node(int item){
        this.key=item;
        left=right=null;
    }
}
class Binarytree  {

    static Node root;

    Binarytree() {
        root = null;
    }
    public static int height(Node root){
        if (root==null){
            return 0;
        }
        int Lheight=height(root.left);
        int Rheight=height(root.right);
        if (Lheight>Rheight){
            return (Lheight+1);
        }
        else{
            return (Rheight+1);
        }
    }
    public void printGivenLevel(Node root,int level){
        if (root==null){
            return;
        }
        if (level==1){
            System.out.print(root.key+" ");
        }
        printGivenLevel(root.left,level-1);
        printGivenLevel(root.right,level-1);
    }
    public void printAlllevels() {
        int h = height(root);
        for (int i = 0; i <=h; i++) {
            printGivenLevel(root, i);
            System.out.println();
        }
    }

}




public class Main {

    public static void main(String[] args) {
	// write your code here

        Binarytree tree = new Binarytree();
        tree.root= new Node(1);
        tree.root.left= new Node(2);
        tree.root.right= new Node(3);
        tree.root.left.left= new Node(4);
        tree.root.left.right= new Node(5);
        tree.printAlllevels();
    }
}
