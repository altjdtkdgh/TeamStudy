package LeeSangHo.step6;

public class M15596 {
	
    long sum(int[] a) {
    	
        long result = 0;
        
        for(int i=0; i<a.length; i++)
        {
        	result = result + a[i];
        }
        
        return result;
    }
}
