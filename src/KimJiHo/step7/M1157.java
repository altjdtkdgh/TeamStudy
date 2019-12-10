package KimJiHo.step7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class M1157 {
	/*
	 * 문제 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와
	 * 소문자를 구분하지 않는다.
	 * 
	 * 입력 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
	 * 
	 * 출력 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를
	 * 출력한다.
	 * 
	 * 메모리 : 26008 kb
	 * 시간 : 236 ms
	 */
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String sWord = br.readLine().toUpperCase();//대소문자 구분X
		int[] num = new int[91];
			
		for(int i = 0 ; i < sWord.length(); i++) {
			num[(int)sWord.charAt(i)]++; //각알파벳의 인덱스값의 수 증가
			
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
