package HwangMyeongSeo.step5;

import java.util.ArrayList;
import java.util.Scanner;

public class M8958 {

	public static void main(String[] args) {
		/*
			 "OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. 
			 
			 ������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. ���� ���, 10�� ������ ������ 3�� �ȴ�.
			
			"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
			
			OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
			
			ù° �ٿ� �׽�Ʈ ���̽��� ������ �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ���̰� 0���� ũ�� 80���� ���� ���ڿ��� �־�����. ���ڿ��� O�� X������ �̷���� �ִ�
			�� �׽�Ʈ ���̽����� ������ ����Ѵ�.

		 */
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		ArrayList<String> quiz_resluts = new ArrayList<String>();
		for(int i = 0 ; i < testcase; i++) 
		{
			quiz_resluts.add(sc.next());
		}
		
		for(int i = 0 ; i< quiz_resluts.size();i++)
		{
			char[] value = quiz_resluts.get(i).toCharArray();
			int point = 0;
			int pSum = 0;
			
			for(int j=0;j < value.length;j++)
			{
				if(value[j] == 'O')point++;
				else point = 0;
				pSum += point;
			}
			System.out.println(pSum);
		}
				
	}

}
