package ChoiTaeWon.step9;

import java.util.Scanner;

/**
 * 
 * 메모리 : 14276 KB
 * 시간   : 104 ms
 */
public class M3009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int x[] = new int[1001];
        int y[] = new int[1001];
        for(int i=0; i<3; i++) {
            x[sc.nextInt()]++;
            y[sc.nextInt()]++;
        }
        
        for(int i=1; i<1001; i++) {
            if(x[i] % 2 == 1) System.out.print(i + " ");
        }
        
        for(int i=1; i<1001; i++) {
            if(y[i] % 2 == 1) System.out.print(i);
        }
	}

}
