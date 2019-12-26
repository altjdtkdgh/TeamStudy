package KimJiHo.step10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class M10872 {
	/*
	 * 문제 
	 * 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
	 * 
	 * 입력 
	 * 첫째 줄에 정수 N(0 ≤ N ≤ 12)가 주어진다.
	 * 
	 * 출력 
	 * 첫째 줄에 N!을 출력한다.
	 *
	 * 메모리 : 12860kb
	 * 시간 : 68ms
	 * 
	 * 0!==1
	 * 
	 */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(factorial(n));
		
	}
	
	public static int factorial(int n) {
		
		if(n==1 || n==0) {
			return 1;
		}
		
		return factorial(n-1)*n;
	}
}
