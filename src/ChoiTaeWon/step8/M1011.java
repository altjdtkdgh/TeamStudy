package ChoiTaeWon.step8;

import java.util.Scanner;
/**
 * n 1..i..1   i^2 2*1-1 i
 * 1 1         1   1     1
 * 2 121       4   3     2
 * 3 12321     9   5     3
 * 4 123421    16  7     4
 * 5 123454321 25  9     5
 * .. ..       ..  ..    ..
 * 어려워서 참고함
 * 
 */
public class M1011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long T = sc.nextInt();
		
		for(int i=0;i<T;i++) {
			long x = sc.nextInt();
			long y = sc.nextInt();
			long distance = y-x;
			long answer = 0;
			long dis = 0;
			
			while(distance > dis) {
				System.out.println(answer+":"+dis);
				answer++;
				dis += answer/2;
			}
			System.out.println(answer-1);
			
		
		}
	}

}
