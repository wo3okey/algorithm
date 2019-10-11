package leetCode_interview;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by wookey on 06/10/2019.
 */
public class Q1_Two_Sum_Test {
	Q1_Two_Sum q1_two_sum = new Q1_Two_Sum();

	@Test
	public void q1_two_sum_tc1() {
		int[] nums = new int[] { 2, 7, 11, 15 };
		int target = 9;

		int[] result = new int[] { 0, 1 };
		assertEquals(q1_two_sum.solution(nums, target), result);
	}
}
