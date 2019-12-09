package ChoiTaeWon.step6;

/**
 * 
 * 메모리 : 386840 KB
 * 시간    : 20 ms
 */
public class M15596 {
	long sum(int[] a) {
		long answer = 0;
		
		for(int i=0;i<a.length;i++) {
			answer += a[i];
		}
		
		return answer;
	}
}
