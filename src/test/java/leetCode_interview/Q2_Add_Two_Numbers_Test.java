package leetCode_interview;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by wookey on 06/10/2019.
 */
public class Q2_Add_Two_Numbers_Test {
	Q2_Add_Two_Numbers q2_add_two_numbers = new Q2_Add_Two_Numbers();

	@Test
	public void q2_tc1() {
		ListNode l1 = ListNode.makeNumberListNode(2, 4, 3);
		ListNode l2 = ListNode.makeNumberListNode(5, 6, 4);
		ListNode result = ListNode.makeNumberListNode(7, 0, 8);

		assertEquals(q2_add_two_numbers.addTwoNumbers(l1, l2), result);
	}

	@Test
	public void q2_tc2() {
		ListNode l1 = ListNode.makeNumberListNode(5);
		ListNode l2 = ListNode.makeNumberListNode(5);
		ListNode result = ListNode.makeNumberListNode(0, 1);

		assertEquals(q2_add_two_numbers.addTwoNumbers(l1, l2), result);
	}

	@Test
	public void q2_tc3() {
		ListNode l1 = ListNode.makeNumberListNode(1, 8);
		ListNode l2 = ListNode.makeNumberListNode(0);
		ListNode result = ListNode.makeNumberListNode(1, 8);

		assertEquals(q2_add_two_numbers.addTwoNumbers(l1, l2), result);
	}

	@Test
	public void q2_tc4() {
		ListNode l1 = ListNode.makeNumberListNode(9, 9);
		ListNode l2 = ListNode.makeNumberListNode(1);
		ListNode result = ListNode.makeNumberListNode(0, 0, 1);

		assertEquals(q2_add_two_numbers.addTwoNumbers(l1, l2), result);
	}
}
