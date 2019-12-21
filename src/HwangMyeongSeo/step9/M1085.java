package HwangMyeongSeo.step9;

import java.util.Arrays;
import java.util.Scanner;

public class M1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int[] a = new int[4];
		a[0] = x;
		a[1] = y;
		a[2] = w-x;
		a[3] = h-y;
		
		Arrays.sort(a);
		
		System.out.println(a[0]);

	}

}
