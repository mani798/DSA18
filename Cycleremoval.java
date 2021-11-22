package DSA18;

public class Cycleremoval {
	 public static void main(String[] args) {
         
	        ListNode head = null;
	         
	        ListNode node = new ListNode(5);
	        head = node;        
	        node.next = new ListNode(4);
	        node = node.next;   
	         
	        ListNode node10 = new ListNode(10);
	        node.next = node10;
	        node = node.next;
	         
	        node.next = new ListNode(15);
	        node = node.next;       
	        node.next = new ListNode(1);
	        node = node.next;
	        node.next = new ListNode(7);
	        node = node.next;
	        node.next = node10;
	         
	        Cycleremoval main = new Cycleremoval();
	        main.removeCycle(head); 
	         
	        while(head != null) {           
	            System.out.print(head.value+", ");
	            head = head.next;
	        }
	    }
	     
	    /* Solution */
	    public void removeCycle(ListNode head) {
	          
	        ListNode point = null;
	        ListNode fast = head;
	        ListNode slow = head;
	        while(fast != null && fast.next != null){
	            fast = fast.next.next;
	            slow =slow.next;
	            if(fast == slow){
	                point = fast;
	                break;
	            }
	        }        
	         
	        if(point != null){            
	            slow = head;
	            while(slow != fast){
	                fast = fast.next;
	                slow =slow.next;                
	            }
	             
	            while(fast.next != slow) {
	                fast = fast.next;
	            }
	            fast.next = null;
	        }
	    }
	     
	    /* Definition of Linked List Node */
	    public static class ListNode {      
	        int value;
	        ListNode next;
	         
	        public ListNode(int value) {
	            this.value = value;
	        }       
	    }
	}