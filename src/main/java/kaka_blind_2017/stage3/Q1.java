package kaka_blind_2017.stage3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * [3차] 압축
 */
public class Q1 {
	int wordCount = 1;
	Map<String, Integer> map = createMap();

	private Map<String, Integer> createMap() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (char i = 'A'; i <= 'Z'; i++) {
			map.put(String.valueOf(i), wordCount++);
		}
		return map;
	}

	public int[] solution(String msg) {
		List<Integer> answerList = new ArrayList<Integer>();

		for (int i = 0; i < msg.length(); i++) {
			String element = String.valueOf(msg.charAt(i));

			for (int j = i; j < msg.length(); j++) {
				if (i == msg.length() - 1) {
					answerList.add(map.get(element));
					break;
				}

				String next = String.valueOf(msg.charAt(i + 1));
				String newWord = element + next;

				if (!map.containsKey(newWord)) {
					answerList.add(map.get(element));

					map.put(newWord, wordCount++);
					break;
				}
				element += next;
				i++;
			}
		}

		int[] answerArr = new int[answerList.size()];
		for (int i = 0; i < answerList.size(); i++) {
			answerArr[i] = answerList.get(i);
		}
		return answerArr;
	}
}
