package LeeSangHo.step8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
 * 
 * ��� �ݻ�ȸ�� �����ϴ� ���� �����ϴ� ����� �̹� ��ȸ�� �γ�ȸ���� �ǰ� �;� �� ���� ������� �ҷ� ��� �ݻ�ȸ�� �����Ϸ��� �Ѵ�.

�� ����Ʈ�� ���ָ� �Ϸ��� ������ �ִµ�, ��a���� bȣ�� ����� �ڽ��� �Ʒ�(a-1)���� 1ȣ���� bȣ���� ������� ���� �ո�ŭ ������� ������ ��ƾ� �Ѵ١� �� ��� ������ �� ��Ű�� ���;� �Ѵ�.

����Ʈ�� ����ִ� ���� ���� ��� ���ֹε��� �� ��� ������ ��Ű�� �Դٰ� �������� ��, �־����� ���� ���� k�� n�� ���� k���� nȣ���� �� ���� ��� �ִ��� ����϶�. ��, ����Ʈ���� 0������ �ְ� �������� 1ȣ���� ������, 0���� iȣ���� i���� ���.

76ms
 */
public class M2775 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      
        try 
        {
        	int T = Integer.parseInt(bf.readLine());
        	  
        	StringBuilder builder = new StringBuilder();
            int[][] a = new int[15][15];
            
            for(int i=0 ; i<15 ; i++)
                a[0][i] = i;
            
            for(int i=1 ; i<15 ; i++)
                for(int j=1 ; j<15 ; j++)
                    a[i][j] += a[i][j-1] + a[i-1][j];
            
            for(int i=0 ; i<T ; i++){
                int k = Integer.parseInt(bf.readLine());
                int n = Integer.parseInt(bf.readLine());
                
                builder.append(a[k][n]).append("\n");
            }
            
            System.out.println(builder);
		} catch (Exception e) {
			// TODO: handle exception
		}
        
	}

}
