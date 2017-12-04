
public class IntegerSwap {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		System.out.println("Before Swap A " + a);
		System.out.println("Before Swap B " + b);
		
		a = a+b;//15
		b = a-b;//15-10= 5
		a =	a-b; // 15-5=10
		
		System.out.println("After Swap A " + a);
		System.out.println("After Swap B " + b);
		
		//adding with 3rd var
		
		int temp;
		int num1 = 4;
		int num2 = 10;
		System.out.println("Before Swap num1 " + num1);
		System.out.println("Before Swap num2 " + num2);
		
		temp =num1;
		num1 =num2;
		num2 = temp;
		
		System.out.println("After Swap num1 " + num1);
		System.out.println("After Swap num2 " + num2);
		

	}

}
