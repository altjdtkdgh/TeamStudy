package LeeSangHo.step8;

import java.util.Scanner;
/*
 * ����̴� ���� �������忡�� ������ ����ϰ� �ִ�. ����̴� ���� �������Կ� ������ ��Ȯ�ϰ� Nų�α׷��� ����ؾ� �Ѵ�. �������忡�� ����� ������ ������ ����� �ִ�. ������ 3ų�α׷� ������ 5ų�α׷� ������ �ִ�.

����̴� ������ ������, �ִ��� ���� ������ ��� ������ �Ѵ�. ���� ���, 18ų�α׷� ������ ����ؾ� �� ��, 3ų�α׷� ���� 6���� �������� ������, 5ų�α׷� 3���� 3ų�α׷� 1���� ����ϸ�, �� ���� ������ ������ ����� �� �ִ�.

����̰� ������ ��Ȯ�ϰ� Nų�α׷� ����ؾ� �� ��, ���� �� ���� �������� �Ǵ��� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

100ms
 */
public class M2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         
        int count = n / 5;
         
        switch (n % 5) 
        {
	        case 0:
	            System.out.println(count);
	            break;
	        case 1:
	        case 3:
	            System.out.println(count + 1);
	            break;
	        case 2:
	            if (count < 2) {
	                System.out.println(-1);
	            } else {
	                System.out.println(count + 2);
	            }
	            break;
	        case 4:
	            if (count < 1) {
	                System.out.println(-1);
	            } else {
	                System.out.println(count + 2);
	            }
	        break;
        }
	}

}
