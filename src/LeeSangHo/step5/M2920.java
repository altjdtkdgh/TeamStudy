package LeeSangHo.step5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class M2920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		try 
		{
			String result ="";
			String[] n = bf.readLine().split(" ");
			
			for (int i = 0; i < n.length-1; i++) 
			{
				int a = Integer.parseInt(n[i]);
				if (a == Integer.parseInt(n[i+1])-1) 
				{
					result ="ascending";
				}
				else if(a == Integer.parseInt(n[i+1])+1) 
				{
					result ="descending";
				}
				else
				{
					result ="mixed";
					break;
				}
			}
			
			System.out.println(result);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
