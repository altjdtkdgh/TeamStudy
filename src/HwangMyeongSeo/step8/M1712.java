package HwangMyeongSeo.step8;

import java.util.Scanner;

public class M1712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(b>=c) {
			System.out.println("-1");
			return;
		}
		
		int x = (a/(c-b))+1;
		
		System.out.println(x);

	}

}
