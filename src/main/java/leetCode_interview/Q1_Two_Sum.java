package leetCode_interview;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wookey on 06/10/2019.
 */
public class Q1_Two_Sum {
	public static void main(String args[]) {

	}

	public int[] solution(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for(int i = 0; i < nums.length; i++) {
			int num = nums[i];
			if (map.containsKey(target-num)) {
				return new int[]{map.get(target-num), i};
			} else {
				map.put(nums[i], i);
			}
		}
		return null;
	}
}
