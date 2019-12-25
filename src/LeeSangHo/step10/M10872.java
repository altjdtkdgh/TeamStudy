package LeeSangHo.step10;

import java.util.Scanner;

/*
 * 
문제
0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 정수 N(0 ≤ N ≤ 12)가 주어진다.

출력
첫째 줄에 N!을 출력한다.

108ms
 */
public class M10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = 1;
		if (n >0) {
			a = number(n);
		}
		
		System.out.println(a);
		
	}

	public static int number(int n) 
	{
		if (n ==1) 
		{
			return 1;
		}
		else 
		{
			return n * number(n - 1);
		}
	}

}
