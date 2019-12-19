package JangJinYeong.step9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/*
 * 20824 KB
 * 252 ms
 */
public class M4153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] sides = new int[3];
		List<String> rs = new ArrayList<String>();
		do {
			sides = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			if (sides[0] == 0 && sides[1] == 0 && sides[2] == 0) break;
			if (Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2)
					|| Math.pow(sides[0], 2) + Math.pow(sides[2], 2) == Math.pow(sides[1], 2)
					|| Math.pow(sides[1], 2) + Math.pow(sides[2], 2) == Math.pow(sides[0], 2)) rs.add("right");
			else rs.add("wrong");
		} while (true);
		for (String s : rs) System.out.println(s);
	}

}
