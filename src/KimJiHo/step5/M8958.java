package KimJiHo.step5;

import java.io.*;

public class M8958 {
	/*
	 * ���� "OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. ������ ���� ��� ��
	 * ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. ���� ���, 10�� ������ ������ 3�� �ȴ�.
	 * 
	 * "OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
	 * 
	 * OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� 
	 * ù° �ٿ� �׽�Ʈ ���̽��� ������ �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ���̰� 0���� ũ�� 80���� ���� ���ڿ���
	 * �־�����. ���ڿ��� O�� X������ �̷���� �ִ�.
	 * 
	 * ��� 
	 * �� �׽�Ʈ ���̽����� ������ ����Ѵ�.
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());//���̽�����
		
		for(int i = 0 ; i < N ; i++ ) {
			int score = 0; //����
			int contNum = 0; //���ӵ� ���� ����
			String ox = br.readLine();//�� ������ ox ���
			
			for(int j = 0 ; j < ox.length() ; j++) {
				if(String.valueOf(ox.charAt(j)).equals("O")) {
					contNum++;
					score += contNum;
				}else contNum = 0;		
			}
			bw.write(String.valueOf(score+"\n"));
		}
		bw.flush();
		
	}
}
