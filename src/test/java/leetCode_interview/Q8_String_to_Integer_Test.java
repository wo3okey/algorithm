package leetCode_interview;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by wookey on 06/10/2019.
 */
public class Q8_String_to_Integer_Test {
	Q8_String_to_Integer q8_string_to_integer = new Q8_String_to_Integer();

	@Test
	public void q8_tc1() {
		String str = "   -123";
		int result = -123;
		assertEquals(q8_string_to_integer.myAtoi(str), result);
	}

	@Test
	public void q8_tc2() {
		String str = "4193 with words";
		int result = 4193;
		assertEquals(q8_string_to_integer.myAtoi(str), result);
	}

	@Test
	public void q8_tc3() {
		String str = "words and 987";
		int result = 0;
		assertEquals(q8_string_to_integer.myAtoi(str), result);
	}

	@Test
	public void q8_tc4() {
		String str = "-91283472332";
		int result = -2147483648;
		assertEquals(q8_string_to_integer.myAtoi(str), result);
	}

	@Test
	public void q8_tc5() {
		String str = "";
		int result = 0;
		assertEquals(q8_string_to_integer.myAtoi(str), result);
	}

	@Test
	public void q8_tc6() {
		String str = "-";
		int result = 0;
		assertEquals(q8_string_to_integer.myAtoi(str), result);
	}

	@Test
	public void q8_tc7() {
		String str = "+1";
		int result = 1;
		assertEquals(q8_string_to_integer.myAtoi(str), result);
	}

	@Test
	public void q8_tc8() {
		String str = "3.14159";
		int result = 3;
		assertEquals(q8_string_to_integer.myAtoi(str), result);
	}

	@Test
	public void q8_tc9() {
		String str = "1";
		int result = 1;
		assertEquals(q8_string_to_integer.myAtoi(str), result);
	}

	@Test
	public void q8_tc10() {
		String str = "+-2";
		int result = 0;
		assertEquals(q8_string_to_integer.myAtoi(str), result);
	}
}
