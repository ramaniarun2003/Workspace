import java.util.EmptyStackException;
public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException(); // Throw an exception if the stack is empty
        }

        int poppedValue = top.data; // Get the data from the top node
        top = top.next; // Move the top to the next node (removing the current top)
        return poppedValue; // Return the popped value
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }
}
