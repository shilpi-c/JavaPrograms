package javaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		String string = "java";
		for (int i = string.length() - 1; i >= 0; i--) {
			System.out.print(string.charAt(i));
		}
	}

}
