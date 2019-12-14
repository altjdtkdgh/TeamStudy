package KimJiHo.step8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class M2869 {
	/*
	 * ���� 
	 * �� ���� �����̰� �ִ�. �� �����̴� ���̰� V������ ���� ���븦 �ö� ���̴�.
	 * 
	 * �����̴� ���� A���� �ö� �� �ִ�. ������, �㿡 ���� �ڴ� ���� B���� �̲�������. ��, ���� �ö� �Ŀ��� �̲������� �ʴ´�.
	 * 
	 * �����̰� ���� ���븦 ��� �ö󰡷���, ��ĥ�� �ɸ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� 
	 * ù° �ٿ� �� ���� A, B, V�� �������� ���еǾ �־�����. (1 �� B < A �� V �� 1,000,000,000)
	 * 
	 * ��� 
	 * ù° �ٿ� �����̰� ���� ���븦 ��� �ö󰡴µ� ��ĥ�� �ɸ����� ����Ѵ�.
	 *
	 * �޸� : 12904kb
	 * �ð� : 72ms
	 * 
	 */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		//ù�� a����
		//��°�� 2*a - b
		//��°�� 3*a - 2*b
		//........����.........
		//day*a-(day - 1)*b
		// day(a-b)+b >= v
		// day(a-b) >= v-b
		// day >= (v-b)/(a-b)
		
		int days = (v-b) / (a-b);
		
		if( (v-b) % (a-b) != 0) {
			days +=1;
		}
		
		//int days =(int) Math.ceil((v-b) / (double)(a-b));
		
		System.out.println(days);
		
	}
}
