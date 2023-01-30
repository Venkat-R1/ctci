package chapter3;

import java.util.ArrayList;

public class Stack3_3 {

    class SetOfStacks {
        private ArrayList<Stack> stacks;
        private int capacity;

        public SetOfStacks(int capacity){
            this.capacity = capacity;
            stacks.add(new Stack(capacity));
        }
        public void push(int val){
            Stack stack = getlastStack();
            if(stack.isFull()){
                Stack newStack = new Stack(capacity);
                newStack.push(val);
                stacks.add(newStack);
            } else {
                stack.push(val);
            }
        }

        private Stack getlastStack(){
            return stacks.get(stacks.size()-1);
        }
        public int pop(){
            Stack stack = getlastStack();
            int val = stack.pop();
            if(stack.isEmpty()){
                stacks.remove(stacks.size()-1);
            }
            return val;
        }

        public int pop(int index){
            if(index >= stacks.size()){
                System.out.println("index is out of bound");
                return -1;
            }
            Stack stack = stacks.get(--index);
            int val = stack.pop();


            return val;
        }

        private void leftShift(int index){
            
        }

    }

    class Stack {
        private Node top, bottom;
        private int capacity;
        private int size;

        Stack(int capacity) {
            this.capacity = capacity;
        }

        public void push(int value) {
            Node node = new Node(value);
            if (size == capacity) {
                System.out.println("Stack is full");
                return;
            } else if (this.top == null) {
                this.top = this.bottom = node;
                this.size++;
                return;
            }
            node.next = top;
            top = node;
        }

        public int pop(){
            if(this.top == null){
                System.out.println("no element available in stack");
                return 0;
            }
            int val = this.top.data;
            this.top = this.top.next;
            this.size--;
            return val;
        }

        public int peek(){
            if(this.top == null){
                System.out.println("no element available in stack");
                return 0;
            }
            return this.top.data;
        }

        public boolean isEmpty(){
            return this.size == 0;
        }

        public boolean isFull(){
            return this.size == this.capacity;
        }
    }

    class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String args[]) {

    }

}
