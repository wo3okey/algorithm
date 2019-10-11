package leetCode_interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by wookey on 06/10/2019.
 */
public class Q4_Median_of_Two_Sorted_Arrays {
	public static void main(String args[]) {

	}

	/*
* 두배열 set에 담기
* set의 size가 홀수이면 size / 2 해서 버림
* set의 size가 짝수이면 size / 2 해서 (버림 + 올림) / 2
*/
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < nums1.length; i++) {
			list.add(nums1[i]);
		}

		for (int i = 0; i < nums2.length; i++) {
			list.add(nums2[i]);
		}

		Collections.sort(list);

		int middle = list.size() / 2;
		if (list.size() % 2 == 0) {
			int value1 = list.get(middle - 1);
			int value2 = list.get(middle);
			return (double) (value1 + value2) / 2;
		} else {
			double index = Math.floor(middle);
			return list.get((int) index);
		}
	}
}
