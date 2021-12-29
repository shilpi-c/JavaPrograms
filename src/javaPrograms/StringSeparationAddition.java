package javaPrograms;

public class StringSeparationAddition {

	public static void main(String[] args) {
		String s = "1@ac4$34";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
				int n = s.charAt(i) - 48;
				sum += n;
			}
		}
		System.out.println(sum);
	}

}
