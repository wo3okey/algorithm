package kakao_blind_2017.stage1;

import kaka_blind_2017.stage1.Q4;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by wookey on 24/08/2019.
 */
public class Q4_Test {
	Q4 q4 = new Q4();

	@Test
	public void Q4_tc1() {
		String dartResult = "1S2D*3T";
		int answer = 37;

		assertEquals(q4.solution(dartResult), answer);
	}

	@Test
	public void Q4_tc2() {
		String dartResult = "1D2S#10S";
		int answer = 9;

		assertEquals(q4.solution(dartResult), answer);
	}

	@Test
	public void Q4_tc3() {
		String dartResult = "1D2S0T";
		int answer = 3;

		assertEquals(q4.solution(dartResult), answer);
	}

	@Test
	public void Q4_tc4() {
		String dartResult = "1S*2T*3S";
		int answer = 23;

		assertEquals(q4.solution(dartResult), answer);
	}

	@Test
	public void Q4_tc5() {
		String dartResult = "1D#2S*3S";
		int answer = 5;

		assertEquals(q4.solution(dartResult), answer);
	}

	@Test
	public void Q4_tc6() {
		String dartResult = "1T2D3D#";
		int answer = -4;

		assertEquals(q4.solution(dartResult), answer);
	}

	@Test
	public void Q4_tc7() {
		String dartResult = "1D2S3T*";
		int answer = 59;

		assertEquals(q4.solution(dartResult), answer);
	}
}
