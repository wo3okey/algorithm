package leetCode_interview;

/**
 * Created by wookey on 06/10/2019.
 */
public class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}

	public static ListNode makeNumberListNode(int ...nums) {
		ListNode listNode = null;
		ListNode cur = null;
		for (int i = 0; i < nums.length; i++) {
			if (listNode == null) {
				listNode = new ListNode(nums[i]);
				cur = listNode;
			} else {
				cur.next = new ListNode(nums[i]);
				cur = cur.next;
			}
		}
		return listNode;
	}
}
