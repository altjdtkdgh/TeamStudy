package JangJinYeong.step7;

import java.util.Scanner;
/*
 * 14204 KB
 * 104 ms
 */
public class M10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		for (char c = 'a'; c <= 'z'; c++) System.out.print(S.indexOf(c) + " ");
	}

}
