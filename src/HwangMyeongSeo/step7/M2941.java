package HwangMyeongSeo.step7;

import java.util.Scanner;

public class M2941 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		
		word=word.replace("c=", "0");
		word=word.replace("c-", "0");
		word=word.replace("dz=","0");
		word=word.replace("d-", "0");
		word=word.replace("lj", "0");
		word=word.replace("nj", "0");
		word=word.replace("s=", "0");
		word=word.replace("z=", "0");
		
		System.out.println(word.length());
		
		

	}

}
