package ChoiTaeWon.step6;

import java.util.Scanner;

/*
 * 어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
 * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
 * 
 *  첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
 *  첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
 *  
 *  메모리 : 14360 KB
 *  시간    : 108 ms
 */
public class M1065 {
	static int cnt = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		arithmetic(n);
		
		System.out.println(cnt);
	}
	
	public static void arithmetic(int n) {
		if(n == 0) return;
		
		int an = n;
		
		int arr[] = new int[3];
		
		if(n < 100) {
			cnt++;
		}else if(n >= 100 && n < 1000) {
			int i = 0;
			while(an > 0) {
				arr[i] = an%10;
				an/=10;
				i++;
			}
			if(arr[0] - arr[1] == arr[1] - arr[2]) cnt++;
		}
		
		arithmetic(n-=1);
	}
	
}
