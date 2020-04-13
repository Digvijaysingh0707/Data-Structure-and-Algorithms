import java.util.List;
import java.util.Stack;


public class LinkedList {

    public static Stack<Integer> revese(Stack<Integer> st){
        if(st.isEmpty()) return st;
        int temp=st.pop();
        revese(st);
        insertAtBottom(st,temp);
        return st;
}
public static void insertAtBottom(Stack<Integer> st,int x){
        if(st.isEmpty()){
            st.push(x);
            return;
        }
        int temp=st.pop();
        insertAtBottom(st,x);
        st.push(temp);
}


    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        revese(s);
        while (s.isEmpty()==false){
                System.out.print(s.peek()+" ");
                s.pop();
            }


    }
}












