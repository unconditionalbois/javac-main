
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
System.out.println(&quot;Queue is full. Cannot enqueue &quot; + element);
return;
}
rear = (rear + 1) % capacity;
arr[rear] = element;
size++;
System.out.println(&quot;Enqueued: &quot; + element);
}
public int dequeue() {

if(size == 0){
System.out.println(&quot;Queue is empty. Cannot dequeue.&quot;);
return -1;
}

int element = arr[front];
front = (front + 1) % capacity;
size--;
System.out.println(&quot;Dequeued: &quot; + element);
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
System.out.println(&quot;Queue is empty.&quot;);
return;
}
System.out.print(&quot;Queue: &quot;);
for(int i = 0; i &lt; size; i++) {
System.out.print(arr[(front + i) % capacity] + &quot; &quot;);
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
