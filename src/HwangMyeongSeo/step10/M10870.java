package HwangMyeongSeo.step10;

import java.util.Scanner;

public class M10870 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Test
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(fibonachi(N));

	}
	
	public static int fibonachi(int n)
	{	
		if(n == 1) return 1;
		if(n == 0) return 0;
		return fibonachi(n-1)+fibonachi(n-2);
	}

}
