package KimJiHo.step9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class M4153 {

//	문제
//	과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다. 
//	주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.
//
//	입력
//	입력은 여러개의 테스트케이스로 주어지며 마지막줄에는 0 0 0이 입력된다. 
//	각 테스트케이스는 모두 30,000보다 작은 양의 정수로 주어지며, 각 입력은 변의 길이를 의미한다.
//
//	출력
//	각 입력에 대해 직각 삼각형이 맞다면 "right", 아니라면 "wrong"을 출력한다.
	/*
	 * 메모리 : 12888kb
	 * 시간 : 76ms
	 * 
	 * */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String num = br.readLine();
			
			if(num.equals("0 0 0")) break;
			
			int[] line = new int[3];
			
			line[0] = Integer.parseInt(num.split(" ")[0]);
			line[1] = Integer.parseInt(num.split(" ")[1]);
			line[2] = Integer.parseInt(num.split(" ")[2]);
			
			Arrays.sort(line);
			
			if(line[0]*line[0] + line[1]*line[1] == line[2]*line[2]) {
				//a^2 + b^2 = c^2이면
				bw.write("right\n");
			}else {
				bw.write("wrong\n");
			}
		}
		
		bw.flush();
	}
	
}
