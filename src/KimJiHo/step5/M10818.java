package KimJiHo.step5;

import java.util.Arrays;
import java.util.Scanner;

public class M10818 {

	/*N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.*/
	/*입력
	첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
	둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
	모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

	출력
	첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.*/
	
	public static void main(String[] args) throws Exception {
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 * 
		 * int N = Integer.parseInt(br.readLine()); String num = br.readLine();
		 * 
		nums= num.split("\\s");
		 * // int[] nums = new int[N]; String[] nums = new String[N];
		 */
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] nums = new int[N];
		
		for(int i = 0 ; i < N ; i ++) {
			nums[i] = sc.nextInt();
		}
		
		sc.close();
		Arrays.sort(nums);
		
		System.out.println(nums[0] + " " + nums[N-1]);
		
		
	}
}
