package KimJiHo.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M11729 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		/*
		 * 1 -> 1
		 * 
		 * 1 3
		 * =========
		 * 2 -> 3
		 * 
		 * 1 2
		 * 1 3
		 * 2 3
		 * =========
		 * 3 -> 7
		 * 
		 * 1 3
		 * 1 2
		 * 3 2
		 * 1 3
		 * 2 1  
		 * 2 3
		 * 1 3
		 * =========
		 * ¿Å±â´Â È½¼ö : a[n] = a[n-1] + 2^(n-1)
		 * 
		 *
		 * */		
		int k = movCnt(n);
		System.out.println(k);
		
		if(n <= 20){
			process(n, '1', '2', '3');
		}
		
	}
	
	static void process(int N, char c1, char c2, char c3){
		if(N==1){
			System.out.println(c1+" "+c3);
		}else{
			process(N-1, c1, c3, c2);
			System.out.println(c1+" "+c3);
			process(N-1, c2, c1, c3);	
		}	
	}
	
	public static int movCnt(int n) {
		if(n ==1) {
			return 1;
		}
		
		return (int) (movCnt(n-1) + Math.pow(2, (n-1)));
	}
	
}
