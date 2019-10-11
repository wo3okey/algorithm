package kaka_blind_2017.stage3;

import java.util.*;

/**
 * [3차] 파일명 정렬
 */
public class Q2 {

	public String[] solution(String[] files) {
		Map<String, File> fileMap = new LinkedHashMap<String, File>();
		for (String fileName : files) {
			fileMap.put(fileName, new File(fileName));
		}

		Map<String, File> sorted = sort(fileMap);

		int idx = 0;
		String[] Return = new String[sorted.size()];
		for (Map.Entry<String, File> entry : sorted.entrySet()) {
			Return[idx] = entry.getKey();
			System.out.println(entry.getKey());
			idx++;
		}
		return Return;
	}

	private Map<String, File> sort(Map<String, File> fileMap) {
		List<Map.Entry<String, File>> fileList = new LinkedList<Map.Entry<String, File>>(fileMap.entrySet());

		Collections.sort(fileList, new Comparator<Map.Entry<String, File>>() {
			public int compare(Map.Entry<String, File> o1, Map.Entry<String, File> o2) {
				if (o1.getValue().head.equals(o2.getValue().head)) {
					return (o1.getValue().number).compareTo(o2.getValue().number);
				}
				return (o1.getValue().head).compareTo(o2.getValue().head);
			}
		});

		Map<String, File> sorted = new LinkedHashMap<String, File>();
		for (Map.Entry<String, File> entry : fileList) {
			sorted.put(entry.getKey(), entry.getValue());
		}
		return sorted;
	}

	class File {
		String head;
		Integer number;
		String tail;

		public File(String fileName) {
			int numberCount = 0;
			int numberStart = 0;
			int numberEnd = 0;
			StringBuilder builder = new StringBuilder();

			for (int i = 0; i < fileName.length(); i++) {
				char element = fileName.charAt(i);

				if (String.valueOf(element).matches("[0-9]")) {
					if (numberCount == 5) {
						continue;
					}

					if (i < fileName.length() - 1) {
						if (!String.valueOf(fileName.charAt(i + 1)).matches("[0-9]")) {
							numberEnd = i;
						} else if (numberCount == 4) {
							numberEnd = i;
						}
					}

					if (builder.length() == 0) {
						numberStart = i;
					}
					builder.append(element);
					numberCount++;
				}
			}

			this.head = fileName.substring(0, numberStart).toUpperCase();
			this.number = Integer.parseInt(fileName.substring(numberStart, numberEnd + 1));
			this.tail = fileName.substring(numberEnd + 1, fileName.length());
		}
	}
}
