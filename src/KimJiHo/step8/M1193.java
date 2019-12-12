package KimJiHo.step8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class M1193 {

//	문제
//	무한히 큰 배열에 다음과 같이 분수들이 적혀있다.
//
//	1/1	1/2	1/3	1/4	1/5	…
//	2/1	2/2	2/3	2/4	…	…
//	3/1	3/2	3/3	…	…	…
//	4/1	4/2	…	…	…	…
//	5/1	…	…	…	…	…
//	…	…	…	…	…	…
//	이와 같이 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
//
//	X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
//
//	입력
//	첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.
//
//	출력
//	첫째 줄에 분수를 출력한다.
	
	/*
	 * 메모리 : 13300kb
	 * 시간 : 76ms
	 * 
	 * */
	static int x, groupCnt, result = 0; 
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		/*그룹화해서 생각하면 될듯..
		 * 
		 * 1번째그룹 = 1/1
		 * 2번째그룹 = 1/2, 2/1
		 * 3번째그룹 = 3/1, 2/2, 1/3
		 * 4번째그훕 = 1/4, 2/3, 3/2, 4/1
		 * 5번째그룹 = 5/1, 4/2, 3/3, 2/4, 1/5
		 * 
		 * n번째그룹의 분수갯수는 n개이며, n번째그룹의 m번째 분수는
		 *  n이 짝수인 경우 m/n-(m-1) 
		 *  n이 홀수인 경우 n-(m-1)/m이다!
		 * 
		 * 그렇다면 입력된 X가 몇 번째 그룹에 속하는지 , 그 그룹에서 몇 번째 분수인지 알아내면 되는데..
		 * 
		 * */
		x = Integer.parseInt(br.readLine()); 
		
		reFunc(1); // 실행하고나면 static groupCnt변수로 몇 번재 그룹인지 알 수 있음
		//System.out.println(groupCnt);
		
		//몇 번째 그룹인지 알아냈으니, 이제 해당 그룹에서 몇 번째 분수인지 알아내야함
		//result변수는 해당 그룹의 맨 마지막번째 누적수..
		//그럼 직전그룹의 마지막번째 누적 수 = (result - groupCnt)
		//System.out.println("======> "+result);
		//System.out.println("직전그룹누적수 => "+(result - groupCnt));
		//그럼 X가 본인 그룹의 몇 번째 분수인지 알려면 (X-직전그룹누적수) 를 구하면 됨
		
		int m = x - (result-groupCnt); //해당 그룹의 m번째 분수..
		
		if(groupCnt % 2 == 0) {//짝수번째 그룹인 경우 
			bw.write(String.valueOf(m));
			bw.write("/");
			bw.write(String.valueOf(groupCnt-(m-1)));
		}else { // 홀수번째 그룹인 경우
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
