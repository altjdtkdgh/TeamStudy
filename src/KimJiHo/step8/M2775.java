package KimJiHo.step8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class M2775 {
	/*
	 * 문제 
	 * 평소 반상회에 참석하는 것을 좋아하는 주희는 이번 기회에 부녀회장이 되고 싶어 각 층의 사람들을 불러 모아 반상회를 주최하려고 한다.
	 * 
	 * 이 아파트에 거주를 하려면 조건이 있는데, “a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을
	 * 데려와 살아야 한다” 는 계약 조항을 꼭 지키고 들어와야 한다.
	 * 
	 * 아파트에 비어있는 집은 없고 모든 거주민들이 이 계약 조건을 지키고 왔다고 가정했을 때, 주어지는 양의 정수 k와 n에 대해 k층에
	 * n호에는 몇 명이 살고 있는지 출력하라. 단, 아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다.
	 * 
	 * 입력 
	 * 첫 번째 줄에 Test case의 수 T가 주어진다. 그리고 각각의 케이스마다 입력으로 첫 번째 줄에 정수 k, 두 번째 줄에 정수
	 * n이 주어진다. (1 <= k <= 14, 1 <= n <= 14)
	 * 
	 * 출력 
	 * 각각의 Test case에 대해서 해당 집에 거주민 수를 출력하라.
	 * 
	 * 메모리: 12868kb
	 * 시간: 224ms
	 */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t ; i ++) {
			int k = Integer.parseInt(br.readLine());//층
			int n = Integer.parseInt(br.readLine());//호
			
			int result = reFunc(k,n);
			
			bw.write(String.valueOf(result)+ "\n");
			
		}
		bw.flush();
		
		/* 개헷갈리네...
		 * 1   5   15  35  70  126 210 330 495
		 * 1   4   10  20  35  56  84  120 165
		 * 1   3   6   10  15  21  28  36  45
		 * 1   2   3   4   5   6   7   8   9 
		 * */
	}
	
	
	public static int reFunc(int k, int n) {//재귀함수..
		/* k층의 n호는 = > (k층 n-1호) + (k-1층 n호) 
		 * 위 값을 반환하면서 계속 재귀호출 하면 됨..
		 * 그런데 호수(n)가 1이면 무조건 n명(1명)이고, 층수가 0이면 또 무조건 n명임..
		 * 따라서.. k가 0이거나 n이 1이면 n을 리턴하면서 재귀를 종료시키면 됨.
		 * 
		 * 
		 * */
		
		if(k==0 || n == 1) {
			return n;
		}else {
			return reFunc(k, n-1) + reFunc(k-1, n);
		}
		
		
	}
}
