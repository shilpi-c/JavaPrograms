package practice;

public class ReverseStringWord {

	public static void main(String[] args) {
		String s = "Welcome to tyss company";
		String[] strArray = s.split(" ");
		String rev = "";
		for (int i = strArray.length - 1; i >= 0; i--) {
			rev = rev + strArray[i] + " ";
		}
		System.out.println("reversed string words are :" + rev);

	}

}
