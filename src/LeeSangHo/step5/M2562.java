package LeeSangHo.step5;

import java.util.Scanner;

public class M2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = 9;
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) 
		{
			a[i]  = sc.nextInt();
		}
		
		int b =a[0];
		int c= 0;
		
		for (int i = 0; i < a.length; i++) 
		{
			if (b < a[i]) 
			{
				b = a[i];
				 c= i;
			}
		}
		
		System.out.println(b);
		System.out.println(c+1);
	}

}
