package KimJiHo.step8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class M1712 {
	/*
	 * ���� 
	 * �������ڴ� ��Ʈ���� �����ϰ� �Ǹ��ϴ� ȸ���̴�. ��Ʈ�� �Ǹ� ����� ������� �ų� �Ӵ��, ��꼼, �����, �޿� �� A������ ����
	 * ����� ���, �� ���� ��Ʈ���� �����ϴ� ������ ����� �ΰǺ� �� �� B������ ���� ����� ��ٰ� �Ѵ�.
	 * 
	 * ���� ��� A=1,000, B=70�̶�� ����. �� ��� ��Ʈ���� �� �� �����ϴ� ���� �� 1,070������ ���, �� �� �����ϴ� ���� ��
	 * 1,700������ ���.
	 * 
	 * ��Ʈ�� ������ C�������� å���Ǿ��ٰ� �Ѵ�. �Ϲ������� ���� ����� �÷� ���� ���� ��� ���� �� ����(�Ǹź��)�� ��
	 * ���(=�������+�������)���� �������� �ȴ�. ���ʷ� �� ������ �� ��뺸�� ������ ������ �߻��ϴ� ������ ���ͺб���(BREAK-EVEN
	 * POINT)�̶�� �Ѵ�.
	 * 
	 * A, B, C�� �־����� ��, ���ͺб����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * �Է� 
	 * ù° �ٿ� A, B, C�� �� ĭ�� ���̿� �ΰ� ������� �־�����. A, B, C�� 21�� ������ �ڿ����̴�.
	 * 1000 70 170
	 * 
	 * ��� 
	 * ù ��° �ٿ� ���ͺб��� �� ���ʷ� ������ �߻��ϴ� �Ǹŷ��� ����Ѵ�. ���ͺб����� �������� ������ -1�� ����Ѵ�.
	 * 11
	 * 
	 * �޸�: 12952 kb
	 * �ð�: 72ms
	 */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		int c = Integer.parseInt(input[2]);
		
		int profit = 0;//���ͺб���
		
		//a + profit * b < profit * c     ----->�� ���� �����ϴ� profit�� �ּڰ��� ���ϸ� ��
		//profit * (c - b) > a
		//profit > a / (c - b)
		
		if(b >= c ) {//��������� ��Ʈ�ϰ��ݺ��� ũ�ų������� �ȼ��� ����...
			profit = -1;
		}else {
			profit = (a/(c -b)) + 1 ;
		}
		
		bw.write(String.valueOf(profit));
		bw.flush();
		
	}
}
