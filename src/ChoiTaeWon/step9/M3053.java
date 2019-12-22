package ChoiTaeWon.step9;

import java.text.DecimalFormat;
import java.util.Scanner;

public class M3053 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000000");
        int r = sc.nextInt(); // r = 반지름;

        double pi = Math.PI;
        System.out.println(df.format(r * r * pi)); //유클리드 원의 형태
        System.out.println(df.format(r * r * 2));//택시 기하학의 원의 의형태
	}
}
