package KimJiHo.step8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class M1193 {

//	����
//	������ ū �迭�� ������ ���� �м����� �����ִ�.
//
//	1/1	1/2	1/3	1/4	1/5	��
//	2/1	2/2	2/3	2/4	��	��
//	3/1	3/2	3/3	��	��	��
//	4/1	4/2	��	��	��	��
//	5/1	��	��	��	��	��
//	��	��	��	��	��	��
//	�̿� ���� ������ �м����� 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> �� �� ���� ������� ������ ���ʴ�� 1��, 2��, 3��, 4��, 5��, �� �м���� ����.
//
//	X�� �־����� ��, X��° �м��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//	�Է�
//	ù° �ٿ� X(1 �� X �� 10,000,000)�� �־�����.
//
//	���
//	ù° �ٿ� �м��� ����Ѵ�.
	
	/*
	 * �޸� : 13300kb
	 * �ð� : 76ms
	 * 
	 * */
	static int x, groupCnt, result = 0; 
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		/*�׷�ȭ�ؼ� �����ϸ� �ɵ�..
		 * 
		 * 1��°�׷� = 1/1
		 * 2��°�׷� = 1/2, 2/1
		 * 3��°�׷� = 3/1, 2/2, 1/3
		 * 4��°���g = 1/4, 2/3, 3/2, 4/1
		 * 5��°�׷� = 5/1, 4/2, 3/3, 2/4, 1/5
		 * 
		 * n��°�׷��� �м������� n���̸�, n��°�׷��� m��° �м���
		 *  n�� ¦���� ��� m/n-(m-1) 
		 *  n�� Ȧ���� ��� n-(m-1)/m�̴�!
		 * 
		 * �׷��ٸ� �Էµ� X�� �� ��° �׷쿡 ���ϴ��� , �� �׷쿡�� �� ��° �м����� �˾Ƴ��� �Ǵµ�..
		 * 
		 * */
		x = Integer.parseInt(br.readLine()); 
		
		reFunc(1); // �����ϰ��� static groupCnt������ �� ���� �׷����� �� �� ����
		//System.out.println(groupCnt);
		
		//�� ��° �׷����� �˾Ƴ�����, ���� �ش� �׷쿡�� �� ��° �м����� �˾Ƴ�����
		//result������ �ش� �׷��� �� ��������° ������..
		//�׷� �����׷��� ��������° ���� �� = (result - groupCnt)
		//System.out.println("======> "+result);
		//System.out.println("�����׷촩���� => "+(result - groupCnt));
		//�׷� X�� ���� �׷��� �� ��° �м����� �˷��� (X-�����׷촩����) �� ���ϸ� ��
		
		int m = x - (result-groupCnt); //�ش� �׷��� m��° �м�..
		
		if(groupCnt % 2 == 0) {//¦����° �׷��� ��� 
			bw.write(String.valueOf(m));
			bw.write("/");
			bw.write(String.valueOf(groupCnt-(m-1)));
		}else { // Ȧ����° �׷��� ���
			bw.write(String.valueOf(groupCnt-(m-1)));
			bw.write("/");
			bw.write(String.valueOf(m));
		}
		
		bw.flush();
	}
	
	public static int reFunc(int n) { 
		groupCnt++;
		result += n;
		
		if(result >= x) {
			return n;
		}
		return reFunc(n+1)+n;
	}
}
