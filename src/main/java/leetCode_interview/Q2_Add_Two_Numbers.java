package leetCode_interview;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by wookey on 06/10/2019.
 */
public class Q2_Add_Two_Numbers {
	public static void main(String args[]) {

	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		Queue<Integer> queue1 = new LinkedList<Integer>();
		Queue<Integer> queue2 = new LinkedList<Integer>();

		ListNode cur1 = l1;
		while (cur1 != null) {
			queue1.add(cur1.val);
			cur1 = cur1.next;
		}

		ListNode cur2 = l2;
		while (cur2 != null) {
			queue2.add(cur2.val);
			cur2 = cur2.next;
		}

		ListNode resultNode = null;
		ListNode resultCurNode = null;
		boolean up = false;
		while (!(queue1.isEmpty() && queue2.isEmpty() && !up)) {
			int s1 = queue1.isEmpty() ? 0 : queue1.poll();
			int s2 = queue2.isEmpty() ? 0 : queue2.poll();

			int sum = up ? s1 + s2 + 1 : s1 + s2;
			int num = sum % 10;
			if (sum >= 10) {
				up = true;
			} else {
				up = false;
			}

			if (resultNode == null) {
				resultNode = new ListNode(num);
				resultCurNode = resultNode;
			} else {
				resultCurNode.next = new ListNode(num);
				resultCurNode = resultCurNode.next;
			}
		}
		return resultNode;
	}
}
