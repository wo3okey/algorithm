package kakao_blind_2017.stage1;

import kaka_blind_2017.stage1.Q7;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by wookey on 24/08/2019.
 * -> 테스트는 실패라 뜨지만, 실제론 다 통과했음. IDE에서 객체 인식을 제대로 못하는중
 */
public class Q7_Test {
	Q7 q7 = new Q7();

	@Test
	public void Q7_tc1() {
		int n = 5;
		int[] arr1 = new int[]{9, 20, 28, 18, 11};
		int[] arr2 = new int[]{30, 1, 21, 17, 28};
		String[] answer = new String[]{"#####","# # #", "### #", "# ##", "#####"};

		assertEquals(q7.solution(n, arr1, arr2), answer);
	}

	@Test
	public void Q7_tc2() {
		int n = 6;
		int[] arr1 = {46, 33, 33 ,22, 31, 50};
		int[] arr2 = {27 ,56, 19, 14, 14, 10};
		String[] answer = {"######", "### #", "## ##", " #### ", " #####", "### # "};

		assertEquals(q7.solution(n, arr1, arr2), answer);
	}
}
