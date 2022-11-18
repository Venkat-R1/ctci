package chapter2;
import java.util.*;

public class List2_1{

    private static void removeDuplicate(LinkedList<Integer> list){
        HashSet<Integer> set = new HashSet<>();
        Node<Integer> head = list.getHead();
        Node<Integer> previous = null;
        while(head != null){
            if(set.contains(head.value)){
                previous.next = head.next;
            }else{
                set.add(head.value);
                previous = head;
            }
            
            head = head.next;
        }
    }

    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>(new Node(1));
        list.addToTail(2);
        list.addToTail(2);
        list.addToTail(3);
        list.addToTail(4);
        list.addToTail(4);
        list.addToTail(5);
        removeDuplicate(list);
        list.printList();
    }
}