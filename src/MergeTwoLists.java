import com.sun.xml.internal.ws.api.pipe.NextAction;

public class MergeTwoLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
		ListNode node1 = new ListNode(3);
		ListNode node2 = new ListNode(5);
		ListNode l2 = new ListNode(2);
		ListNode node3 = new ListNode(4);
		ListNode node4 = new ListNode(6);
		l1.next = node1;
		node1.next = node2;
		node2.next = null;
		l2.next = node3;
		node2.next = null;
		//node4.next = node5;
		System.out.println("l1: " + "-----------------------------------");
		ListNode s = l1;
		while(s != null){
			System.out.println(s.getVal());
			s = s.next;
		}
		System.out.println("l2: " + "-----------------------------------");
		s = l2;
		while(s != null){
			System.out.println(s.getVal());
			s = s.next;
		}
		System.out.println("l3: " + "-----------------------------------");
		
		s = mergeTwoLists(l1,l2);
		while(s != null){
			System.out.println(s.getVal());
			s = s.next;
		}
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode p1 = l1;
		ListNode p2 = l2;
		
		ListNode head = new ListNode(0);
		ListNode p = head;
		
		while(p1 != null && p2 != null){
			if(p1.val <= p2.val){
				p.next = p1;
				p1 = p1.next;
			}else{
				p.next = p2;
				p2 = p2.next;
			}
			p = p.next;
		}
		
		if(p1 == null){
			p.next = p2;
		}else if(p2 == null){
			p.next = p1;
		}
		
		return head.next;
	}
}
