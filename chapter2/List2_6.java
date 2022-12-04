package chapter2;

import java.util.Stack;

public class List2_6 {
    
    private static boolean isPalindrome(Node<Integer> head){
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        Stack<Integer> stack = new Stack<>();
        while(fast != null && fast.next != null){
            stack.add(slow.value);
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null){
            slow = slow.next;
        }
        while(slow != null){
            if(slow.value != stack.pop()){
                return false;
            }
            slow = slow.next;
        }
        return true;
    }
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>(new Node(3));
        list.addToTail(5);
        list.addToTail(8);
        list.addToTail(5);
        list.addToTail(4);

        System.out.println("the list is palindrome "+ isPalindrome(list.getHead()));

    }
}
