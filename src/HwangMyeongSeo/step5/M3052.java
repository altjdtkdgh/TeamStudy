package HwangMyeongSeo.step5;

import java.util.Arrays;
import java.util.Scanner;

public class M3052 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int[] values = new int[10];
		int cnt = 1;
		for(int i = 0;i< values.length;i++)
		{
			int value = sc.nextInt();
			values[i] = value%42;
		}
		
		Arrays.sort(values);
		
		for(int i = 0 ; i < values.length ; i++)
		{
			int tmp = values[i];
			if(i == values.length-1) {
				break;
			}
			if(tmp < values[i+1] )
			{
				cnt++;
			}
		}
		
		System.out.println(cnt);

	}

}
