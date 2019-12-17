package JangJinYeong.step8;

import java.util.Arrays;
import java.util.Scanner;
/*
 * Time Over
 */
public class M2869 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] abv = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int accrued = 0, days = 0, oneDay = abv[0] - abv[1];
		while (accrued + abv[0] <= abv[2]) {
			accrued += oneDay;
			days++;
		}
		System.out.println(days);
	}

}
