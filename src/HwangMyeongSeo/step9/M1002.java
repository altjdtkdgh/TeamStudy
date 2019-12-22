package HwangMyeongSeo.step9;

import java.util.Scanner;

public class M1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =0 ; i < n ; i++)
		{
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			double d= Math.sqrt(Math.pow(Math.abs(x2-x1), 2)+Math.pow(Math.abs(y2-y1), 2));
			if(x1==x2&&y1==y2&&r1==r2) System.out.println(-1);
			else if(d < r2+r1 && d > Math.abs(r2-r1)) System.out.println(2);
			else if(d == r2+r1 || d ==Math.abs(r2-r1)) System.out.println(1);
			else System.out.println(0);
		}
	}

}
