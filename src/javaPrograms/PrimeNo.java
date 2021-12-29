package javaPrograms;

public class PrimeNo {

	public static void main(String[] args) {
		int num = 10;
		int i;
		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("the given no " + num + "  is not prime number");
				break;
			}
		}
		if (i == num) {
			System.out.println("the given no " + num + "  is prime number");

		}
	}

}
