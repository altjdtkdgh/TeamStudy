package ChoiTaeWon.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 
 * 시간초과라니;;;ㅠ
 *
 */
public class M2869 {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    int A = Integer.parseInt(st.nextToken()); // 낮 업
	    int B = Integer.parseInt(st.nextToken()); // 밤 다운
	    int V = Integer.parseInt(st.nextToken()); // 막대 높이
	    
		int hight = 0;
		int day = 0; // 올라가는 일수
		
		while(true) {
			day ++;
			hight += A;
			if(hight >= V) break;
			hight -= B;
		}
		System.out.println(day);
	}

}
