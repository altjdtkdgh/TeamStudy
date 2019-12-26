package KimJiHo.step10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class M10870 {
//	����
//	�Ǻ���ġ ���� 0�� 1�� �����Ѵ�. 0��° �Ǻ���ġ ���� 0�̰�, 1��° �Ǻ���ġ ���� 1�̴�. �� ���� 2��° ���ʹ� �ٷ� �� �� �Ǻ���ġ ���� ���� �ȴ�.
//
//	�̸� ������ �Ẹ�� Fn = Fn-1 + Fn-2 (n>=2)�� �ȴ�.
//
//	n=17�϶� ���� �Ǻ���ġ ���� �Ẹ�� ������ ����.
//
//	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
//
//	n�� �־����� ��, n��° �Ǻ���ġ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//	�Է�
//	ù° �ٿ� n�� �־�����. n�� 20���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.
//
//	���
//	ù° �ٿ� n��° �Ǻ���ġ ���� ����Ѵ�.
//
	/*
	 * �޸� : 12904kb
	 * �ð� : 72ms
	 * 
	 * */
	
	static int[] a;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		a = new int[n+1];
		a[0] = 0;
		if(n != 0) a[1] = 1;

		//0 1 1 2 3 5 8 13 21 34 55
		System.out.println(fibo(n));
		
	}
	
	public static int fibo(int n) {
		
		if(n<=1) {
			return a[n];
		}
		
		return fibo(n-1) + fibo(n-2);
		
	}

}
