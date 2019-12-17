package JangJinYeong.step8;

import java.util.Arrays;
import java.util.Scanner;
/*
 * 21756 KB
 * 272 ms
 */
public class M10250 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = Integer.parseInt(sc.nextLine());
		int[] rs = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			int[] HWN = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int XX = 0, YY = 0;
			while (HWN[0]*XX < HWN[2]) {
				YY = HWN[2]-HWN[0]*XX;
				XX++;
			}
			System.out.println(YY);
			rs[i] = 100*YY + XX;
		}
		for (int a : rs) System.out.println(a);
	}

}
