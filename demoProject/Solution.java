package Main;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        else if (l2 == null) {
            return l1;
        }
        else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

        
	}
	
	public static ListNode reverseList(ListNode head) {
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
	
	public static void main(String [] args) {
		 ListNode a = new ListNode(5);
	        a.next = new ListNode(10);
	        a.next.next = new ListNode(15);
	        a.next.next.next = new ListNode(40);
	 
	        ListNode b = new ListNode(2);
	        b.next = new ListNode(3);
	        b.next.next = new ListNode(20);
	        
	        //TreeNode c = new TreeNode();
	      // c.next
	        
	        
	      
		//System.out.println(mergeTwoLists(a,b));
	     ListNode mergedList = mergeTwoLists(a,b);
	   
	     DisplayNodes(mergedList);
	      
	     ListNode reverse = reverseList(b);
	     

		DisplayNodes(reverse);
	}
	
	private static void DisplayNodes(ListNode node) {
		while(node!=null)
	     {
	    	 System.out.println(node.val);
	    	 node = node.next;
	     }
		
	}

}
