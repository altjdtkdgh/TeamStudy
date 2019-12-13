package JangJinYeong.step7;

import java.util.Scanner;

/*
 * 34392 KB
 * 380 ms
 */
public class M1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine().toUpperCase();
		int[] cnt = new int[26];
		char ans = 0;
		for (int i = 0, max = 0; i < S.length(); i++) {
			int n = ++cnt[S.charAt(i) - 65];
			if (max < n) {
				max = n;
				ans = S.charAt(i);
			} else if (max == n) {
				ans = '?';
			}
		}
		System.out.println(ans);
	}

}
