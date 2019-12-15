package ChoiTaeWon.step8;

import java.util.Scanner;

/**
 * 
 * 메모리 : 14480 KB
 * 시간   : 124 ms
 */
public class M2775 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int apt[][] = new int[15][15];
		
		for(int i = 0; i< 15 ;i++) {
			apt[0][i] = i;
		}
		
		for(int i=1;i<15;i++) {
			for(int j=1;j<15;j++) {
				apt[i][j] += apt[i][j-1] + apt[i-1][j];
			}
		}
		
		for(int i=0; i < T; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(apt[k][n]);
		}
	}

}
