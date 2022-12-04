package chapter2;

public class List2_8 {
    
    private static void isCyclic(Node<Integer> head){
        Node<Integer> fast = head;
        Node<Integer> slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                break;
            }
        }

        if(fast == null || fast.next == null){
            System.out.println("no loop detected");
            return;
        }

        slow = head;
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }

        System.out.println("Intersection is at the node with value " + fast.value);  

    }
    public static void main(String args[]){
        Node<Integer> node1 = new Node(1);
        Node<Integer> node2 = new Node(2);
        Node<Integer> node3 = new Node(3);
        Node<Integer> node4 = new Node(4);
        Node<Integer> node5 = new Node(5);
        Node<Integer> node6 = new Node(6);
        Node<Integer> node7 = new Node(7);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node1;

        isCyclic(node1);

    }
}
