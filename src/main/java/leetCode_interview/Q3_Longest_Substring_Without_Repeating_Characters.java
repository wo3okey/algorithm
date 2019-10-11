package leetCode_interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by wookey on 06/10/2019.
 */
public class Q3_Longest_Substring_Without_Repeating_Characters {
	public static void main(String args[]) {

	}

	public int lengthOfLongestSubstring(String s) {
		int n = s.length(), ans = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>(); // current index of character
		// try to extend the range [i, j]
		for (int j = 0, i = 0; j < n; j++) {
			if (map.containsKey(s.charAt(j))) {
				i = Math.max(map.get(s.charAt(j)), i);
			}
			ans = Math.max(ans, j - i + 1);
			map.put(s.charAt(j), j + 1);
		}
		return ans;
	}

	private boolean isAllUnique(String s, int start, int end) {
		Set<Character> word = new HashSet<Character>();
		for (int i = start; i < end; i++) {
			char c = s.charAt(i);

			if (word.contains(c)) {
				return false;
			}
			word.add(c);
		}
		return true;
	}
}
