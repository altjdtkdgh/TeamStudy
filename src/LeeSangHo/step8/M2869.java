package LeeSangHo.step8;

import java.util.Scanner;
/*
 * �� ���� �����̰� �ִ�. �� �����̴� ���̰� V������ ���� ���븦 �ö� ���̴�.
�����̴� ���� A���� �ö� �� �ִ�. ������, �㿡 ���� �ڴ� ���� B���� �̲�������. ��, ���� �ö� �Ŀ��� �̲������� �ʴ´�.
�����̰� ���� ���븦 ��� �ö󰡷���, ��ĥ�� �ɸ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

2 1 5 

2 1  1   1
3 1  2   2
4 1  3   3
5        4

104ms
 */
public class M2869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextInt();
		long B =  sc.nextInt();
		long V =  sc.nextInt();
		
		long day = (V-B) / (A-B);
		if((V-B) % (A-B) != 0) 
		{
			day++;
		}
		
		System.out.println(day);
	}

}
