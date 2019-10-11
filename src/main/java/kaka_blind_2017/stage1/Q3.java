package kaka_blind_2017.stage1;

import java.util.HashMap;
import java.util.Map;

/**
 * [1차] 캐시
 */
public class Q3 {
	public static void main(String args[]) {

	}

	public int solution(int cacheSize, String[] cities) {
		int systemTime = 0;
		int totalTime = 0;
		int cacheHit = 1;
		int cacheMiss = 5;
		String[] lowerCities = getLowerCities(cities);

		Map<String, Integer> cache = new HashMap();

		for (int i = 0; i < lowerCities.length; i++) {
			systemTime++;
			String city = lowerCities[i];

			// hit 될때
			if (cache.containsKey(lowerCities[i])) {
				totalTime += cacheHit;
				cache.remove(city);
				cache.put(city, systemTime);
				continue;
			}

			// miss 일때
			if (cache.size() == cacheSize) {
				String minKey = getLruKey(cache); // 가장 오래 안쓴(LRU) 키
				cache.remove(minKey); // 가장 오래 안쓴 키 삭제
			}

			cache.put(city, systemTime);
			totalTime += cacheMiss;
		}
		return totalTime;
	}

	private String getLruKey(Map<String, Integer> cache) {
		int min = Integer.MAX_VALUE;
		String minKey = "";

		for (Map.Entry<String, Integer> entry : cache.entrySet()) {
			int time = entry.getValue();
			if (time < min) {
				min = time;
				minKey = entry.getKey();
			}
		}
		return minKey;
	}

	public String[] getLowerCities(String[] cities) {
		String[] lowerCities = new String[cities.length];
		for (int i = 0; i < lowerCities.length; i++) {
			lowerCities[i] = cities[i].toLowerCase();
		}
		return lowerCities;
	}
}
