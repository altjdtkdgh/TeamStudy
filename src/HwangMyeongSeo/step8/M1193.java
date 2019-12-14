package HwangMyeongSeo.step8;

import java.util.Scanner;

public class M1193 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int bm = 1;
		int bj = 1;
		boolean way = true;
		boolean end = true;
		
		// true 가로 false 세로
		for(int i = 1;i<num;i++)
		{
			if(bj == 1&&end)
			{
				bm++;
				end = false;
				way = false;
			}
			else if(bm == 1&&end)
			{
				bj++;
				end = false;
				way = true;
			}
			else if(way)
			{
				bj--;
				bm++;
				end=true;
			}
			else
			{
				bj++;
				bm--;
				end=true;
			}
			
		}
		System.out.println(bj+"/"+bm);
	

	}

}
