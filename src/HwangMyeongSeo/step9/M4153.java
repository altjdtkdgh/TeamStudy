package HwangMyeongSeo.step9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class M4153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		
		while(true)
		{
			ArrayList<Integer> arr2 = new ArrayList<Integer>();
			int[] a = new int[3];
			a[0] = sc.nextInt();
			a[1] = sc.nextInt();
			a[2] = sc.nextInt();
			Arrays.sort(a);
			arr2.add(a[0]);
			arr2.add(a[1]);
			arr2.add(a[2]);
			if(arr2.get(0)==0&&arr2.get(1)==0&&arr2.get(2)==0) break;
			arr.add(arr2);
		}
		
		for(int i = 0;i<arr.size();i++)
		{
			ArrayList<Integer> arr3 = new ArrayList<Integer>();
			arr3 = arr.get(i);
			int a = arr3.get(0)*arr3.get(0);
			int b = arr3.get(1)*arr3.get(1);
			int c = arr3.get(2)*arr3.get(2);
			if((a+b)==c) System.out.println("right");
			else System.out.println("wrong");
		}

	}

}
