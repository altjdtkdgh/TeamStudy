package HwangMyeongSeo.step8;

import java.util.ArrayList;
import java.util.Scanner;

public class M10250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		for(int i =0 ; i<N;i++)
		{
			ArrayList<Integer> arr2 = new ArrayList<Integer>();
			int h= sc.nextInt();
			int w = sc.nextInt();
			int custNum = sc.nextInt();
			arr2.add(h);
			arr2.add(w);
			arr2.add(custNum);
			arr.add(arr2);

				
		}
		
		for(int i = 0 ; i<arr.size();i++)
		{
			ArrayList<Integer> arr2 = new ArrayList<Integer>();
			arr2 = arr.get(i);
			String YY = String.valueOf(arr2.get(2)%arr2.get(0));
			String XX = String.valueOf((arr2.get(2)/arr2.get(0)+1));
			if(XX.length()==1) {
				XX ="0"+XX;
			}
			System.out.println(YY+XX);
		}
		

		

	}

}
