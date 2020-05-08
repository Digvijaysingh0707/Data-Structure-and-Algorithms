import java.util.Scanner;

class Node{
    char data;
    Node left,right;
    Node(char data){
        this.data=data;
        left=right=null;
    }
}
public class ConvertTernaryToBinary {
//    static Node convert(char[] expression,int i){
//        if (i>=expression.length) return null;
//        Node root= new Node(expression[i]);
//        i++;
//        if (i<expression.length&&expression[i]=='?'){
//            root.left=convert(expression,i+1);
//        }
//        else if (i<expression.length){
//            root.right=convert(expression,i+1);
//        }
//        return root;
//    }
 static Node convertExp(String str, int i)
{

    if(i > str.length())
        return null;

    Node root = new Node(str.charAt(i));
    i++;
    if(i < str.length() && str.charAt(i) == '?')
        root.left = convertExp(str, i+1);
    if(i < str.length() && str.charAt(i) == ':')
        root.right = convertExp(str, i+1);

    return root;
}

    static void printTree( Node root)
    {
        if (root == null)
            return;

        System.out.print(root.data +" ");
        printTree(root.left);
        printTree(root.right);
    }
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->=1){
            String s="";
            s=sc.next();

            ConvertTernaryToBinary p= new ConvertTernaryToBinary();
            Node res=p.convertExp(s,0);
            printTree(res);
            System.out.println();

        }
    }
}


