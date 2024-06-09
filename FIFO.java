package fifo;
import java.util.LinkedList; 
	public class FIFO<T> {
	    private LinkedList<T> queue;

	    public FIFO() {
	        queue = new LinkedList<>();
	    }

	    public void enqueue(T element) {
	        queue.addLast(element);
	    }

	    public T dequeue() {
	        return queue.poll();
	    }

	    public T peek() {
	        return queue.peek();
	    }

	    public boolean isEmpty() {
	        return queue.isEmpty();
	    }

	    public int size() {
	        return queue.size();
	    }


	public static void main(String[] args) {
        FIFO<Integer> fifoQueue = new FIFO<>();
        fifoQueue.enqueue(1);
        fifoQueue.enqueue(2);
        fifoQueue.enqueue(3);

        System.out.println("Dequeuing elements:");
        while (!fifoQueue.isEmpty()) {
            System.out.println(fifoQueue.dequeue());
        }
    }
}
