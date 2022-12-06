package chapter3;

public class Queue<T> {
    
    private QueueNode<T> first;
    private QueueNode<T> last;
    
    public Queue(QueueNode<T> node){
        this.last = node;
    }

    public T pop(){
        if(first == null){
            System.out.println("No element found");
        }
        T data = first.data;
        first = first.next;
        if(first == null){
            last = null;
        }
        return data;
    }

    public void add(T data){
        QueueNode<T> node = new QueueNode<>(data);
        last.next = node;
        last = node;
        if(first == null){
            first = last;
        }
    }

    public T peek(){
        if(first == null){
            System.out.println("No element found");
        }
        return first.data;
    }

    public boolean isEmpty(){
        return first==null;
    }

}

class QueueNode<T> {
    public T data;
    public QueueNode<T> next;

    public QueueNode(T data){
        this.data = data;
    }
}