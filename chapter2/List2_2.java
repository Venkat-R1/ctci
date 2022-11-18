package chapter2;

public class List2_2 {
    private static int findKth(Node<Integer> node, int k){
        if(node == null){
            return -1;
        }
        int index = findKth(node.next, k) +1;
        if(index == k){
            System.out.println("k th element to last element is "+ node.value);
        }
        return index;
    }

    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>(new Node(1));
        list.addToTail(2);
        list.addToTail(3);
        list.addToTail(4);
        list.addToTail(5);
        findKth(list.getHead(), 1);
    }
    
}
