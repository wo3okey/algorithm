package hash;

import org.junit.Test;
import programmers.hash.Q1;

import static org.junit.Assert.assertEquals;

/**
 * Created by wookey on 06/10/2019.
 */
public class Q1_Test {
	Q1 q1 = new Q1();

	@Test
	public void Q1_tc1() {
		String[] participant = new String[]{"leo", "kiki", "eden"};
		String[] completion = new String[]{"eden", "kiki"};

		String result = "leo";

		assertEquals(q1.solution(participant, completion), result);
	}

	@Test
	public void Q1_tc2() {
		String[] participant = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = new String[]{"josipa", "filipa", "marina", "nikola"};

		String result = "vinko";

		assertEquals(q1.solution(participant, completion), result);
	}

	@Test
	public void Q1_tc3() {
		String[] participant = new String[]{"mislav", "stanko", "mislav", "ana"};
		String[] completion = new String[]{"stanko", "ana", "mislav"};

		String result = "mislav";

		assertEquals(q1.solution(participant, completion), result);
	}

	@Test
	public void Q1_tc4() {
		String[] participant = new String[]{"mislav", "mislav", "mislav", "ana"};
		String[] completion = new String[]{"mislav", "mislav", "mislav"};

		String result = "ana";

		assertEquals(q1.solution(participant, completion), result);
	}
}
