package programmers.hash;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by wookey on 06/10/2019.
 */
public class Q1 {
	public static void main(String args[]) {

	}

	public String solution(String[] participant, String[] completion) {
		Set<String> completionSet = new HashSet<String>();
		for (String c : completion) {
			completionSet.add(c);
		}

		Map<String, Integer> participantMap = new HashMap<String, Integer>();
		for (String p : participant) {
			if (participantMap.containsKey(p)) {
				int value = participantMap.get(p);
				participantMap.put(p, value + 1);
			} else {
				participantMap.put(p, 1);
			}
		}

		for (String p : participant) {
			if (!completionSet.contains(p)) {
				return p;
			}

			int value = participantMap.get(p);
			if (value == 1) {
				continue;
			} else {
				return p;
			}
		}
		return "";
	}
}
