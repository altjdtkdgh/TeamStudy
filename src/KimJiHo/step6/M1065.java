package KimJiHo.step6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class M1065 {
	/*
	 * ����
	 * � ���� ���� X�� �ڸ����� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�. ���������� ���ӵ� �� ���� ���� ���̰� ������ ������
	 * ���Ѵ�. N�� �־����� ��, 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� 
	 * ù° �ٿ� 1,000���� �۰ų� ���� �ڿ��� N�� �־�����.
	 * 
	 * ��� 
	 * ù° �ٿ� 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����Ѵ�.
	 * 
	 * �޸� : 13344kb 
	 * �ð� : 96ms
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String N = br.readLine();
		int cnt = 0;
		
		for(int i = 1 ; i <= Integer.parseInt(N); i++) {
			if(isHanSu(i)) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	
	}
	
	public static boolean isHanSu(int num) {//�Ѽ����� ��ȯ
		boolean flag = false;
		
		int[] su = splitNum(String.valueOf(num));
		
		if(su.length <= 2) { // 2�ڸ� ���ϴ� ������ �Ѽ���
			flag = true;
		}else {
			int dif = su[1] - su[0]; //1�ڸ�,2�ڸ� ��
			
			for(int i = su.length -1 ; i >1 ; i--) {
				if(su[i]-su[i-1] != dif) {
					return false;
				}
				flag = true;
			}
		}
		
		return flag;
		
	}
	
	public static int[] splitNum(String N) {
		int[] a = new int[N.length()];//�� ����ũ���� int�迭 ����
		
		for(int i = 0 ; i < N.length(); i++) {
			a[i] = Integer.parseInt(N.substring(i,i+1));
		}
		
		return a; // �� �ڸ����� �迭�� ��ȯ
	}
	

}
