package javacodes.queue;

public class Main {
    public static void main(String []args){
        Queue q = new Queue(2);
        q.getFirst();
        q.getLast();
        q.getLength();

        q.printQueue();

        System.out.println("After adding a new value");
        q.enqueue(8);
        q.printQueue();
        System.out.println("After deleting a value from first");
        q.dequeue();
        q.printQueue();
    }
}
