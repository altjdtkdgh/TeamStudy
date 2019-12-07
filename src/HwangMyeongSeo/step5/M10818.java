package HwangMyeongSeo.step5;

import java.util.Arrays;
import java.util.Scanner;

public class M10818 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] values = new int[cnt];
		
		for(int i = 0;i< values.length;i++)
		{
			int value = sc.nextInt();
			values[i] = value;
		}

		Arrays.sort(values);
		
		System.out.print(values[0] +" "+ values[cnt-1]);

	}

}
