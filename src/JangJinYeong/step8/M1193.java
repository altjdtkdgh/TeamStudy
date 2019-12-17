package JangJinYeong.step8;

import java.util.Scanner;
/*
 * 14396 KB
 * 112 ms
 */
public class M1193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = Integer.parseInt(sc.nextLine());
		int sum = 0, line = 0, i = 0;
		for (i = 0; i <= X; i++) if (sum < i) sum += ++line;
		i--;
		if (line%2 == 0) System.out.println((line - sum + i) + "/" + (sum - i + 1));
		else System.out.println((sum - i + 1) + "/" + (line - sum + i));
	}
}