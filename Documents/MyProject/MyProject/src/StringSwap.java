
public class StringSwap {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "World";
		
		System.out.println("Before Swap A " + a);
		System.out.println("Before Swap B " + b);
		
		a = a+b;//HelloWorld
		b = a.substring(0,a.length()-b.length());
		a = a.substring(b.length());
		
		System.out.println("After Swap A " + a);
		System.out.println("After Swap B " + b);
		
	}

}
