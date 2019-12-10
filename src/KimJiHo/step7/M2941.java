package KimJiHo.step7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class M2941 {
//	문제
//	예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.
//
//	크로아티아 알파벳	변경
//	č	c=
//	ć	c-
//	dž	dz=
//	đ	d-
//	lj	lj
//	nj	nj
//	š	s=
//	ž	z=
//	예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
//
//	dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.
//
//	입력
//	첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
//
//	단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.
//
//	출력
//	입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
	
	/* 메모리 : 12900 kb
	 * 시간 : 76ms
	 * */
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String sWord = br.readLine();
		int result = 0;
		
		for(int i = 0 ; i < sWord.length() ; i++) {
			char s = sWord.charAt(i);
			
			if(s == 'c' && i != sWord.length()-1) {//마지막인덱스가 아니면
				if(sWord.charAt(i+1)=='=') {
					i++;
				}else if(sWord.charAt(i+1)=='-') {
					i++;
				}
			}else if(s == 'd'&& i != sWord.length()-1) {
				if(sWord.charAt(i+1)=='-') {
					i++;
				}else if(sWord.charAt(i+1)=='z') {
					if(i+1 != sWord.length()-1) {
						if(sWord.charAt(i+2) == '=') {
							i +=2;
						}
					}
				}
			}else if(s == 'l'&& i != sWord.length()-1) {
				if(sWord.charAt(i+1)=='j') {
					i++;
				}
			}else if(s == 'n'&& i != sWord.length()-1) {
				if(sWord.charAt(i+1)=='j') {
					i++;
				}
			}else if(s == 's'&& i != sWord.length()-1) {
				if(sWord.charAt(i+1)=='=') {
					i++;
				}
			}else if(s == 'z'&& i != sWord.length()-1) {
				if(sWord.charAt(i+1)=='=') {
					i++;
				}
			}
			
			result++;
			
		}//for end
		
		System.out.println(result);
	}
	

}
