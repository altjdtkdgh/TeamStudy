package JangJinYeong.step6;
/*
 * 387064 KB
 * 24 ms
 */
public class M15596 {
    long sum(int[] a) {
        long ans = 0;
		for (int i = 0; i < a.length; i++) {
			ans += a[i];
		}
        return ans;
    }
}