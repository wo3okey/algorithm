package kakao_blind_2017.stage1;

import kaka_blind_2017.stage1.Q6;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by wookey on 24/08/2019.
 */
public class Q6_Test {
	Q6 q6 = new Q6();

	@Test
	public void q6_tc1() {
		int m = 4;
		int n = 5;
		String[] board = new String[]{"CCBDE", "AAADE", "AAABF", "CCBBF"};

		assertEquals(14, q6.solution(m, n, board));
	}

	@Test
	public void q6_tc2() {
		int m = 6;
		int n = 6;
		String[] board = new String[]{"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"};

		assertEquals(15, q6.solution(m, n, board));
	}
}
