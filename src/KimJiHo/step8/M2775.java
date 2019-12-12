package KimJiHo.step8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class M2775 {
	/*
	 * ���� 
	 * ��� �ݻ�ȸ�� �����ϴ� ���� �����ϴ� ����� �̹� ��ȸ�� �γ�ȸ���� �ǰ� �;� �� ���� ������� �ҷ� ��� �ݻ�ȸ�� �����Ϸ��� �Ѵ�.
	 * 
	 * �� ����Ʈ�� ���ָ� �Ϸ��� ������ �ִµ�, ��a���� bȣ�� ����� �ڽ��� �Ʒ�(a-1)���� 1ȣ���� bȣ���� ������� ���� �ո�ŭ �������
	 * ������ ��ƾ� �Ѵ١� �� ��� ������ �� ��Ű�� ���;� �Ѵ�.
	 * 
	 * ����Ʈ�� ����ִ� ���� ���� ��� ���ֹε��� �� ��� ������ ��Ű�� �Դٰ� �������� ��, �־����� ���� ���� k�� n�� ���� k����
	 * nȣ���� �� ���� ��� �ִ��� ����϶�. ��, ����Ʈ���� 0������ �ְ� �������� 1ȣ���� ������, 0���� iȣ���� i���� ���.
	 * 
	 * �Է� 
	 * ù ��° �ٿ� Test case�� �� T�� �־�����. �׸��� ������ ���̽����� �Է����� ù ��° �ٿ� ���� k, �� ��° �ٿ� ����
	 * n�� �־�����. (1 <= k <= 14, 1 <= n <= 14)
	 * 
	 * ��� 
	 * ������ Test case�� ���ؼ� �ش� ���� ���ֹ� ���� ����϶�.
	 * 
	 * �޸�: 12868kb
	 * �ð�: 224ms
	 */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t ; i ++) {
			int k = Integer.parseInt(br.readLine());//��
			int n = Integer.parseInt(br.readLine());//ȣ
			
			int result = reFunc(k,n);
			
			bw.write(String.valueOf(result)+ "\n");
			
		}
		bw.flush();
		
		/* ���򰥸���...
		 * 1   5   15  35  70  126 210 330 495
		 * 1   4   10  20  35  56  84  120 165
		 * 1   3   6   10  15  21  28  36  45
		 * 1   2   3   4   5   6   7   8   9 
		 * */
	}
	
	
	public static int reFunc(int k, int n) {//����Լ�..
		/* k���� nȣ�� = > (k�� n-1ȣ) + (k-1�� nȣ) 
		 * �� ���� ��ȯ�ϸ鼭 ��� ���ȣ�� �ϸ� ��..
		 * �׷��� ȣ��(n)�� 1�̸� ������ n��(1��)�̰�, ������ 0�̸� �� ������ n����..
		 * ����.. k�� 0�̰ų� n�� 1�̸� n�� �����ϸ鼭 ��͸� �����Ű�� ��.
		 * 
		 * 
		 * */
		
		if(k==0 || n == 1) {
			return n;
		}else {
			return reFunc(k, n-1) + reFunc(k-1, n);
		}
		
		
	}
}
