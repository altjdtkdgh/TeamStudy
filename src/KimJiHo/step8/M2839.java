package KimJiHo.step8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class M2839 {
//	문제
//	상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다. 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
//
//	상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
//
//	상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
//
//	입력
//	첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)
//
//	출력
//	상근이가 배달하는 봉지의 최소 개수를 출력한다. 만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.
/*
 * 메모리 : 12916kb
 * 시간 : 80ms
 * 
 * */
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		//일단 5키로를 최대로 셋팅하고, 
		//남은게 0 혹은 3의배수가 될 때까지 5키로짜리 설탕을 1개씩 뺌
		
		int fiveKg, threeKg = 0;
		fiveKg = n/5;
		
		while(fiveKg >= 0) {
			if((n-fiveKg*5)%3 == 0) {
				threeKg = (n-fiveKg*5)/3;
				break;
			}
			fiveKg--;
		}
		
		if(fiveKg*5 + threeKg*3 == n) {
			System.out.println(fiveKg+threeKg);
		}else System.out.println(-1);
		
	}
}
