package KimJiHo.step8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class M2292 {
	/*
	 * ����
	 * 
	 * 
	 * ���� �׸��� ���� ���������� �̷���� ������ �ִ�. �׸����� ���� �ٿ� ���� �߾��� �� 1���� �����ؼ� �̿��ϴ� �濡 ���ư��鼭 1��
	 * �����ϴ� ��ȣ�� �ּҷ� �ű� �� �ִ�. ���� N�� �־����� ��, ������ �߾� 1���� N�� ����� �ּ� ������ ���� ������ �� �� �� ����
	 * ���� ����������(���۰� ���� �����Ͽ�)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ���� ���, 13������ 3��, 58������ 5���� ������.
	 * 
	 * �Է�
	 *  ù° �ٿ� N(1 �� N �� 1,000,000,000)�� �־�����.
	 * 
	 * ���
	 *  �Է����� �־��� ����� �ּ� ������ ���� ������ �� �� �� ���� ���� �������� ����Ѵ�.
	 * 
	 * �޸� : 13308 kb
	 * �ð� : 744ms
	 *
	 */
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 1;
		
		
		while(countGroup(cnt)< n) {
			cnt++;
		}
			
		System.out.println((cnt));
	}
	
	public static int countGroup(int n) {
		if(n == 1) {
			return n;
		}
		
		return countGroup(n-1) + 6*(n-1);
		
	}

}
