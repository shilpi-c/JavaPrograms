package javaPrograms;

public class ReverseStringWordPosition {
	public static void main(String[] args) {
		String str = "Welcome to tyss company";
		String[] strArray = str.split(" ");
		String rev = "";

		for (int i = strArray.length - 1; i >= 0; i--) {
			rev = rev + strArray[i] + " ";
		}
		System.out.println(rev);
	}

}
//WAJP swap only first and last word
// output=company to tyss welcome