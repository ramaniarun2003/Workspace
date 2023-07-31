import java.util.EmptyStackException;
public class Stack {
    private Node next_Node;

    public Stack() {
        this.next_Node = null;
    }

    public boolean isEmpty() {
        return next_Node == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            next_Node = newNode;
        } else {
            newNode.next = next_Node;
            next_Node = newNode;
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        int poppedValue = next_Node.data;
        next_Node = next_Node.next;
        return poppedValue;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return next_Node.data;
    }

}
