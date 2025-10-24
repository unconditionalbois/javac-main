public class pr10 {
    private int maxSize;
    private int[] stackArray;
    private int top;

    // Constructor to initialize stack
    public pr10(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;  // stack is initially empty
    }

    // Method to push an element onto the stack
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack overflow");
            return;
        }
        stackArray[++top] = value;
        System.out.println(value + " pushed into the stack");
    }

    // Method to pop an element from the stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        int poppedElement = stackArray[top--];
        System.out.println(poppedElement + " popped from the stack");
        return poppedElement;
    }

    // Method to peek at the top element of the stack
    public int top() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top];
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    public static void main(String[] args) {
        pr10 stack = new pr10(5); // Create a stack of size 5

        // Push elements onto the stack
        stack.push(20);
        stack.push(10);
        stack.push(30);
        stack.push(50);

        // Peek at the top element
        System.out.println("Top element of the stack: " + stack.top());

        // Pop elements from the stack
        stack.pop();
        stack.pop();
        stack.pop(); // This will pop 10
        stack.pop(); // This will pop 20
        stack.pop(); // This will show stack underflow since stack is empty

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
