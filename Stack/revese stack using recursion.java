package Stack;

import java.util.Stack;

public class ReverseStackRecursion {
    static void InsertAtBottom(Stack<Integer> s, int x) {
        if (s.isEmpty()) {
            s.push(x);
            return;
        }
        int x1 = s.peek();
        s.pop();
        InsertAtBottom(s,x);
        s.push(x1);
    }


    static void reverse(Stack<Integer> s){
        if (s.isEmpty())return;
        int x=s.peek();
        s.pop();
        reverse(s);
        InsertAtBottom(s,x);

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        reverse(s);
        while (s.isEmpty()==false){
            System.out.println(s.peek()+" ");
            s.pop();

        }
    }
}
