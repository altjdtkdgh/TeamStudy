package KimJiHo.step9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class M3009 {
	/*
	 * 문제 
	 * 세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
	 * 
	 * 
	 * 입력 
	 * 세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.
	 * 
	 * 출력 
	 * 직사각형의 네 번째 점의 좌표를 출력한다.
	 *
	 *메모리: 12908kb
	 *시간 : 72ms
	 * 
	 */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String a = br.readLine();
		String b = br.readLine();
		String c = br.readLine();
		
		String x = a.split(" ")[0].equals(b.split(" ")[0]) ? 
				c.split(" ")[0] : (a.split(" ")[0].equals(c.split(" ")[0]) ? b.split(" ")[0] : a.split(" ")[0]);
				
		String y = a.split(" ")[1].equals(b.split(" ")[1]) ? 
				c.split(" ")[1] : (a.split(" ")[1].equals(c.split(" ")[1]) ? b.split(" ")[1] : a.split(" ")[1]);

		bw.write(x + " " + y);
		bw.flush();
	
	}
	

}
