package LeeSangHo.step8;

import java.util.Scanner;
/*
 * 
 * 이와 같이 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.

108ms
 */
public class M1193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum = 0;
		int a =0;
		
		while(sum < n) 
		{
			a++;
			sum += a;
		}
		int b = 0;
		int c = 0;
		int d = n -(sum-a)-1;
		
		if(a%2 != 0)
		{
			b = a-d;
			c = 1+d;
		}
		else
		{
			c = a-d;
			b = 1+d;
		}
		
		System.out.println(b+"/"+c);
	}

}
