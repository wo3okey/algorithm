package kaka_blind_2017.stage1;

import java.util.ArrayList;
import java.util.List;

/**
 * [1차] 다트 게임
 */
public class Q4 {
	class Dart {
		int score;
		int bonus;
		String option;
		int answer;

		public Dart(String result) {
			this.score = getScore(result);
			this.bonus = getBonus(result);
			this.option = getOption(result);
		}

		private String getOption(String result) {
			String option = "";
			if (result.charAt(1) == '0' && result.length() == 4) {
				option = String.valueOf(result.charAt(3));
			}

			if (result.charAt(1) != '0' && result.length() == 3) {
				option = String.valueOf(result.charAt(2));
			}
			return option;
		}

		private int getScore(String result) {
			if (result.charAt(1) == '0') {
				return 10;
			}
			return result.charAt(0) - '0';
		}

		private int getBonus(String result) {
			char bonusChar;

			if (result.charAt(1) == '0') {
				bonusChar = result.charAt(2);
			} else {
				bonusChar = result.charAt(1);
			}

			int bonus = 0;
			switch (bonusChar) {
				case 'S':
					bonus = 1;
					break;
				case 'D':
					bonus = 2;
					break;
				case 'T':
					bonus = 3;
					break;
			}
			return bonus;
		}
	}

	public static void main(String args[]) {

	}

	public int solution(String dartResult) {
		List<Dart> darts = getDarts(dartResult);
		return getAnswer(darts);
	}

	private int getAnswer(List<Dart> darts) {
		int totalAnswer = 0;

		for (int i = 0; i < darts.size(); i++) {
			Dart dart = darts.get(i);
			dart.answer = (int) Math.pow(dart.score, dart.bonus);

			if (dart.option == "") {
				continue;
			}

			if (dart.option.equals("*")) {
				if (i == 0) {
					dart.answer *= 2;
					continue;
				}

				dart.answer *= 2;
				darts.get(i - 1).answer *= 2;
			}

			if (dart.option.equals("#")) {
				darts.get(i).answer *= -1;
			}
		}

		// 최종합
		for (Dart dart : darts) {
			totalAnswer += dart.answer;
		}
		return totalAnswer;
	}

	private List<Dart> getDarts(String dartResult) {
		List<Dart> darts = new ArrayList<Dart>();

		// 나눈 점수 만들기
		List<String> splitResult = getSplitResult(dartResult);

		// 다트 구성하기
		for (String result : splitResult) {
			Dart dart = new Dart(result);
			darts.add(dart);
		}

		return darts;
	}

	private List<String> getSplitResult(String dartResult) {
		List<String> splitResult = new ArrayList<String>();

		int start = 0;
		for (int i = 0; i < dartResult.length(); i++) {
			String data = String.valueOf(dartResult.charAt(i));

			if (i == dartResult.length() - 1) {
				splitResult.add(dartResult.substring(start, dartResult.length()));
				break;
			}

			if (data.matches("^[1-9]$") && start != i) {
				splitResult.add(dartResult.substring(start, i));
				start = i;
			}
		}
		return splitResult;
	}
}
