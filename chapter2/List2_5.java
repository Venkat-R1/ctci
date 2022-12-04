package chapter2;

public class List2_5 {
    static int sum=0;

    private static int sumReverse(Node<Integer>head){
        int sum=0;
        int digit =1;
        while(head !=null){
            sum += head.value* digit;
            digit = digit*10;
            head=head.next;
        }
        return sum;
    }

    private static int sumForward(Node<Integer> head){
        if(head == null){
            sum=0;
            return 0;
        }
        int digit = sumForward(head.next);
        int value = (int) Math.pow(10,digit);
        sum += head.value*value;
        return digit+1;
    }

    private static void sumList(Node<Integer> head1, Node<Integer> head2){
        int result = sumReverse(head1) + sumReverse(head2);
        LinkedList<Integer> resultList = new LinkedList<Integer>();
        while(result % 10 >0){
            int value = result % 10;
            resultList.addAtBeginning(value);
            result /= 10;
        }
        resultList.printList();
    }
    
    public static void main(String[] args){

        LinkedList<Integer> list1 = new LinkedList<>(new Node(7));
        list1.addToTail(1);
        list1.addToTail(6);
        // list1.addToTail(6);
        // list.addToTail(10);
        // list.addToTail(1);
        // list.addToTail(2);

        LinkedList<Integer> list2 = new LinkedList<>(new Node(5));
        list2.addToTail(9);
        list2.addToTail(2);
        // list2.addToTail(2);
        // list.addToTail(10);
        // list.addToTail(1);
        // list.addToTail(2);
        sumList(list1.getHead(), list2.getHead());
    }
}
