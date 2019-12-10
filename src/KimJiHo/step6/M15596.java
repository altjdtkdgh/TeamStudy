package KimJiHo.step6;

public class M15596 {
	/*
	 * Java: long sum(int[] a); 
	 * (클래스 이름: Test) a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열
	 *  (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000) 리턴값: a에 포함되어 있는 정수 n개의 합
	 *
	 *메모리 : 387536 kb
	 *시간 : 32ms
	 */
	public static void main(String[] args) {
		Test t = new Test();
		
		//아래 Test함수부만 제출..
	}

}

class Test {
    long sum(int[] a) {
        long ans = 0;
        
		for(int i = 0 ; i < a.length ; i++) { 
			ans += a[i];
			
        }
        return ans;
    }
}
