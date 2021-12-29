package javaPrograms;

public class SwapTwoNumWithOutVariable {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("value of a is :" + a);
		System.out.println("value of b is :" + b);

	}

}
