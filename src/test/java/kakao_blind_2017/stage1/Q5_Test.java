package kakao_blind_2017.stage1;

import kaka_blind_2017.stage1.Q5;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by wookey on 24/08/2019.
 */
public class Q5_Test {
	Q5 q5 = new Q5();

	@Test
	public void Q5_tc1() {
		String str1 = "FRANCE";
		String str2 = "french";

		int answer = 16384;
		assertEquals(q5.solution(str1, str2), answer);
	}

	@Test
	public void Q5_tc2() {
		String str1 = "handshake";
		String str2 = "shake hands";

		int answer = 65536;
		assertEquals(q5.solution(str1, str2), answer);
	}

	@Test
	public void Q5_tc3() {
		String str1 = "aa1+aa2";
		String str2 = "AAAA12";

		int answer = 43690;
		assertEquals(q5.solution(str1, str2), answer);
	}

	@Test
	public void Q5_tc4() {
		String str1 = "E=M*C^2";
		String str2 = "e=m*c^2";

		int answer = 65536;
		assertEquals(q5.solution(str1, str2), answer);
	}
}
