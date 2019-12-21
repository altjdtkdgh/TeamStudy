package HwangMyeongSeo.step9;

import java.util.Scanner;

public class M3009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] p1 = new  int[2];
		int [] p2 = new  int[2];
		int [] p3 = new  int[2];
		int [] p4 = new  int[2];
		
		p1[0] = sc.nextInt();
		p1[1] = sc.nextInt();
		p2[0] = sc.nextInt();
		p2[1] = sc.nextInt();
		p3[0] = sc.nextInt();
		p3[1] = sc.nextInt();
		
		if(p1[0] ==p2[0]) p4[0] = p3[0];
		else if(p1[0] ==p3[0]) p4[0] = p2[0];
		else p4[0] = p1[0];

		if(p1[1] ==p2[1]) p4[1] = p3[1];
		else if(p1[1] ==p3[1]) p4[1] = p2[1];
		else p4[1] = p1[1];
		
		System.out.println(p4[0] + " " + p4[1]);

	}

}
