package KimJiHo.step5;

import java.util.Arrays;
import java.util.Scanner;

public class M10818 {

	/*N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.*/
	/*�Է�
	ù° �ٿ� ������ ���� N (1 �� N �� 1,000,000)�� �־�����.
	��° �ٿ��� N���� ������ �������� �����ؼ� �־�����. 
	��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.

	���
	ù° �ٿ� �־��� ���� N���� �ּڰ��� �ִ��� �������� ������ ����Ѵ�.*/
	
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
