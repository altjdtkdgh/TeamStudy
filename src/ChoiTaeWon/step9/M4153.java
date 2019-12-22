package ChoiTaeWon.step9;

import java.util.Arrays;
import java.util.Scanner;

public class M4153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = "";

		while (true) {
			int a[] = new int[3];
			a[0] = sc.nextInt();
			a[1] = sc.nextInt();
			a[2] = sc.nextInt();

			if (a[0] == 0 && a[1] == 0 && a[2] == 0) {
				break;
			}

			for (int i = 0; i < 3; i++) {
				if (a[i] < 0 || a[i] > 30000) {
					break;
				} else {
					Arrays.sort(a);

					if ((a[0] * a[0]) + (a[1] * a[1]) == (a[2] * a[2]) && (a[0] * a[1] * a[2]) != 0) {
						result = "right";
						continue;

					} else {
						result = "wrong";
						continue;
					}
				}
			}
			System.out.println(result);
		}
	}
}
