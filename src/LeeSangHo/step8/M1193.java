package LeeSangHo.step8;

import java.util.Scanner;
/*
 * 
 * �̿� ���� ������ �м����� 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> �� �� ���� ������� ������ ���ʴ�� 1��, 2��, 3��, 4��, 5��, �� �м���� ����.
X�� �־����� ��, X��° �м��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

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
