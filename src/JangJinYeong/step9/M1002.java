package JangJinYeong.step9;

import java.util.Arrays;
import java.util.Scanner;

public class M1002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = Integer.parseInt(sc.nextLine());
		int[] rs = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			int[] xyr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			double ab = Math.sqrt(Math.pow(xyr[0]-xyr[3], 2) + Math.pow(xyr[1]-xyr[4], 2));
			double r1 = xyr[2], r2 = xyr[5];
			
			if (ab == 0 && r1 == r2) rs[i] = -1;
			else if ((ab == 0 && r1 != r2) || (r1+r2 < ab) || Math.abs(r1-r2) > ab) rs[i] = 0;
			else if (r1 + r2 == ab || Math.abs(r1-r2) == ab ) rs[i] = 1;
			else if (r1 + r2 > ab) rs[i] = 2;
		}
		for (int i : rs) System.out.println(i);
	}

}