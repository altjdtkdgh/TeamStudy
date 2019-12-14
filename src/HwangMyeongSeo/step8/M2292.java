package HwangMyeongSeo.step8;

import java.util.Scanner;

public class M2292 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 1;
		int i = 0;
		while(true)
		{
			sum = sum + (i*6);
			if(sum >= N)
			{
				System.out.println(i+1);
				break;
			}
			else
			{
				i++;
			}
			
		}

	}

}
