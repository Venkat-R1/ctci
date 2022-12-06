package chapter3;

public class Stack<T> {

    public Stack(StackNode<T> node){
        this.top = node;
    }

    private StackNode<T> top;

    public T pop() {
        if (this.top == null) {
            System.out.println("no element available in stack");
        }
        StackNode<T> node = this.top;
        this.top = this.top.next;
        return node.data;
    }

    public T peek() {
        if (this.top == null) {
            System.out.println("no element available in stack");
        }
        return this.top.data;
    }

    public void push(T data) {
        StackNode<T> node = new StackNode<T>(data);
        node.next = this.top;
        this.top = node;
    }

    public boolean isEmpty() {
        return this.top == null;
    }

}

class StackNode<T> {
    public T data;
    public StackNode<T> next;

    public StackNode(T data) {
        this.data = data;
    }
}
