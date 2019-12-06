package KimJiHo.step5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class M2562 {
	/*
	 * ���� 9���� ���� �ٸ� �ڿ����� �־��� ��, �̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * ���� ���, ���� �ٸ� 9���� �ڿ���
	 * 3, 29, 38, 12, 57, 74, 40, 85, 61
	 * �� �־�����, �̵� �� �ִ��� 85�̰�, �� ���� 8��° ���̴�.
	 * 
	 * �Է� 
	 * ù ° �ٺ��� ��ȩ ��° �ٱ��� �� �ٿ� �ϳ��� �ڿ����� �־�����. �־����� �ڿ����� 100 ���� �۴�.
	 * 
	 * ��� 
	 * ù° �ٿ� �ִ��� ����ϰ�, ��° �ٿ� �ִ��� �� ��° �������� ����Ѵ�.
	 */
	
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] num = new int[9];
		
		for(int i = 0 ; i < 9 ; i ++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		
		int maxVal = num[0];
		int maxIdx = 1;
		for(int i = 1 ; i < 9 ; i ++) {
			if(num[i] > maxVal) {
				maxVal = num[i];
				maxIdx = i+1;
			}
		}
		
		bw.write(String.valueOf(maxVal) + "\n");
		bw.write(String.valueOf(maxIdx));
		
		bw.flush();
		
	}

}
