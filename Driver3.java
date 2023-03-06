

public class Driver3{
    public static void main(String[] args ){
        Queue q = new Queue();
        q.enqueue(5);
        q.enqueue(2);
        q.enqueue(4);
        q.show();
        q.dequeue();
        q.show();

    }
}