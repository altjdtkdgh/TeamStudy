package JangJinYeong.step9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/*
 * 21068 KB
 * 252 ms
 */
public class M3009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> X = new HashSet<Integer>();
		Set<Integer> Y = new HashSet<Integer>();
		for (int i = 0; i < 3; i++) {
			int[] point = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			if (!X.contains(point[0])) X.add(point[0]); else X.remove(point[0]);
			if (!Y.contains(point[1])) Y.add(point[1]); else Y.remove(point[1]);
		}
		System.out.println(X.iterator().next() + " " + Y.iterator().next());
	}

}
