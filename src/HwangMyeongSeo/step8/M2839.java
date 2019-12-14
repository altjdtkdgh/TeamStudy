package HwangMyeongSeo.step8;

import java.util.Scanner;

public class M2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N =  sc.nextInt();
		
		for(int i = N/5;i>=0;i-- )
		{
			if((N-(5*i))%3 == 0)
			{
				System.out.println(i+((N-(5*i))/3));
				return;
			}
		}
		System.out.println(-1);

	}

}
