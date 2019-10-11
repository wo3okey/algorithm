package leetCode_interview;

/**
 * Created by wookey on 06/10/2019.
 */
public class Q8_String_to_Integer {
	public static void main(String args[]) {

	}

	public int myAtoi(String str) {
		int res = 0;
		if (str.trim().length() == 0) {
			return 0;
		}

		char[] ch = str.trim().toCharArray();
		if (ch.length == 1 && (ch[0] == '+' || ch[0] == '-')) {
			return 0;
		}

		if (ch[0] == '+' || ch[0] == '-' || (ch[0] >= '0' && ch[0] <= '9')) {
			if (ch[0] >= '0') {
				res = ch[0] - 48;
			}

			int i = 1;
			while (i < ch.length) {
				if (!(ch[i] >= '0' && ch[i] <= '9')) {
					break;
				}

				if ((res * 10L + (ch[i] - 48)) > Integer.MAX_VALUE) {
					return (ch[0] == '-') ? Integer.MIN_VALUE : Integer.MAX_VALUE;
				}
				res = res * 10 + ch[i++] - 48;
			}
		}
		return (ch[0] == '-') ? 0 - res : res;
	}
}
