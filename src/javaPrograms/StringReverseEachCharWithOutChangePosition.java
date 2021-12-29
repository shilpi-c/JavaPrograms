package javaPrograms;

public class StringReverseEachCharWithOutChangePosition {

	public static void main(String[] args) {
		String s = "welcome to tyss";
		String[] str = s.split(" ");
		
		for (int i = 0; i < str.length; i++) {
			String string = str[i];
			String rev = "";
			
			for (int j = string.length() - 1; j >= 0; j--) {
				rev = rev + string.charAt(j);
			}
			System.out.print(rev + " ");
		}
	}

}
