package KimJiHo.step5;

import java.io.*;
import java.util.*;

public class M3052 {
	/*
	 * ���� �� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. ���� ���, 7, 14, 27, 38�� 3���� ���� ��������
	 * 1, 2, 0, 2�̴�.
	 * 
	 * �� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�. �� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է�
	 * ù° �ٺ��� ����° �� ���� ���ڰ� �� �ٿ� �ϳ��� �־�����. �� ���ڴ� 1,000���� �۰ų� ����, ���� �ƴ� �����̴�.
	 * 
	 * ��� 
	 * ù° �ٿ�, 42�� �������� ��, ���� �ٸ� �������� �� �� �ִ��� ����Ѵ�.
	 */
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] num = new int[10];
		int cnt = 1;
		
		for(int i = 0 ; i < 10 ; i++) {
			num[i] = Integer.parseInt(br.readLine()) % 42;
		}
		
		Arrays.sort(num); 
		
		for(int i = 1 ; i < 10 ; i++) {
			if(num[i] != num[i-1]) cnt++; //���õ� �迭�� �������� ���Ͽ� �ٸ���� ������++

		}
		bw.write(String.valueOf(cnt));
		bw.flush();
	}
}
