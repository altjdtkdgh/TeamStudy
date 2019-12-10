package HwangMyeongSeo.step7;

import java.util.Arrays;
import java.util.Scanner;

public class M1157 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
	
		input = input.toUpperCase();
		int[] cnt = new int[26];
		String output = null;
		int max = 0;
		int j =0;
		for(char c = 'A' ; c <= 'Z';c++) {
			
			cnt[j] = 0;
			for(int i = 0;i<input.length();i++)
			{
				if(input.indexOf(c)== -1) break;
				if(input.charAt(i) == c) cnt[j]++;
			}
			
			if(j>0) {
				if(max < cnt[j]) {
					output = String.valueOf(c);
					max = cnt[j];
				}
			}
			else {
				output = String.valueOf(c);
				max = cnt[j];
			}
			j++;
			
		}
		Arrays.sort(cnt);
		if(cnt[cnt.length-1] == cnt[cnt.length-2])
		{
			output = "?";
		}
		System.out.println(output);

	}

}
