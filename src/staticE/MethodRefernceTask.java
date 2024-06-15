package staticE;

public class MethodRefernceTask {
	public int findGreator(int[] z) {
		int max=z[0];
		for(int i=0;i<z.length;i++) {
			if(z[i]>max) {
				max=z[i];
			}
		}
		return max;
		
	}
	public static int findGreator1(int[] z) {
		int max=z[0];
		for(int i=0;i<z.length;i++) {
			if(z[i]>max) {
				max=z[i];
			}
		}
		return max;
		
	}
	
	public  String  findSmaller(String a,String b) {
		if(a.length()<b.length()) {
			return a;
		}
		else {
			return b;
		}
	}
}
