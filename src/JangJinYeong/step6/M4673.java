package JangJinYeong.step6;

import java.util.ArrayList;
import java.util.List;
/*
 * 14976 KB
 * 212 ms
 */
public class M4673 {
	public static void main(String[] args) {
		int l = 10000;
		List<String> list = new ArrayList<>();
		for (int i = 1; i <= l; i++) list.add(Integer.toString(i));
		for (int i = 1; i <= l; i++) {
			int sum = 0, n = 0;
			sum = n = i;
			do {
				sum += n%10;
				n /= 10;
			} while (n > 0);
			list.remove(Integer.toString(sum));
		}
		for(String s : list) System.out.println(s);
	}

}
