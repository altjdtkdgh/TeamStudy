package KimJiHo.step9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class M3009 {
	/*
	 * ���� 
	 * �� ���� �־����� ��, �࿡ ������ ���簢���� ����� ���ؼ� �ʿ��� �� ��° ���� ã�� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * 
	 * �Է� 
	 * �� ���� ��ǥ�� �� �ٿ� �ϳ��� �־�����. ��ǥ�� 1���� ũ�ų� ����, 1000���� �۰ų� ���� �����̴�.
	 * 
	 * ��� 
	 * ���簢���� �� ��° ���� ��ǥ�� ����Ѵ�.
	 *
	 *�޸�: 12908kb
	 *�ð� : 72ms
	 * 
	 */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String a = br.readLine();
		String b = br.readLine();
		String c = br.readLine();
		
		String x = a.split(" ")[0].equals(b.split(" ")[0]) ? 
				c.split(" ")[0] : (a.split(" ")[0].equals(c.split(" ")[0]) ? b.split(" ")[0] : a.split(" ")[0]);
				
		String y = a.split(" ")[1].equals(b.split(" ")[1]) ? 
				c.split(" ")[1] : (a.split(" ")[1].equals(c.split(" ")[1]) ? b.split(" ")[1] : a.split(" ")[1]);

		bw.write(x + " " + y);
		bw.flush();
	
	}
	

}
