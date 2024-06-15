package optionalclasses;

import java.util.Optional;

public class optionalClass {
	public static void main(String[] args) {
		String a=null;
		String b="hero";
		Optional<String>c= Optional.ofNullable(a);
		Optional<String>c1= Optional.ofNullable(b);
		System.out.println("1= "+Optional.of(b));
		System.out.println("1= "+c);
		System.out.println("1= "+c1);
		System.out.println("1= "+c.isPresent());
		System.out.println("1= "+c.isEmpty());
		System.out.println("1= "+c.orElse(b));
		System.out.println(c.hashCode());
		System.out.println(c1.toString());		
		try {
		System.out.println(c.orElseThrow(()->new NullPointerException()));
		}
		catch(NullPointerException e) {  
			e.printStackTrace();
		}
		System.out.println(c.orElseThrow());
		System.out.println(c.get());
		
		
	}

}
