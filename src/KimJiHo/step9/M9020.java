package KimJiHo.step9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class M9020 {

//	����
//	1���� ū �ڿ��� �߿���  1�� �ڱ� �ڽ��� ������ ����� ���� �ڿ����� �Ҽ���� �Ѵ�.
//	���� ���, 5�� 1�� 5�� ������ ����� ���� ������ �Ҽ��̴�.
//	������, 6�� 6 = 2 �� 3 �̱� ������ �Ҽ��� �ƴϴ�.
//
//	�������� ������ ������ �������� ���ذ� ������,
//	2���� ū ��� ¦���� �� �Ҽ��� ������ ��Ÿ�� �� �ִٴ� ���̴�. 
//	�̷��� ���� ������ ����� �Ѵ�. 
//	��, ¦���� �� �Ҽ��� ������ ��Ÿ���� ǥ���� �� ���� ������ ��Ƽ���̶�� �Ѵ�.
//	���� ���, 4 = 2 + 2, 6 = 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 
//	14 = 3 + 11, 14 = 7 + 7�̴�. 
//	10000���� �۰ų� ���� ��� ¦�� n�� ���� ������ ��Ƽ���� �����Ѵ�.
//
//	2���� ū ¦�� n�� �־����� ��, n�� ������ ��Ƽ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//	���� ������ n�� ������ ��Ƽ���� ���� ������ ��쿡�� �� �Ҽ��� ���̰� ���� ���� ���� ����Ѵ�.
// 
//	�Է�
//	ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. 
//	�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ� ¦�� n�� �־�����. (4 �� n �� 10,000)
//
//	���
//	�� �׽�Ʈ ���̽��� ���ؼ� �־��� n�� ������ ��Ƽ���� ����Ѵ�.
//	����ϴ� �Ҽ��� ���� �ͺ��� ���� ����ϸ�, �������� �����Ѵ�.
/*
 * �޸� : 15716kb
 * �ð� : 1372ms
 * 
 * */
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < t ; i ++) {
			int even = Integer.parseInt(br.readLine()); 
			
			System.out.println(solution(even));
		}
	}
	
	static String solution(int n) {
		String result = null;
		
		for(int i = n/2 ; i >= 1 ; i--) { //�ش� ������ ���ݺ��� �������鼭 �˻�..
			if(isPrimeNum(i)) {//(������ �������� �� �� ���� ���̰� ���� �Ҽ��̱� ������.. ã���� ���̻� �˻� ���ϰ� skip)
				int num1 = i;
				int num2 = n - num1; // ���ؼ� �ڱ��ڽ��� �� �� �ִ� ��.. �� ���� �Ҽ����� �Ǻ��ϸ� ��
			
				if(isPrimeNum(num2)) {
					result = num1 + " " + num2;
					break;
				}
			}
		}
		
		return result;
	}
	
	static boolean isPrimeNum(int n) { //�Ҽ����� ��ȯ
		boolean flag = true;
		if(n == 1) return false;
		
		for(int i = 2 ; i < n ; i++) {
			if(n % i == 0) {
				flag = false;
			}
		}
		
		return flag;
	}
}
