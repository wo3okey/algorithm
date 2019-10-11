package kaka_blind_2017.stage1;

import java.util.ArrayList;
import java.util.List;

/**
 * [1차] 뉴스 클러스터링
 */
public class Q5 {
	public int solution(String str1, String str2) {
		float jacard;
		List<String> str1MultiList = getMultiList(str1);
		List<String> str2MultiList = getMultiList(str2);

		System.out.println(str1MultiList);
		System.out.println(str2MultiList);

		List<String> intersection = getIntersection(str1MultiList, str2MultiList);
		List<String> union = getUnion(str1MultiList, str2MultiList);

		System.out.println(intersection);
		System.out.println(union);

		if (intersection.size() == 0 || union.size() == 0) {
			jacard = 1;
			return (int) Math.floor(jacard * 65536);
		}

		jacard = (float) intersection.size() / union.size();
		return (int) Math.floor(jacard * 65536);
	}

	private List<String> getIntersection(List<String> str1MultiList, List<String> str2MultiList) {
		List<String> intersection = new ArrayList<String>();
		intersection.addAll(str1MultiList);
		intersection.retainAll(str2MultiList);
		return intersection;
	}

	private List<String> getUnion(List<String> str1MultiList, List<String> str2MultiList) {
		List<String> union = new ArrayList<String>();

		if (str1MultiList.size() > str2MultiList.size()) {
			union.addAll(str1MultiList);
			for (String str2 : str2MultiList) {
				if (str1MultiList.contains(str2)) {
					continue;
				}
				union.add(str2);
			}
		} else {
			union.addAll(str2MultiList);
			for (String str1 : str1MultiList) {
				if (str2MultiList.contains(str1)) {
					continue;
				}
				union.add(str1);
			}
		}
		return union;
	}

	private List<String> getMultiList(String strs) {
		List<String> multiList = new ArrayList<String>();

		char[] charArr = strs.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			if (i == charArr.length - 1) {
				continue;
			}

			String element = getElement(charArr, i).toLowerCase();
			if (element.matches("^[a-zA-Z]*$")) {
				multiList.add(element);
			}
		}
		return multiList;
	}

	private String getElement(char[] charArr, int i) {
		return new StringBuilder()
				.append(charArr[i])
				.append(charArr[i + 1])
				.toString();
	}
}
