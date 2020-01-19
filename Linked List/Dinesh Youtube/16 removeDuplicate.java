import java.util.List;

public class LinkedList {
    private Listnode head;//Head node to hold the list


    private  class Listnode{
        private int data;
        private Listnode next;
        //constructor
        private Listnode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void insertAtBegining(int data){
        Listnode newNode= new Listnode(data);

        newNode.next=head;
        head=newNode;

    }
    public  void display(){
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

  public  void removeDuplicate(){
        if(head== null){
            return;
        }
        Listnode current = head;
        while(current!=null && current.next!=null){
            if(current.data==current.next.data){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
        }
  }
    public static void main(String[] args){


        LinkedList node= new LinkedList();
        node.insertAtBegining(3);
        node.insertAtBegining(3);
        node.insertAtBegining(5);
        node.insertAtBegining(4);
        node.insertAtBegining(3);
        node.insertAtBegining(3);
        node.display();
        System.out.println();

        node.removeDuplicate();
        node.display();






       

    }
}
  










