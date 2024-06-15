package staticE;

public class UsemethodrefernceE {
	public static void main(String[] args) {
		int[] num= {12,23,45,65,12,34,21};
		MethodRefernceTask t=new MethodRefernceTask();
		methodrefernceE s=t::findGreator;
		System.out.println(s.find(num));
		methodrefernceE s1=MethodRefernceTask::findGreator1;
		System.out.println(s1.find(num));
		
	}

}
