package JangJinYeong.step5;

import java.util.Arrays;
import java.util.Scanner;

public class M10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] nums = new int[N];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		Arrays.sort(nums);
		System.out.println(nums[0] + " " + nums[nums.length-1]);
	}

}
