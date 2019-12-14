package HwangMyeongSeo.step6;

import java.util.Scanner;

public class M1065 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		
		if(N < 100)
		{
			cnt = N ;
			System.out.println(cnt);
			return;
		}
		else if(N < 111)
		{
			cnt = 99 ;
			System.out.println(cnt);
			return;
		}
		cnt = 99;
		int i = 111;
		while(i<=N)
		{
			String strNum = String.valueOf(i);
			char[] cNum =strNum.toCharArray();
			int d1 = Integer.parseInt(String.valueOf(cNum[0]))-Integer.parseInt(String.valueOf(cNum[1]));
			int d2 = Integer.parseInt(String.valueOf(cNum[1]))-Integer.parseInt(String.valueOf(cNum[2]));
			
			if(d1==d2)
			{
				cnt++;
			}
			i++;
		}
		System.out.println(cnt);
		
	}

}
