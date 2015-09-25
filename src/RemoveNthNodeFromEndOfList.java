

public class RemoveNthNodeFromEndOfList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(3);
		ListNode node3 = new ListNode(4);
		ListNode node4 = new ListNode(5);
		//ListNode node5 = new ListNode(6);
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = null;
		//node4.next = node5;
		
		ListNode s = head;
		while(s != null){
			System.out.println(s.getVal());
			s = s.next;
		}
		System.out.println("After: " + "-----------------------------------");
		
		s = removeNthFromEnd(head,3);
		while(s != null){
			System.out.println(s.getVal());
			s = s.next;
		}
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		 /*ListNode swap = head;
	        int m = 0;
	        while(swap.next != null ){
	        	m ++;
	            swap = (ListNode) swap.next;
	        }
	        int i = 0;
	        ListNode p = head;
	        while(i <= m - n){
	        	if(i == m - n){
	        		p = p.next.next;
	        		break;
	        	}
	        	p = p.next;
	        	i ++;
	        }
	        ListNode s;
			s = head;
			while(s != null){
				s = s.next;
			}
			return head;*/
		
		ListNode p = head;//Faster pointer
		ListNode q = head;//Slower pointer
		
		//Special case when only one node
		if(head.next == null){
			return null;
		}
		
		//Faster pointer first travel n nodes
		for(int i = 0;i < n;i ++){
			p = p.next;
		}
		
		if(p == null){
			head = q.next;
			return head;
		}
		//When p.next == null, q points the node that required
		while(p.next != null){
			p = p.next;
			q = q.next;
		}
		
		q.next = q.next.next;
		return head;
    }
}
