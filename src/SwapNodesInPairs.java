public class SwapNodesInPairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
		ListNode node1 = new ListNode(3);
		ListNode node2 = new ListNode(5);
		ListNode node3 = new ListNode(4);
		ListNode node4 = new ListNode(6);
		ListNode node5 = new ListNode(9);
		l1.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = null;
		System.out.println("l1: " + "-----------------------------------");
		ListNode s = l1;
		while (s != null) {
			System.out.println(s.getVal());
			s = s.next;
		}

		System.out.println("l2: " + "-----------------------------------");
		s = swapPairs(l1);
		while (s != null) {
			System.out.println(s.getVal());
			s = s.next;
		}
	}

	public static ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		
		ListNode p;
		ListNode q;
		ListNode k;
		p = head;
		q = p.next;
		k = q.next;
		
		head = head.next;
		while (q != null) {
			q.next = p;
			
			if(k != null && k.next != null){
				p.next = k.next;
				p = k;
				q = k.next;
				k = k.next.next;
			}else{
				p.next = k;
				q = null;
				k = null;
			}
			/*p = k;
			
			if(k != null){
				q = k.next;
			}else{
				q = null;
			}
			
			if(k != null && k.next != null){
				k = k.next.next;
			}else{
				k = null;
			}*/
			
		}
		

		/*if(head == null || head.next == null) {  
            return head;  
        }  
        ListNode p = head;  
        ListNode q = p.next.next;  
        p.next.next = p;  
        ListNode newHead = p.next;  
        p.next = swapPairs(q);  
        return newHead; */
        
		return head;
	}
}
