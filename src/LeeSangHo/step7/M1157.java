package LeeSangHo.step7;

import java.util.Scanner;
/*
 * 
����
 ���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. ��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.

�Է�
 ù° �ٿ� ���ĺ� ��ҹ��ڷ� �̷���� �ܾ �־�����. �־����� �ܾ��� ���̴� 1,000,000�� ���� �ʴ´�.

���
 ù° �ٿ� �� �ܾ�� ���� ���� ���� ���ĺ��� �빮�ڷ� ����Ѵ�. ��, ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� ?�� ����Ѵ�

�ӵ�: 388ms
 */
public class M1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		
		a = a.toUpperCase();
		
		int[] b = new int[26];
		int max =0;
		String c = "";
		
		for (int i = 0; i < a.length(); i++) 
		{
			b[a.charAt(i) - 65]++;
			
			if (max < b[a.charAt(i)-65]) 
			{
				c = String.valueOf(a.charAt(i));
				max = b[a.charAt(i) - 65];
			}
			else if(max == b[a.charAt(i) -65])
			{
				c = "?";
			}
		}
		System.out.println(c);
	}

}
