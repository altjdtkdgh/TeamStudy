package LeeSangHo.step8;
/*
 * ���� �׸��� ���� ���������� �̷���� ������ �ִ�. 
 * �׸����� ���� �ٿ� ���� �߾��� �� 1���� �����ؼ� �̿��ϴ� �濡 ���ư��鼭 1�� �����ϴ� ��ȣ�� �ּҷ� �ű� �� �ִ�. 
 * ���� N�� �־����� ��, ������ �߾� 1���� N�� ����� �ּ� ������ ���� ������ �� �� �� ���� ���� 
 * ����������(���۰� ���� �����Ͽ�)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ���� ���, 13������ 3��, 58������ 5���� ������.
 */
// 104ms
import java.util.Scanner;

public class M2292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
        int a = sc.nextInt();
        
        int cnt = 1;
        int range = 1;
        int tmp = 1;
        
        while(true) {
            if(range >= a) {
                break;
            }
            tmp = 6*(cnt++);
            range += tmp;
            
        }
        System.out.println(cnt);
	}

}
