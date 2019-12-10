package KimJiHo.step7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class M2908 {
	/*
	 * ���� 
	 * ������� ���� ����� ������ ���� ���Ѵ�. ����� ���ڸ� �дµ� ������ �ִ�. �̷��� ������ ���ϴ� ����� ���ؼ� ����̴� ����
	 * ũ�⸦ ���ϴ� ������ ���־���. ����̴� �� �ڸ� �� �� ���� ĥ�ǿ� ���־���. �� ������ ũ�Ⱑ ū ���� ���غ���� �ߴ�.
	 * 
	 * ����� ���� �ٸ� ����� �ٸ��� �Ųٷ� �д´�. ���� ���, 734�� 893�� ĥ�ǿ� �����ٸ�, ����� �� ���� 437�� 398�� �д´�.
	 * ����, ����� �� ���� ū ���� 437�� ū ����� ���� ���̴�.
	 * 
	 * �� ���� �־����� ��, ����� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� 
	 * ù° �ٿ� ����̰� ĥ�ǿ� ���� �� �� A�� B�� �־�����. �� ���� ���� ���� �� �ڸ� ���̸�, 0�� ���ԵǾ� ���� �ʴ�.
	 * 
	 * 734 893
	 * 
	 * ��� 
	 * ù° �ٿ� ����� ����� ����Ѵ�.
	 * 
	 * 437
	 * 
	 * �޸� : 14248kb
	 * �ð� : 112 ms
	 */
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int numA = sc.nextInt();
		int numB =  sc.nextInt();
				
		System.out.println(compareNum(changeNum(numA), changeNum(numB)));
		
	}
	
	public static int changeNum(int num) {//����ȯ�ؼ� ��ȯ
		int result = 0;
		
		result = (num%10) * 100 //1���ڸ� *100
				+(num%100/10) * 10 // 10���ڸ� * 10
				+(num/100); //100���ڸ�
				
		
		return result;
	}
	
	public static int compareNum (int a, int b) {//ū �� ��ȯ
	
		return a>b?a:b;
		
	}

}
