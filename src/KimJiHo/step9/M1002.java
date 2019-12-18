package KimJiHo.step9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class M1002 {
//	����
//	�̼����� �������� ���ȯ���� ����� ����(�����)�� ��ġ�� ����϶�� ����� ���ȴ�. �������� ���ȯ�� ���� �ڽ��� �ͷ� ��ġ���� ���� �������� �Ÿ��� ����ߴ�.
//
//	�������� ��ǥ (x1, y1)�� ���ȯ�� ��ǥ (x2, y2)�� �־�����, �������� ����� �������� �Ÿ� r1�� ���ȯ�� ����� �������� �Ÿ� r2�� �־����� ��, ������� ���� �� �ִ� ��ǥ�� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//	�Է�
//	ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. �� �׽�Ʈ ���̽��� ������ ���� �̷���� �ִ�.
//
//	�� �ٿ� x1, y1, r1, x2, y2, r2�� �־�����. x1, y1, x2, y2�� -10,000���� ũ�ų� ����, 10,000���� �۰ų� ���� �����̰�, r1, r2�� 10,000���� �۰ų� ���� �ڿ����̴�.
//
//	���
//	�� �׽�Ʈ ���̽����� ������� ���� �� �ִ� ��ġ�� ���� ����Ѵ�. ���� ������� ���� �� �ִ� ��ġ�� ������ ���Ѵ��� ��쿡�� -1�� ����Ѵ�.
/*
 * �޸� :
 * �ð� : 
 * 
 * 
 * @@@@@@@@@@@Ʋ�ȴٰ� �����µ� �ݷʸ� ��ã���� �� Ʋ�ȴ���..?@@@@@@@@@@@@@@@@@@@@@2
 * */
	public static void main(String[] args) throws Exception {
		
		/*������/���ȯ�� ��ǥ�� ���� ����
		 * ������/���ȯ�� ������� �Ÿ��� ������ ���� ������
		 * ���ȯ�� ���� �� �ִ� ��ġ => �� ���� ����
		 * 
		 * �� ���� ��ġ�ϸ�(�� ���� ��ġ�� ������) ����� ���Ѵ�.. = -1
		 * 
		 * 
		 * �����̶� ��ȯ�̰� ��ǥ�� ���� ������,(������-1)
		 * �����̶� ��ȯ�� ������ �Ÿ��� ����<->��� + ��ȯ<->��� ���� ������ ����2��
		 * ������ 1��
		 * ũ�� 0��
		 * 
		 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i =0 ;i< t;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			double distance = maesureDistance(x1, y1, x2, y2);
			
			/*
			 * System.out.println("distance = " + distance); System.out.println("������ ���Ѱ�= "
			 * + (r1+r2));
			 */
			
			if(x1==x2 && y1==y2) {//�����̶� ��ȯ�̰� �����ִµ�
				if(r1 == r2) {//�������� ������
					System.out.println("-1");
				}else {//������ ���� �������� �ٸ��� ���� 0
					System.out.println("0");
				}
			}else if(distance == (r1+r2)) { // ����1��
				System.out.println("1");
			}else if(distance < (r1+r2)) {//2��
				System.out.println("2");
			}else {
				System.out.println("0");
			}
		}
	}
	
	static double maesureDistance(int x1, int y1, int x2, int y2) {
//		 �� �� ������ �Ÿ� = ��Ʈ (x1-x2)�� + (y1-y2)��
		double distance= 0;
		
		distance = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		
		return distance;
	}
}
