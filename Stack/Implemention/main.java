import java.util.List;

public class LinkedList {


    public static void main(String[] args) {
        Stacks num = new Stacks();
        num.push(15);
        num.show();
        num.push(10);
        num.show();
        num.push(1);
        num.show();
        num.push(3);
        num.show();
        num.push(7);
        num.show();
       // num.push(9);
      System.out.println("Size of stack:"+num.size());
        System.out.println("Top value is:" + num.peek());
System.out.println("Empty:"+num.isEmpty());

    }
}












