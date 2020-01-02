package HwangMyeongSeo.step10;

import java.util.Scanner;

public class M10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(factorial(N));

	}
	public static int factorial(int n)
	{
		if(n==0) return 1;
		return n * factorial(n-1);
	}

}
