public class Stacks {
    int stack[] = new int[5];
    int top = 0;

    public void push(int data) {
        if(top==5){
            System.out.println("Stack is full");
        }
        stack[top] = data;
        top++;


    }
    public int pop(){
        if(isEmpty()) {
            System.out.println("Stack is empty");
        }

        int data;
        top--;
        data=stack[top];
        stack[top]=0;
        return data;
    }
    public int peek(){
        int data;
        
        data=stack[top-1];

        return data;
    }
    public int size(){
        return top;
    }
    public boolean isEmpty(){
        return top<=0;
    }
    public void show(){
        for(int n:stack){
            System.out.print(n+" ");

        }
        System.out.println();
    }
}
