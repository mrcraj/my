package staticE;

public interface DefaultStaticSample {
	public static void  getname() {
		System.out.println("David");
	}
	public default int getAge() {
		return 21;
	}

}
