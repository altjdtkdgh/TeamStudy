package JangJinYeong.step8;

import java.util.Scanner;
/*
 * 14196 KB
 * 100 ms
 */
public class M2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= N; i++) {
			System.out.println(Math.pow(i, 3) - Math.pow(i-1, 3));
			if (N <= Math.pow(i, 3) - Math.pow(i-1, 3)) {
				System.out.println(i);
				break;
			}
		}
	}

}
