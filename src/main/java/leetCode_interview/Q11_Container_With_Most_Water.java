package leetCode_interview;

/**
 * Created by wookey on 06/10/2019.
 */
public class Q11_Container_With_Most_Water {
	public static void main(String args[]) {

	}

	public int maxArea(int[] height) {
		int max = 0;
		for (int i = 0; i < height.length; i++) {
			for (int j = 0; j < height.length; j++) {
				int w = Math.abs(j - i);
				int h = height[i] < height[j] ? height[i] : height[j];
				int area = w * h;

				if (max < area) {
					max = area;
				}
			}
		}
		return max;
	}
}
