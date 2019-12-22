package ChoiTaeWon.step9;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * 메모리 : 24668 KB
 * 시간   : 332 ms
 */
public class M9020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		boolean[] arr = new boolean[5082];
		Arrays.fill(arr, true);
		arr[0] = arr[1] = false;
		//소수
		for(int i=2; i<=72; i++) {
			for(int j=i+i; j<=5081; j+=i) {
				arr[j] = false;
			}
		}
		//골드바흐 파티션
		for(int t=0; t<T; t++) {
			int n = sc.nextInt();
			int left = n/2, right = n/2;
			
			while(true) {
				if(arr[left] && arr[right])
					break;
				left--; right++;
			}
			System.out.println(left+" "+right);
		}
	}

}
