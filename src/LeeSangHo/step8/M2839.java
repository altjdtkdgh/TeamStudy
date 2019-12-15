package LeeSangHo.step8;

import java.util.Scanner;
/*
 * 상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다. 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.

상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.

상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.

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
