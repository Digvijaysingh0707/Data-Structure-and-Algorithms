public class Node {
    int key;
    Node left,right;
    public Node(int item){
        this.key=item;
        left=right=null;

    }
}
class BinaryTree{
   static Node root;
    BinaryTree(){
        root=null;
    }
    static void printPostOrder(Node node){
        if(node==null){
            return;
        }
        printPostOrder(node.left);

        printPostOrder(node.right);

        System.out.print(node.key+" ");
    }
    static void printInorder(Node node){
        if(node==null){
            return;
        }
        printPostOrder(node.left);
        System.out.println(node.key+" ");
        printPostOrder(node.right);
    }
    static void printPreorder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.key+" ");
        printPostOrder(node.left);
        printPostOrder(node.right);
    }
    void printPostorder()  {
        printPostorder();
    }
    void printInorder()    {
        printInorder(root);
    }
    void printPreorder()   {
        printPreorder(root);
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root=new Node(1);

        tree.root.left=new Node(2);

        tree.root.right=new Node(3);

        tree.root.left.left=new Node(4);

        tree.root.left.right = new Node(5);

        System.out.print("Preorder: ");
        tree.printPreorder();
        System.out.println();
        System.out.println("Postorder ");
        System.out.println();

        //tree.printPostOrder();
        System.out.println("Inorder: ");
        tree.printInorder();
    }
}
