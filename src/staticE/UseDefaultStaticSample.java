package staticE;


public class UseDefaultStaticSample {
	public static void main(String[] args) {
		use u=new use();
		u.getname();
		System.out.println(u.getAge());
	}

}

class use implements DefaultStaticSample{
	public static void getname() {
		System.out.println("raghal");
	}
	public  int getAge() {
		return 20;
	}
	
}
