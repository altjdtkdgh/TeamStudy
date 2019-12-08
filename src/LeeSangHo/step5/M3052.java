package LeeSangHo.step5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] n = new int[10];
		int[] b = new int[10];
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) 
		{
			n[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n.length; i++) 
		{
			b[i] = n[i]%42;
		}
		
		for (int i = 0; i < b.length; i++)
		{
			if (!list.contains(b[i])) {
				list.add(b[i]);
			}
		}
		
		System.out.println(list.size());
	}

}
