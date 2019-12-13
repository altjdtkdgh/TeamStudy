package JangJinYeong.step7;

import java.util.Arrays;
import java.util.Scanner;
/*
 * 21164 KB
 * 264 ms
 */
public class M2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int[] nums =  Arrays.stream(sb.append(sc.nextLine()).reverse().toString().split(" ")).mapToInt(Integer::parseInt).toArray();
		System.out.println(Math.max(nums[0], nums[1]));
	}

}
