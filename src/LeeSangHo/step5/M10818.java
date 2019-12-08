package LeeSangHo.step5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class M10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
		try 
		{
			String n = bf.readLine();
			
			String[] a = bf.readLine().split(" ");
			
			int min = Integer.parseInt(a[0]);
			int max = Integer.parseInt(a[0]);
			
			for (int i = 0; i < a.length; i++) 
			{
				if (min > Integer.parseInt(a[i])) 
				{
					min = Integer.parseInt(a[i]);
				}
				
				if (max < Integer.parseInt(a[i])) 
				{
					max = Integer.parseInt(a[i]);
				}
			}
			
			System.out.println(min+ " "+ max);
			 		 
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	
	
	}

}
