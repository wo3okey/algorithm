package leetCode_interview;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by wookey on 06/10/2019.
 */
public class Q11_Container_With_Most_Water_Test {
	Q11_Container_With_Most_Water q11_container_with_most_water = new Q11_Container_With_Most_Water();

	@Test
	public void q11_tc1() {
		int[] height = new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		int result = 49;
		assertEquals(q11_container_with_most_water.maxArea(height), result);
	}

}
