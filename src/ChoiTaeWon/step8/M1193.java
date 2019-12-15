package ChoiTaeWon.step8;

import java.util.Scanner;

/**
 * 
 * 이와 같이 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
 * X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
 * 
 * 메모리 : 14252 KB
 * 시간   : 104 ms
 */
public class M1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		
		int i = 0;
		int sum = 0;
		
		int den = 0; //분자
		int mole = 0; //분모
		
		while(i+sum<X) {
			sum += i++;
		}
		
		// 분자
		if(i%2==0) {
			den = X -sum;
		}else {
			den = i+1-(X-sum);
		}
		
		mole = i + 1-den;
		
		System.out.println(den+"/"+mole);
		
	}
}
















//int cnt = 1; //n번째
//int nIdx = 1;
//
//int den = 1; //분자
//int mole = 1; //분모
//
//int nDen = 0;
//int nMole = 0;
//
//while(true) {
//	
//	den = nIdx;
//	mole = 1; 
//	
//	
//	for(int i=1;i<=nIdx;i++) {
//		if(X == cnt) {
//			nDen = den;
//			nMole = mole;
//		}
//		den--;
//		mole++;
//		cnt++;
//	}
//	
//	if(cnt >= X) break;
//	nIdx++;
//}
//System.out.println(nDen+"/"+nMole);