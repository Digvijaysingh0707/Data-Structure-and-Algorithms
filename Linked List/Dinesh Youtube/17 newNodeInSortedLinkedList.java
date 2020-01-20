import java.util.List;

public class LinkedList {
    private Listnode head;//Head node to hold the list


    private class Listnode {
        private int data;
        private Listnode next;

        //constructor
        private Listnode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtBegining(int data) {
        Listnode newNode = new Listnode(data);

        newNode.next = head;
        head = newNode;

    }

    public void display() {
        if (head == null) {
            return;
        }
        Listnode current = head;

        while (current != null) {
            System.out.print(current.data + "--> ");
            current = current.next;
        }
        System.out.print(current);//this will print null at the end

    }



  public Listnode newNodeInSorted(int value){
        Listnode newnode = new Listnode(value);
        if(head==null){
            return newnode;
        }
        Listnode current = head;
        Listnode temp = null;
        while(current!=null && current.data < newnode.data){
            temp =current;
            current=current.next;
        }
        newnode.next=current;
        temp.next=newnode;
        return head;

  }
    public static void main(String[] args){


        LinkedList node= new LinkedList();
        node.insertAtBegining(31);
        node.insertAtBegining(20);
        node.insertAtBegining(7);
        node.insertAtBegining(3);
        node.insertAtBegining(2);
        node.insertAtBegining(1);
        node.display();
        System.out.println();

        node.newNodeInSorted(9);
        node.display();










    }
}
  










