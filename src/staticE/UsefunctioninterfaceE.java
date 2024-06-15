package staticE;

public class UsefunctioninterfaceE {
	public static void main(String[] args) {
		functioninterfaceE s=(x,y)->{
			
			if(x>y) {
				System.out.println("greatest number "+ x);
			}
			else {
				System.out.println("greatest number "+ y);
			}
			int a=x%y;
			System.out.println(a);
		};
		s.calcuter(10, 24);
functioninterfaceE s1=(x,y)->{
			
			if(x>y) {
				System.out.println("greatest number "+ x);
			}
			else {
				System.out.println("greatest number "+ y);
			}
			int a=x%y;
			System.out.println(a);
		};
		s1.calcuter(290, 24);
	}

}
