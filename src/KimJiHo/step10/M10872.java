package KimJiHo.step10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class M10872 {
	/*
	 * ���� 
	 * 0���� ũ�ų� ���� ���� N�� �־�����. �̶�, N!�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� 
	 * ù° �ٿ� ���� N(0 �� N �� 12)�� �־�����.
	 * 
	 * ��� 
	 * ù° �ٿ� N!�� ����Ѵ�.
	 *
	 * �޸� : 12860kb
	 * �ð� : 68ms
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
