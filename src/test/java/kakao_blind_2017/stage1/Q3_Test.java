package kakao_blind_2017.stage1;

import kaka_blind_2017.stage1.Q3;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by wookey on 24/08/2019.
 */
public class Q3_Test {
	Q3 q3 = new Q3();

	@Test
	public void Q3_tc1() {
		int cacheSize = 3;
		String[] cities = new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

		assertEquals(q3.solution(cacheSize, cities), 50);
	}

	@Test
	public void Q3_tc2() {
		int cacheSize = 3;
		String[] cities = new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};

		assertEquals(q3.solution(cacheSize, cities), 21);
	}

	@Test
	public void Q3_tc3() {
		int cacheSize = 2;
		String[] cities = new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};

		assertEquals(q3.solution(cacheSize, cities), 60);
	}

	@Test
	public void Q3_tc4() {
		int cacheSize = 5;
		String[] cities = new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};

		assertEquals(q3.solution(cacheSize, cities), 52);
	}

	@Test
	public void Q3_tc5() {
		int cacheSize = 2;
		String[] cities = new String[]{"Jeju", "Pangyo", "NewYork", "newyork"};

		assertEquals(q3.solution(cacheSize, cities), 16);
	}

	@Test
	public void Q3_tc6() {
		int cacheSize = 0;
		String[] cities = new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

		assertEquals(q3.solution(cacheSize, cities), 25);
	}
}
