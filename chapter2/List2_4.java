package chapter2;

public class List2_4 {

    private static void partition(LinkedList<Integer> list, int value){
        Node<Integer> node = list.getHead();
        Node<Integer> head = node;
        Node<Integer> tail = node;

        while(node!=null){
            Node<Integer> next = node.next;
            if(node.value <= value){
                node.next = head;
                head = node;
            } else {
                tail.next = node;
                tail = node;
            }
            node = next;
        }
        tail.next =null;

        while(head != null){
            System.out.print(head.value);
            if(head.next!=null){
                System.out.print("->");
            }
            head = head.next;
        }
    }
    
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>(new Node(3));
        list.addToTail(5);
        list.addToTail(8);
        list.addToTail(5);
        list.addToTail(10);
        list.addToTail(1);
        list.addToTail(2);

        partition(list,1);

        
    }
}
