package ChoiTaeWon.step8;

import java.util.Scanner;

/**
 * 
 * 메모리 : 15152 KB
 * 시간    : 132 ms
 */
public class M10250 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0 ; i<T;i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			
			System.out.println(roomNo(H, N));
		}
	}

	private static int roomNo(int h, int n) {
		int x = (n/h) + 1;
		int y = n%h;
		if(n%h == 0) {
			x = n/h;
			y = h;
		}
		
		return y * 100 + x;
	}

}
