package KimJiHo.step6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class M1065 {
	/*
	 * 문제
	 * 어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을
	 * 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
	 * 
	 * 입력 
	 * 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
	 * 
	 * 출력 
	 * 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
	 * 
	 * 메모리 : 13344kb 
	 * 시간 : 96ms
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String N = br.readLine();
		int cnt = 0;
		
		for(int i = 1 ; i <= Integer.parseInt(N); i++) {
			if(isHanSu(i)) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	
	}
	
	public static boolean isHanSu(int num) {//한수여부 반환
		boolean flag = false;
		
		int[] su = splitNum(String.valueOf(num));
		
		if(su.length <= 2) { // 2자리 이하는 무조건 한수다
			flag = true;
		}else {
			int dif = su[1] - su[0]; //1자리,2자리 차
			
			for(int i = su.length -1 ; i >1 ; i--) {
				if(su[i]-su[i-1] != dif) {
					return false;
				}
				flag = true;
			}
		}
		
		return flag;
		
	}
	
	public static int[] splitNum(String N) {
		int[] a = new int[N.length()];//수 길이크기의 int배열 생성
		
		for(int i = 0 ; i < N.length(); i++) {
			a[i] = Integer.parseInt(N.substring(i,i+1));
		}
		
		return a; // 각 자릿수를 배열로 반환
	}
	

}
