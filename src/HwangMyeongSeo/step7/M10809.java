package HwangMyeongSeo.step7;

import java.util.Scanner;

public class M10809 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next(); 
		for(char c = 'a'; c<='z';c++) System.out.print(input.indexOf(c)+" "); 
	}

}
