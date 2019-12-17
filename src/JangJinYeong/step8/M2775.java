package JangJinYeong.step8;

import java.util.Scanner;
/*
 * 14636 KB
 * 108 ms
 */
public class M2775 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = Integer.parseInt(sc.nextLine());
		int[] rs = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			int k = Integer.parseInt(sc.nextLine()), n = Integer.parseInt(sc.nextLine());	// kÃþ, nÈ£
			int[][] resident = new int[k+1][n+1];
			for (int j = 0; j <= n; j++) resident[0][j] = j+1;	// 0Ãþ ÃÊ±âÈ­
			for (int j = 0; j <= k; j++) resident[j][0] = 1; 	// °¢ ÃþÀÇ 1È£ ÃÊ±âÈ­
			for (int j = 1; j <= k; j++) {
				for (int l = 1; l <= n; l++) {
					resident[j][l] = resident[j][l-1] + resident[j-1][l];
					rs[i] = resident[j][l-1];
				}
			}
		}
		for (int resident : rs) System.out.println(resident);
	}
	
}