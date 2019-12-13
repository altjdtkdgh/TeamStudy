package JangJinYeong.step7;

import java.util.Scanner;
/*
 * 14228 KB
 * 104 ms
 */
public class M2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] crotia = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		String S = sc.nextLine();
		for (int i = 0; i < crotia.length; i++) S = S.replace(crotia[i], Integer.toString(i));
		System.out.println(S.length());
	}

}
