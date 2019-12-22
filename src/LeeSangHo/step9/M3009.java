package LeeSangHo.step9;

import java.util.Scanner;
/*
 * 
문제
세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.

입력
세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.

출력
직사각형의 네 번째 점의 좌표를 출력한다.

100ms
 */
public class M3009 {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String a="";
		String b="";
		
		String[] xx = new String[3];
		String[] yy = new String[3];
		
		String[] ab =new String[2];
		for (int i = 0; i < 3; i++) 
		{
			String x = sc.next();
			String y = sc.next();
			
			xx[i] =x;
			yy[i] =y;
			
			if (!a.contains(x)) {
				a = a+ x;
			}
			else {
				ab[0] = x;
			}
			if (!b.contains(y)) {
				b = b+ y;
			}
			else {
				ab[1] = y;
			}
		}
		
		for (int i = 0; i < xx.length; i++) {
			if (!xx[i].equals(ab[0])) {
				System.out.print(xx[i]);
			}
		}
		for (int i = 0; i < yy.length; i++) {
			if (!yy[i].equals(ab[1])) {
				System.out.print(" "+ yy[i]);
			}
		}
	}

}
