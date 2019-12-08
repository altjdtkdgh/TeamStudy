package ChoiTaeWon.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 
 * 문제 : N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오
 * 입력 : 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
 *      모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 * input 5
 *       20 10 35 30 7
 * 
 * output 7 35
 * 메모리 : 148868
 * 시간 : 1068 ms
 */
public class M10818 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numSize = Integer.parseInt(br.readLine());
		String sNum[] = br.readLine().split(" ");
		br.close();
		
		int num[] = new int[numSize];
		
		for(int i=0;i<numSize;i++) {
			num[i] = Integer.parseInt(sNum[i]);
		}
		
		Arrays.sort(num);
		
		System.out.println(num[0]+" "+num[numSize-1]);
		
		
	}

}
