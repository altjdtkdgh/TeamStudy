package KimJiHo.step9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class M4153 {

//	����
//	���� ����Ʈ�ε��� �� ������ ���̰� 3, 4, 5�� �ﰢ���� ���� �ﰢ���ΰ��� �˾Ƴ´�. 
//	�־��� ������ ���̷� �ﰢ���� �������� �ƴ��� �����Ͻÿ�.
//
//	�Է�
//	�Է��� �������� �׽�Ʈ���̽��� �־����� �������ٿ��� 0 0 0�� �Էµȴ�. 
//	�� �׽�Ʈ���̽��� ��� 30,000���� ���� ���� ������ �־�����, �� �Է��� ���� ���̸� �ǹ��Ѵ�.
//
//	���
//	�� �Է¿� ���� ���� �ﰢ���� �´ٸ� "right", �ƴ϶�� "wrong"�� ����Ѵ�.
	/*
	 * �޸� : 12888kb
	 * �ð� : 76ms
	 * 
	 * */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String num = br.readLine();
			
			if(num.equals("0 0 0")) break;
			
			int[] line = new int[3];
			
			line[0] = Integer.parseInt(num.split(" ")[0]);
			line[1] = Integer.parseInt(num.split(" ")[1]);
			line[2] = Integer.parseInt(num.split(" ")[2]);
			
			Arrays.sort(line);
			
			if(line[0]*line[0] + line[1]*line[1] == line[2]*line[2]) {
				//a^2 + b^2 = c^2�̸�
				bw.write("right\n");
			}else {
				bw.write("wrong\n");
			}
		}
		
		bw.flush();
	}
	
}
