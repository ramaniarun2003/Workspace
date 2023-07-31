public class LinkedList {
    Node head;

    public void insertAtFront(int new_Data){
        Node n = new Node(new_Data);
        n.data = new_Data;
        n.next = head;
        head = n;
    }

    public void printList(){
        Node node = head;
        while(node != null){
            System.out.println(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}
