package JangJinYeong.step5;

import java.util.Scanner;

public class M8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int[] scores = new int[N];
		for (int i = 0; i < N; i++) {
			String str = sc.nextLine();
			String[] chr = new String[str.length()];
			chr = str.split("");
			int score = 0; int cnt = 0;
			for (int j = 0; j < chr.length; j++) {
				if (chr[j].equals("O")) score = score + ++cnt;
				else if (chr[j].equals("X")) cnt = 0;
			}
			scores[i] = score;
		}
		for(int score : scores) {
			System.out.println(score);
		}
	}

}
