package chapter3;

public class Stack<T> {

    private StackNode<T> top;

    private class StackNode<T> {
        private T data;
        private StackNode<T> next;

        public StackNode(T data) {
            this.data = data;
        }
    }

    public StackNode<T> pop() {
        if (this.top == null) {
            System.out.println("no element available in stack");
        }
        StackNode<T> node = this.top;
        this.top = this.top.next;
        return node;
    }

    public StackNode<T> peek() {
        if (this.top == null) {
            System.out.println("no element available in stack");
        }
        return this.top;
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
