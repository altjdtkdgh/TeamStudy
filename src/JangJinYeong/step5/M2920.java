package JangJinYeong.step5;

import java.util.Arrays;
import java.util.Scanner;

public class M2920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		String scale = null;
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i] == nums[i+1]-1) {
				scale = "ascending";
			} else if (nums[i] == nums[i+1]+1) {
				scale = "descending";
			} else {
				scale = "mixed";
				break;
			}
		}
		System.out.println(scale);
	}

}
