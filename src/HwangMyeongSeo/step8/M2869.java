package HwangMyeongSeo.step8;

import java.util.Scanner;

public class M2869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int nat = sc.nextInt();
		int bam = sc.nextInt();
		int height = sc.nextInt();
		int total = 0;
		
		int i = 0;
		while(true)
		{
			total = nat+total-bam;
			if(total >= height)
			{
				System.out.println(i);
				break;
			}
			i++;
		}

	}

}
