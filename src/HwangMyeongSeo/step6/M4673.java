package HwangMyeongSeo.step6;

import java.util.ArrayList;
import java.util.HashSet;

public class M4673 {

	public static void main(String[] args) {
		
		ArrayList<Integer> Snum = new ArrayList<>();
		int cnt = 10000;
		for(int i = 1 ; i<=cnt;i++)
		{
			String n = String.valueOf(i);
	
			int val = Integer.parseInt(n);
			char[] vals = n.toCharArray();
			for(int j = 0 ; j<vals.length;j++)
			{
				val += Integer.parseInt(String.valueOf(vals[j]));
			}
			if(val < cnt)
			{
				Snum.add(val);
			}
			
		}
		HashSet<Integer> arr2 = new HashSet<Integer>(Snum);
		Snum = new ArrayList<Integer>(arr2);
		int j = 0;
		for(int i = 1 ; i<=cnt;i++)
		{
			
			if( i == Snum.get(j)) 
			{
				j++;
			}
			else
			{
				System.out.println(i);
			}
			if(j > Snum.size()-1) {
				break;
			}
		}
		
	

	}

}
