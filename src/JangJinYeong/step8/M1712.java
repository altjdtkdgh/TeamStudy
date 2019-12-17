package JangJinYeong.step8;

import java.util.Arrays;
import java.util.Scanner;
/*
 * 21292 KB
 * 244 ms
 */
public class M1712 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] costs =  Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		if (costs[2] > costs[1]) {
			System.out.println((costs[0] / (costs[2] - costs[1]) + 1));
		} else {
			System.out.println(-1);
		}
	}

}
