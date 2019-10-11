package leetCode_interview;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by wookey on 06/10/2019.
 */
public class Q4_Median_of_Two_Sorted_Arrays_Test {
	Q4_Median_of_Two_Sorted_Arrays q4_median_of_two_sorted_arrays = new Q4_Median_of_Two_Sorted_Arrays();

	@Test
	public void q4_tc1() {
		int[] nums1 = new int[] { 1, 3 };
		int[] nums2 = new int[] { 2 };

		double result = 2.0;

		assertEquals(q4_median_of_two_sorted_arrays.findMedianSortedArrays(nums1, nums2), result);
	}
}
