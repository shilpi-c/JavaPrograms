package javaPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {

		int n = 145;
		int temp = n;
		int rev = 0;

		while (n > 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}
		if (rev == temp) {
			System.out.println(temp + " is palindrome number");

		} else {
			System.out.println(temp + " is not palindrome number");

		}
	}

}
