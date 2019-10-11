package leetCode_interview;

/**
 * Created by wookey on 06/10/2019.
 */
public class Q7_Reverse_Integer {
	public static void main(String args[]) {

	}

	public int reverse(int x) {
		if (x == 0) {
			return 0;
		}

		String s = String.valueOf(x);

		boolean isMinus = s.charAt(0) == '-' ? true : false;
		int start = isMinus ? 1 : 0;

		String reverseX = "";
		for (int i = s.length() - 1; i >= start; i--) {
			char c = s.charAt(i);
			reverseX += c;
		}
		if (isMinus) {
			reverseX = '-' + reverseX;
		}

		int result;
		try {
			result = Integer.parseInt(reverseX);
		} catch (RuntimeException r) {
			result = 0;
		}
		return result;
	}
}
