package ChoiTaeWon.step5;

import java.io.IOException;
import java.util.Scanner;

/**
 * 문제 : 다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다. 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다. c는 1로, d는 2로, ..., C를 8로 바꾼다.
 *      1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.
 *      연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 8개 숫자가 주어진다. 이 숫자는 문제 설명에서 설명한 음이며, 1부터 8까지 숫자가 한 번씩 등장한다.
 * input 1 2 3 4 5 6 7 8
 * 
 * output ascending
 * 
 * @desc 이거 왜 틀린거지?
 *
 */
public class M2920 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		int nums[] = new int[8];
		String answer = "";
		
		for(int i=0;i<nums.length;i++) {
			nums[i] = sc.nextInt();
		}
		
		for(int i=0;i<nums.length;i++) {
			if(i+1 == nums[i]) {
				answer = "ascending";
			}else if(8-i == nums[i]) {
				answer = "descending";
			}else {
				answer = "mixed";
				break;
			}
		}
		
		System.out.println(answer);
	}

}
