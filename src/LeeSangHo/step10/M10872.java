package LeeSangHo.step10;

import java.util.Scanner;

/*
 * 
����
0���� ũ�ų� ���� ���� N�� �־�����. �̶�, N!�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ���� N(0 �� N �� 12)�� �־�����.

���
ù° �ٿ� N!�� ����Ѵ�.

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
