package JangJinYeong.step8;

import java.util.Arrays;
import java.util.Scanner;

public class M1011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = Integer.parseInt(sc.nextLine());
		int[] rs = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			int[] xy = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int distance = xy[1] - xy[0];
			
			
			
			rs[i] = 0;
		}
		for(int num : rs) System.out.println(num);
	}

}
