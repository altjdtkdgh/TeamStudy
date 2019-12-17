package JangJinYeong.step8;

import java.util.Scanner;
/*
 * 14356 KB
 * 108 ms
 */
public class M2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int min = 0;
		for (int i = 0; i <= 1000; i++) {
			int j = 0;
			while (3*i + 5*j != N && 5000/3 > j ) {
				j++;
			}
			if (3*i + 5*j == N) {
				min = i + j;
				break;
			}
		}
		if (min != 0) System.out.println(min);
		else System.out.println(-1);
	}

}
