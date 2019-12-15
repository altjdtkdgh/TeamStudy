package ChoiTaeWon.step8;


import java.util.Scanner;
/**
 * 
 * 벌집
 * 1 7 19 37 61 
 * 
 * 1 
 * 7 = 1 + 6
 * 19 = 7 + 6 + 6
 * 37 = 19 + 6 + 6 + 6
 * 61 = 37 + 6 + 6 + 6 + 6
 * 91 = 61 + 6 + 6 + 6 + 6 + 6
 * 메모리 : 14296 KB
 * 시간   : 108 ms
 */
public class M2922 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int cnt = 1;
		int nRoom = 1;
		int nTemp = 6;
		
		while(true) {
			if(n <= nRoom) {
				break;
			}
			
			nRoom += nTemp;
			nTemp += 6;
			cnt++;
		}
		
		System.out.println(cnt);

	}
}


