package LeeSangHo.step9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 
����
  ���� ����Ʈ�ε��� �� ������ ���̰� 3, 4, 5�� �ﰢ���� ���� �ﰢ���ΰ��� �˾Ƴ´�. �־��� ������ ���̷� �ﰢ���� �������� �ƴ��� �����Ͻÿ�.

�Է�
 �Է��� �������� �׽�Ʈ���̽��� �־����� �������ٿ��� 0 0 0�� �Էµȴ�. �� �׽�Ʈ���̽��� ��� 30,000���� ���� ���� ������ �־�����, �� �Է��� ���� ���̸� �ǹ��Ѵ�. 

���
 �� �Է¿� ���� ���� �ﰢ���� �´ٸ� "right", �ƴ϶�� "wrong"�� ����Ѵ�.

 */
//112 ms
public class M4153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<String>();
		
		while(true) 
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if (a==0 && b==0 && c==0) 
			{
				break;
			}
			
			int[] arr= {a,b,c};
		    Arrays.sort(arr);
		    
		    if(Math.pow(arr[2], 2)==Math.pow(arr[0], 2)+Math.pow(arr[1], 2))
		    {
		    	list.add("right");
			}
		    else 
		    {
		    	list.add("wrong");
		    }
		}
		
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println(list.get(i));
		}
	}

}
