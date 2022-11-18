package chapter2;

public class List2_3 {

    private static int deleteMiddle(Node<Integer> node, int len, Node<Integer> previous){
        if(node == null){
            return 0;
        }
        len++;
        int count = deleteMiddle(node.next, len, node) +1;
        System.out.println("len "+len+" count "+count );
        if(len == count && previous != null){
            previous.next = node.next;
        }
        return count;
    }
    
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>(new Node(1));
        list.addToTail(2);
        deleteMiddle(list.getHead(),0, null);
        list.printList();
    }
}
