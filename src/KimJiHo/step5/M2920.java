package KimJiHo.step5;

import java.io.*;

public class M2920 {
	/*
	 * ���� �������� c d e f g a b C, �� 8�� ������ �̷�����ִ�. �� �������� 8�� ���� ������ ���� ���ڷ� �ٲپ� ǥ���Ѵ�.
	 * c�� 1��, d�� 2��, ..., C�� 8�� �ٲ۴�.
	 * 
	 * 1���� 8���� ���ʴ�� �����Ѵٸ� ascending, 8���� 1���� ���ʴ�� �����Ѵٸ� descending, �� �� �ƴ϶�� mixed
	 * �̴�.
	 * 
	 * ������ ������ �־����� ��, �̰��� ascending����, descending����, �ƴϸ� mixed���� �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� ù° �ٿ� 8�� ���ڰ� �־�����. �� ���ڴ� ���� ������ ������ ���̸�, 1���� 8���� ���ڰ� �� ���� �����Ѵ�.
	 * 
	 * ��� ù° �ٿ� ascending, descending, mixed �� �ϳ��� ����Ѵ�.
	 */
	
	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] scale = new String[8];
		
		scale = br.readLine().split(" ");

		for(int i = 0 ; i < 7 ; i++) {
			if(Math.abs((Integer.parseInt(scale[i+1]) - Integer.parseInt(scale[i]))) == 1 ) {//1�������̸�
				if(i==6) {//�������ε�����
					if(Integer.parseInt(scale[0]) == 1) bw.write("ascending"); //ù���� 1�̸� ��������
					else bw.write("descending"); //�ƴϸ� ��������
				}
			}else { //1�������� �ƴϸ� mixed��� ��
				bw.write("mixed");
				break;
			}
		}
		
		bw.flush();
		
	}
}
