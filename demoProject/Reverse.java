package Main;

public class Reverse {
	public ListNode reverseList(ListNode head) {
        if (head == null) {
       return head;
   }
   
   ListNode current = head;
   ListNode previous = null;
   
   while (current != null) {
       ListNode temp = current.next;
       current.next = previous;
       previous = current;
       current = temp;
   }
   
   return previous;
}

}
