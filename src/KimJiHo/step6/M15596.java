package KimJiHo.step6;

public class M15596 {
	/*
	 * Java: long sum(int[] a); 
	 * (Ŭ���� �̸�: Test) a: ���� ���ؾ� �ϴ� ���� n���� ����Ǿ� �ִ� �迭
	 *  (0 �� a[i] �� 1,000,000, 1 �� n �� 3,000,000) ���ϰ�: a�� ���ԵǾ� �ִ� ���� n���� ��
	 *
	 *�޸� : 387536 kb
	 *�ð� : 32ms
	 */
	public static void main(String[] args) {
		Test t = new Test();
		
		//�Ʒ� Test�Լ��θ� ����..
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
