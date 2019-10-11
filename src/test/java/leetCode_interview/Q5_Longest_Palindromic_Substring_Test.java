package leetCode_interview;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by wookey on 06/10/2019.
 */
public class Q5_Longest_Palindromic_Substring_Test {
	Q5_Longest_Palindromic_Substring q5_longest_palindromic_substring = new Q5_Longest_Palindromic_Substring();

	@Test
	public void q5_tc1() {
		String s = "babad";
		String result = "bab";
		assertEquals(q5_longest_palindromic_substring.longestPalindrome(s), result);
	}

	@Test
	public void q5_tc2() {
		String s = "abcdcba";
		String result = "abcdcba";
		assertEquals(q5_longest_palindromic_substring.longestPalindrome(s), result);
	}
}
