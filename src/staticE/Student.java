package staticE;

public class Student {
	String name;
	int age;
	static String college;
	static {
		System.out.println("satic used");
	}
	
	public String toString() {
		return "Student [name=" + name + ", age=" + age + " ,college= "+college +"]";
	}
	

}
