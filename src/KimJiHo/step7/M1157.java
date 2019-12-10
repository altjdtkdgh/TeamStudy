package KimJiHo.step7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class M1157 {
	/*
	 * ���� ���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. ��, �빮�ڿ�
	 * �ҹ��ڸ� �������� �ʴ´�.
	 * 
	 * �Է� ù° �ٿ� ���ĺ� ��ҹ��ڷ� �̷���� �ܾ �־�����. �־����� �ܾ��� ���̴� 1,000,000�� ���� �ʴ´�.
	 * 
	 * ��� ù° �ٿ� �� �ܾ�� ���� ���� ���� ���ĺ��� �빮�ڷ� ����Ѵ�. ��, ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� ?��
	 * ����Ѵ�.
	 * 
	 * �޸� : 26008 kb
	 * �ð� : 236 ms
	 */
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String sWord = br.readLine().toUpperCase();//��ҹ��� ����X
		int[] num = new int[91];
			
		for(int i = 0 ; i < sWord.length(); i++) {
			num[(int)sWord.charAt(i)]++; //�����ĺ��� �ε������� �� ����
			
		}
		
		int maxNum = 0;
		int maxIdx = 0;
		int secondMaxIdx = 0;
		
		for(int ch = 65 ; ch<=90 ; ch++) {
			if(num[ch] >= maxNum) {
				if(num[ch] == maxNum) {
					secondMaxIdx = ch;
					
				}else {
					maxNum = num[ch];
					
					maxIdx = ch;
				}
				
			}
			
		}//for end
		
		if(num[maxIdx] != num[secondMaxIdx]) {
			bw.write(String.valueOf((char)(maxIdx)));
		}else {
			bw.write("?");
		}
		
		bw.flush();
		
		
	}
}
