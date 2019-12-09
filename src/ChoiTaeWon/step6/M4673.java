package ChoiTaeWon.step6;
/**
 * 
 * 메모리 : 13792 KB
 * 시간    : 112 ms
 * 
 */
public class M4673 {
	
	//셀프넘버 구분 bool, delfalut=false;
	public static boolean selfNumber[] = new boolean[10000];
	public static void main(String[] args) {
		
		//자릿수 체크 테스트
//		int n = 9992;
//		int dn = 9992;
//		
//		while(n > 0) {
//			System.out.println(dn += n %10);
//			System.out.println(n /= 10);
//		}
		
		
		for(int i=1;i<10000;i++) {
			getD(i);
		}
		
		//생성자 없는 대상 추출
		for(int i=1;i<selfNumber.length;i++) {
			if(!selfNumber[i]) {
				System.out.println(i);
			}
		}
	}

	private static void getD(int i) {
		int n = i; //양의정수
		int dn = i; //d(n) ex) d(11) 11+1+1=13
//		System.out.println(i);
		while(n > 0) {
			dn += n %10;
			n /= 10;
		}
		
		//bool arr 보다 크면 에러
		//selfnumber 가 true 이면 생성자가 존재
		if(dn >= 10000 || selfNumber[dn]) return;
		
		selfNumber[dn] = true;
		getD(dn);
	}
}
