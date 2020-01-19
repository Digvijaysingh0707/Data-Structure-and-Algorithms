import java.util.List;

public class LinkedList {
    private Listnode head;//Head node to hold the list
    private static void display(Listnode head){
        if(head==null){
            return;
        }
        Listnode current =  head;

        while(current!=null){
            System.out.print(current.data+"--> ");
            current=current.next;
        }
        System.out.print(current);//this will print null at the end

    }

    private static class Listnode{
        private int data;
        private Listnode next;
        //constructor
        private Listnode(int data){
            this.data=data;
            this.next=null;
        }
    }
   public static Listnode getNodeFromLast(Listnode head,int n){
        if(head==null){
            return head;
        }
        if(n<=0){
            throw new IllegalArgumentException("Invalid value of n:"+n);
        }
        Listnode mainPtr = head;
        Listnode refPtr = head;
        int count =0;
        while(count<n){
            if(refPtr==null){
                throw new IllegalArgumentException(n+" is greater than the number of nodes");
            }
            refPtr = refPtr.next;
            count++;
        }
        while (refPtr!=null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
   }

    public static void main(String[] args){
        Listnode head =new Listnode(10);
        Listnode second =new Listnode(1);
        Listnode third =new Listnode(15);
        Listnode fourth =new Listnode(4);
        head.next= second;
        second.next=third;
        third.next=fourth;


        LinkedList node= new LinkedList();
        node.display(head);
        System.out.println();

        Listnode nNodeFromEnd= node.getNodeFromLast(head,0);
        System.out.println(nNodeFromEnd.data);




       

    }
}
   









