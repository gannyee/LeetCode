public class ReverseNodesInKGroup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(3);
		ListNode node3 = new ListNode(4);
		/*ListNode node4 = new ListNode(6);*/
		l1.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = null;
		/*node4.next = null;*/
		System.out.println("l1: " + "-----------------------------------");
		ListNode s = l1;
		while (s != null) {
			System.out.println(s.getVal());
			s = s.next;
		}

		System.out.println("l2: " + "-----------------------------------");
		s = reverseKGroup(l1,4);
		while (s != null) {
			System.out.println(s.getVal());
			s = s.next;
		}
	}

	public static ListNode reverseKGroup(ListNode head, int k) {
		
		if(head == null){
			return null;
		}else if(head.next == null){
			return head;
		}
		ListNode p;
		ListNode q;
		ListNode fakeHead;
		p = head;
		fakeHead = head;
		int i = 0;
		while(i < k){
			
			if(fakeHead == null){
				return head;
			}
			fakeHead = fakeHead.next;
			i ++;
			if(i == (k - 1) && fakeHead != null){
				q = fakeHead;
				int swap = p.val;
				p.val = q.val;
				q.val = swap;
				p = q.next;
				fakeHead = p;
				i = 0;
			}
		}
		return head;
	}

}
