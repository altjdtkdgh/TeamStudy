package LeeSangHo.step7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * 
������� ���� ����� ������ ���� ���Ѵ�. ����� ���ڸ� �дµ� ������ �ִ�. �̷��� ������ ���ϴ� ����� ���ؼ� ����̴� ���� ũ�⸦ ���ϴ� ������ ���־���. ����̴� �� �ڸ� �� �� ���� ĥ�ǿ� ���־���. �� ������ ũ�Ⱑ ū ���� ���غ���� �ߴ�.
����� ���� �ٸ� ����� �ٸ��� �Ųٷ� �д´�. ���� ���, 734�� 893�� ĥ�ǿ� �����ٸ�, ����� �� ���� 437�� 398�� �д´�. ����, ����� �� ���� ū ���� 437�� ū ����� ���� ���̴�.
�� ���� �־����� ��, ����� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
s

�Է�
ù° �ٿ� ����̰� ĥ�ǿ� ���� �� �� A�� B�� �־�����. �� ���� ���� ���� �� �ڸ� ���̸�, 0�� ���ԵǾ� ���� �ʴ�.

�ӵ�: 80ms
 */
public class M2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		try 
		{
			String[] a = bf.readLine().split(" ");
			
			int b = Integer.parseInt(new StringBuffer(a[0]).reverse().toString());
			int c = Integer.parseInt(new StringBuffer(a[1]).reverse().toString());
			
			if (b< c) 
			{
				System.out.println(c);
			}
			else 
			{
				System.out.println(b);
			}
			

		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
