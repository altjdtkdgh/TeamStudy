package HwangMyeongSeo.step5;

import java.util.Scanner;

public class M2920 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] um = new int[8];
		
		for(int i = 0 ; i < um.length; i++)
		{
			um[i] = sc.nextInt(); 
		}
		
		for(int i = 0 ; i < um.length/2; i++)
		{
			if(um[i]+um[(um.length-1)-i] != 9) 
			{
				System.out.println("mixed");
				return;				
				
			}
		}
		if(um[0]==1 && um[(um.length/2)-1] < um[um.length/2])
		{
			System.out.println("ascending");
		}
		else if(um[0]==8 && um[(um.length/2)-1] > um[um.length/2])
		{
			System.out.println("descending");
		}
		else
		{
			System.out.println("mixed");
		}
		

	}

}
