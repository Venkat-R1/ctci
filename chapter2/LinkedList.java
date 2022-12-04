package chapter2;

import java.util.*;

public class LinkedList<T> {
    private Node<T> head;
    private int size = 0;

    public LinkedList(){
        
    }
    public LinkedList(Node<T> node) {
        head = node;
        size++;
    }

    public Node<T> getHead() {
        return this.head;
    }
    
    public int getSize(){
        return this.size;
    }

    public void addToTail(T value) {
        Node<T> end = new Node<>(value);
        Node<T> n = head;
        if(n == null){
            head = end;
            return;
        }
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
        size++;
    }

    public void addAtBeginning(T value) {
        Node<T> newNode = new Node<>(value);
        if(head == null){
            this.head = newNode;
            return;
        }
        newNode.next = this.head;
        this.head = newNode;
        size++;
    }

    public void removeAtBeginning() {
        head = head.next;
        size--;
    }

    public void removeAtEnd() {
        Node<T> node = head;
        while (node.next.next != null) {
            node = node.next;
        }
        node.next = null;
        size--;
    }

    public void addAtIndex(int i, T value) {
        if (i == 0) {
            addAtBeginning(value);
        } else {
            int count = 1;
            Node<T> node = head;
            Node<T> newOne = new Node<>(value);
            while (node.next != null && count < i) {
                node = node.next;
                count++;
            }
            Node<T> temp = node.next;
            node.next = newOne;
            newOne.next = temp;
        }
        size++;

    }

    public void removeAtIndex(int i) {
        if (i == 0)
            removeAtBeginning();
        else {
            int count = 1;
            Node<T> node = head;
            while (node.next != null && count < i) {
                node = node.next;
                count++;
            }
            System.out.println(node.value);
            node.next = node.next.next;
        }
        size--;
    }

    public void printList(){
        Node<T> n = head;
        while(n != null){
            System.out.print(n.value);
            if(n.next!=null){
                System.out.print("->");
            }
            n = n.next;
        }
    }

    public static void main(String[] args) {
        Node<String> head = new Node<>("a");
        LinkedList<String> list = new LinkedList<>(head);
        list.addToTail("b");
        list.addToTail("c");
        list.addToTail("d");
        list.addToTail("e");
        System.out.println("size: " + list.size);
        list.addAtBeginning("f");
        list.addAtIndex(6, "g");
        list.removeAtIndex(5);
        System.out.println("size: " + list.size);
        Node<String> node = list.getHead();
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

}

class Node<T> {
    public Node<T> next;
    public T value;

    public Node(T d) {
        value = d;
        next = null;
    }

}