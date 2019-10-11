package leetCode_interview;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by wookey on 06/10/2019.
 */
public class Q7_Reverse_Integer_Test {
	Q7_Reverse_Integer q7_reverse_integer = new Q7_Reverse_Integer();

	@Test
	public void q7_tc1() {
		int x = 123;
		int result = 321;
		assertEquals(q7_reverse_integer.reverse(x), result);
	}

	@Test
	public void q7_tc2() {
		int x = -123;
		int result = -321;
		assertEquals(q7_reverse_integer.reverse(x), result);
	}

	@Test
	public void q7_tc3() {
		int x = 120;
		int result = 21;
		assertEquals(q7_reverse_integer.reverse(x), result);
	}

	@Test
	public void q7_tc4() {
		int x = 1534236469;
		int result = 0;
		assertEquals(q7_reverse_integer.reverse(x), result);
	}

	@Test
	public void q7_tc5() {
		int x = 901000;
		int result = 109;
		assertEquals(q7_reverse_integer.reverse(x), result);
	}
}
