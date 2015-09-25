public class MergeKSortedLists {

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
		ListNode node5 = new ListNode(8);
		ListNode l3 = new ListNode(7);
		ListNode node7 = new ListNode(10);
		ListNode node8 = new ListNode(12);
		
		l1.next = node1;
		node1.next = node2;
		node2.next = null;
		l2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = null;
		l3.next = node7;
		node7.next = node8;
		node8.next = null;
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
		s = l3;
		while(s != null){
			System.out.println(s.getVal());
			s = s.next;
		}
		System.out.println("l4: " + "-----------------------------------");
		
		ListNode[] listNodes = new ListNode[3];
		listNodes[0] = l1;
		listNodes[1] = l2;
		listNodes[2] = l3;
		s = mergerKSortedList(listNodes);
		while(s != null){
			System.out.println(s.getVal());
			s = s.next;
		}
	}

	//First method: not accept Time Limited Out
	/*public static ListNode mergerKSortedList(ListNode[] lists) {
		ListNode listNode = new ListNode(0);
		mergerTwoSortedList(listNode, lists.length, lists);
		return listNode.next;
	}

	public static void mergerTwoSortedList(ListNode listNode, int length,
			ListNode[] lists) {
		ListNode p;
		ListNode q;
		ListNode fakeHead;
		
		
		if(length == 1 || length == 0){
			return;
		}else{
			fakeHead = listNode;
			p = lists[0];
			q = lists[1];
			while (p != null && q != null) {
				if (p.val <= q.val) {
					fakeHead.next = p;
					p = p.next;
				} else {
					fakeHead.next = q;
					q = q.next;
				}
				fakeHead = fakeHead.next;
			}

			if (p == null) {
				fakeHead.next = q;
			} else if(q == null) {
				fakeHead.next = p;
			}
			lists[1] = listNode.next;
			ListNode[] list = new ListNode[length - 1];
			for (int i = 0; i < length - 1; i++) {
				list[i] = lists[i + 1];
			}
			mergerTwoSortedList(listNode, list.length, list);
		}
	}*/
	
	//Second Method:
	public static ListNode mergerKSortedList(ListNode[] lists) {
		if(lists.length == 0){
			return null;
		}
		return mergerKSortedList(lists, 0,lists.length - 1);
	}
	
	
	public static ListNode mergerKSortedList(ListNode[] lists,int left,int right){
		if(left < right){
		int mid = (left + right) / 2;
			return mergerTwoSortedList(mergerKSortedList(lists, left, mid),mergerKSortedList(lists, mid + 1,right));
		}
		return lists[left];
	}
	public static ListNode mergerTwoSortedList(ListNode listNode1,ListNode listNode2) {
		ListNode p;
		ListNode q;
		ListNode fakeHead;
		ListNode head = new ListNode(0);
			fakeHead = head;
			p = listNode1;
			q = listNode2;
			while (p != null && q != null) {
				if (p.val <= q.val) {
					fakeHead.next = p;
					p = p.next;
				} else {
					fakeHead.next = q;
					q = q.next;
				}
				fakeHead = fakeHead.next;
			}

			if (p == null) {
				fakeHead.next = q;
			} else if(q == null) {
				fakeHead.next = p;
			}
			return head.next;
		}
}
