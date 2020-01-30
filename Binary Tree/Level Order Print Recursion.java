Complexity is O(N^2)
    
    skewed tree- tree having nodes in one direction

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
    static void printAllLevel(){
        int h =height(root);
        for (int i =0;i<=h;i++){
            printGivenLevel(root,i);
            //System.out.println();
        }
    }
    static void printGivenLevel(Node root,int level){
        if(root==null){
            return;
        }
        if(level==1){
            System.out.print(root.key);
            System.out.println();
        }
        else{
            printGivenLevel(root.left,level-1);
            printGivenLevel(root.right,level-1);
            //System.out.println();
        }

    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root=new Node(1);

        tree.root.left=new Node(2);

        tree.root.right=new Node(3);

        tree.root.left.left=new Node(4);

        tree.root.left.right = new Node(5);

        System.out.println("Level order traversal of Binary tree:- ");
        tree.printAllLevel();

    }
}
