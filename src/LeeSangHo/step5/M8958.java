package LeeSangHo.step5;

import java.util.Scanner;

public class M8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] a = new String[n];
		for (int i = 0; i < n; i++) 
		{
			a[i] = sc.next();
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			int count = 0;
			int sum = 0;
			for (int j = 0; j < a[i].length(); j++) 
			{
				if(a[i].charAt(j) == 'O') 
				{
					++count;
					sum += count;
				}
				else 
				{
					count = 0;
				}
			}
			System.out.println(sum);
		}
	}

}
