package LeeSangHo.step9;

import java.util.Scanner;
/*
 * 
����
�� ���� �־����� ��, �࿡ ������ ���簢���� ����� ���ؼ� �ʿ��� �� ��° ���� ã�� ���α׷��� �ۼ��Ͻÿ�.

�Է�
�� ���� ��ǥ�� �� �ٿ� �ϳ��� �־�����. ��ǥ�� 1���� ũ�ų� ����, 1000���� �۰ų� ���� �����̴�.

���
���簢���� �� ��° ���� ��ǥ�� ����Ѵ�.

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
