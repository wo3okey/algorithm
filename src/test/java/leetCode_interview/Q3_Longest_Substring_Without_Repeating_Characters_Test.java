package leetCode_interview;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by wookey on 07/10/2019.
 */
public class Q3_Longest_Substring_Without_Repeating_Characters_Test {
	Q3_Longest_Substring_Without_Repeating_Characters q3_longest_substring_without_repeating_characters = new Q3_Longest_Substring_Without_Repeating_Characters();

	@Test
	public void q3_tc1() {
		String s = "abcabcbb";
		int result = 3;

		assertEquals(q3_longest_substring_without_repeating_characters.lengthOfLongestSubstring(s), result);
	}

	@Test
	public void q3_tc2() {
		String s = "bbbbb";
		int result = 1;

		assertEquals(q3_longest_substring_without_repeating_characters.lengthOfLongestSubstring(s), result);
	}

	@Test
	public void q3_tc3() {
		String s = "pwwkew";
		int result = 3;

		assertEquals(q3_longest_substring_without_repeating_characters.lengthOfLongestSubstring(s), result);
	}

	@Test
	public void q3_tc4() {
		String s = " ";
		int result = 0;

		assertEquals(q3_longest_substring_without_repeating_characters.lengthOfLongestSubstring(s), result);
	}

	@Test
	public void q3_tc5() {
		String s = "au";
		int result = 2;

		assertEquals(q3_longest_substring_without_repeating_characters.lengthOfLongestSubstring(s), result);
	}

	@Test
	public void q3_tc6() {
		String s = "dvdf";
		int result = 3;

		assertEquals(q3_longest_substring_without_repeating_characters.lengthOfLongestSubstring(s), result);
	}
}
