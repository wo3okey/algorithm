package leetCode_interview;

/**
 * Created by wookey on 06/10/2019.
 */
public class Q5_Longest_Palindromic_Substring {
	public static void main(String args[]) {

	}

	public String longestPalindrome(String s) {
		int max = 0;
		String maxSub = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j <= s.length(); j++) {
				String sub = s.substring(i, j);
				if (!isPalindromic(sub)) {
					continue;
				}

				if (max < sub.length()) {
					max = sub.length();
					maxSub = sub;
				}
			}
		}
		return maxSub;
	}

	public boolean isPalindromic(String s) {
		int size = s.length();
		int mid = size % 2 == 0 ? size / 2 : size / 2 + 1;

		for (int i = 0; i < mid; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
