package staticE;

public class UseStuent {
	public static void main(String[] args) {
		Student.college="hinduston";
		Student.college="hero";
		System.out.println(Student.college);
		Student s=new Student();
		s.name="hero";
		s.age=25;
		s.college="SRM";
		System.out.println(s);
	}

}
