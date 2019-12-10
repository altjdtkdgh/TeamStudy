package HwangMyeongSeo.step7;

import java.util.Scanner;

public class M2908 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringBuffer bnum1 = new StringBuffer();
		StringBuffer bnum2 = new StringBuffer();
		
		bnum1.append(sc.next());
		bnum2.append(sc.next());
		
		if(Integer.parseInt(bnum1.reverse().toString())>Integer.parseInt(bnum2.reverse().toString()))
		{
			System.out.println(bnum1);
		}
		else
		{
			System.out.println(bnum2);
		}
		
		
	}

}
