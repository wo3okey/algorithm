package kaka_blind_2017.stage1;

/**
 * [1차] 비밀지도
 */
public class Q7 {
	public static void main(String args[]) {

	}

	public String[] solution(int n, int[] arr1, int[] arr2) {
		char[][] arr1BinaryArr = getBinaryArr(arr1, n);
		char[][] arr2BinaryArr = getBinaryArr(arr2, n);
		String[][] sumBinaryArr = getSumBinaryArr(arr1BinaryArr, arr2BinaryArr, n);
		String[] result = getResult(sumBinaryArr, n);
		return result;
	}

	private String[] getResult(String[][] sumBinaryArr, int n) {
		String[] result = new String[n];
		for (int i = 0; i < n; i++) {
			String resultRow = "";
			for (int j = 0; j < n; j++) {
				resultRow += sumBinaryArr[i][j];
			}
			result[i] = resultRow;
		}
		return result;
	}

	private String[][] getSumBinaryArr(char[][] arr1BinaryArr, char[][] arr2BinaryArr, int n) {
		String[][] sumBinaryArr = new String[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sumBinaryArr[i][j] = getCode(arr1BinaryArr[i][j], arr2BinaryArr[i][j]);
			}
		}
		return sumBinaryArr;
	}

	private String getCode(char c1, char c2) {
		if (c1 == '0' && c2 == '0') {
			return " ";
		} else {
			return "#";
		}
	}

	private char[][] getBinaryArr(int[] arr, int n) {
		char[][] binaryArr = new char[n][n];
		for (int i = 0; i < n; i++) {
			String binaryString = Integer.toBinaryString(arr[i]);
			int diffCount = n - binaryString.length();
			if (diffCount != 0) {
				String zero = "";
				for (int d = 0; d < diffCount; d++) {
					zero += "0";
				}
				binaryString = zero + binaryString;
			}

			for (int j = 0; j < binaryString.length(); j++) {
				binaryArr[i][j] = binaryString.charAt(j);
			}
		}
		return binaryArr;
	}
}
