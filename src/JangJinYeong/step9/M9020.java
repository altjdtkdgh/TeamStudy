package JangJinYeong.step9;

import java.util.Scanner;
/*
 * 41360 KB
 * 652 ms
 */
public class M9020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = Integer.parseInt(sc.nextLine());
		String[] rs = new String[cnt];
		for (int i = 0; i < cnt; i++) {
			int n = Integer.parseInt(sc.nextLine());
			for (int j = n/2; j >= 2; j--) {
				if(isPrimeNumber(j) && isPrimeNumber(n-j)) {
					rs[i] = j + " " + (n-j);
					break;
				}
			}
		}
		for (String s : rs) System.out.println(s);
	}
	
	static boolean isPrimeNumber(int n) {
        for(int i = 2; i < n; i++) {
            if(n%i == 0) return false;
        }        
        return true;
	}
	
}
