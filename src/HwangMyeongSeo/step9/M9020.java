package HwangMyeongSeo.step9;

import java.util.Scanner;

public class M9020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 0 ; i< N ; i++)
		{
			int num = sc.nextInt();
			
			int val1 = num/2;
			int val2 = val1;
			
			while(true)
			{
				if(sosuCheck(val1)&&sosuCheck(val2))
				{
					System.out.println(val1+" " + val2);
					break;
				}
				val1--;
				val2++;
			}
		}
		
	}
	public static boolean sosuCheck(int num)
	{
		boolean checkYn = true;
		
		for(int i = 2;i<num;i++)
		{
			int cnt = 0;
			if(num%i == 0) cnt++;
			
			if(cnt > 0) return false;
		}		
		
		return checkYn;
	}

}
