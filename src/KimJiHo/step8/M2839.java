package KimJiHo.step8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class M2839 {
//	����
//	����̴� ���� �������忡�� ������ ����ϰ� �ִ�. ����̴� ���� �������Կ� ������ ��Ȯ�ϰ� Nų�α׷��� ����ؾ� �Ѵ�. �������忡�� ����� ������ ������ ����� �ִ�. ������ 3ų�α׷� ������ 5ų�α׷� ������ �ִ�.
//
//	����̴� ������ ������, �ִ��� ���� ������ ��� ������ �Ѵ�. ���� ���, 18ų�α׷� ������ ����ؾ� �� ��, 3ų�α׷� ���� 6���� �������� ������, 5ų�α׷� 3���� 3ų�α׷� 1���� ����ϸ�, �� ���� ������ ������ ����� �� �ִ�.
//
//	����̰� ������ ��Ȯ�ϰ� Nų�α׷� ����ؾ� �� ��, ���� �� ���� �������� �Ǵ��� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//	�Է�
//	ù° �ٿ� N�� �־�����. (3 �� N �� 5000)
//
//	���
//	����̰� ����ϴ� ������ �ּ� ������ ����Ѵ�. ����, ��Ȯ�ϰ� Nų�α׷��� ���� �� ���ٸ� -1�� ����Ѵ�.
/*
 * �޸� : 12916kb
 * �ð� : 80ms
 * 
 * */
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		//�ϴ� 5Ű�θ� �ִ�� �����ϰ�, 
		//������ 0 Ȥ�� 3�ǹ���� �� ������ 5Ű��¥�� ������ 1���� ��
		
		int fiveKg, threeKg = 0;
		fiveKg = n/5;
		
		while(fiveKg >= 0) {
			if((n-fiveKg*5)%3 == 0) {
				threeKg = (n-fiveKg*5)/3;
				break;
			}
			fiveKg--;
		}
		
		if(fiveKg*5 + threeKg*3 == n) {
			System.out.println(fiveKg+threeKg);
		}else System.out.println(-1);
		
	}
}
