package KimJiHo.step9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class M2581 {
	/*
	 * ���� 
	 * �ڿ��� M�� N�� �־��� �� M�̻� N������ �ڿ��� �� �Ҽ��� ���� ��� ��� 
	 * �̵� �Ҽ��� �հ� �ּڰ��� ã�� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * ���� ��� M=60, N=100�� ��� 60�̻� 100������ �ڿ��� �� �Ҽ��� 
	 * 61, 67, 71, 73, 79, 83, 89, 97 ��
	 * 8���� �����Ƿ�, �̵� �Ҽ��� ���� 620�̰�, �ּڰ��� 61�� �ȴ�.
	 * 
	 * �Է� 
	 * �Է��� ù° �ٿ� M��, ��° �ٿ� N�� �־�����.
	 * M�� N�� 10,000������ �ڿ����̸�, M�� N���� �۰ų� ����.
	 * 
	 * ��� 
	 * M�̻� N������ �ڿ��� �� �Ҽ��� ���� ��� ã�� ù° �ٿ� �� ����, ��° �ٿ� �� �� �ּڰ��� ����Ѵ�.
	 * ��, M�̻� N������ �ڿ��� �� �Ҽ��� ���� ���� ù° �ٿ� -1�� ����Ѵ�.
	 * 
	 * �޸� : 13064kb
	 * �ð� : 100ms
	 * 
	 */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int sum = 0 ;
		int min = 0 ;
		
		for(int i = m ; i <= n ; i++) {
			if(isPrimeNum(i)) {
				sum+=i;
				if(min == 0) {
					min = i;
				}
			}
		}
		
		if(min==0) {
			bw.write("-1");
		}else {
			bw.write(String.valueOf(sum)+"\n");
			bw.write(String.valueOf(min));
		}
		
		bw.flush();
		
	}
	
	static boolean isPrimeNum(int num) {
		boolean flag = true;
		
		if(num==1) {
			return false;
		}
		
		for(int i = 2 ; i < num ; i++) {
			if(num % i == 0) {
				flag = false;
				break;
			}
		}
		
		return flag;
		
	}

}
