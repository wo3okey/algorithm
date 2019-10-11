package kakao_blind_2017.stage3;

import kaka_blind_2017.stage3.Q1;
import kaka_blind_2017.stage3.Q2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by wookey on 24/08/2019.
 */
public class Q2_Test {
	Q2 q2 = new Q2();

	@Test
	public void Q2_tc1() {
		String[] files = new String[]{"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
		String[] Return = new String[]{"img1.png", "IMG01.GIF", "img02.png", "img2.JPG", "img10.png", "img12.png"};

		assertEquals(q2.solution(files), Return);
	}

	@Test
	public void Q2_tc2() {
		String[] files = new String[]{"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"};
		String[] Return = new String[]{"A-10 Thunderbolt II", "B-50 Superfortress", "F-5 Freedom Fighter", "F-14 Tomcat"};

		assertEquals(q2.solution(files), Return);
	}
}
