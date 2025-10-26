import java.util.Arrays;

public class pr11 {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public pr11(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int element){
        if(size == capacity){
            System.out.println("Queue is full. Cannot enqueue " + element);
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = element;
        size++;
        System.out.println("Enqueued: " + element);
    }

    public int dequeue() {
        if(size == 0){
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int element = arr[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println("Dequeued: " + element);
        return element;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void display() {
        if(isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        pr11 queue = new pr11(5);
        queue.enqueue(150);
        queue.enqueue(300);
        queue.enqueue(450);
        queue.enqueue(600);
        queue.display();

        queue.dequeue();
        queue.display();

        queue.enqueue(750);
        queue.display();

        queue.dequeue();
        queue.display();
    }
}
