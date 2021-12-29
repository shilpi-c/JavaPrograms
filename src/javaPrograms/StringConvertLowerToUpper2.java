package javaPrograms;

import java.util.Iterator;



public class StringConvertLowerToUpper2 {

	public static void main(String[] args) {
		String s = "india is my country";

		for (int i = 0; i < s.length(); i++) {
			if (i == 0 || i==6 || i==9 || i==12) {
				/*
				 * String s1 = "" + s.charAt(i); System.out.println(s1.toUpperCase());
				 */
				char ch = (char) (s.charAt(i) - 32);
				System.out.print(ch);
			} else {
				System.out.print(s.charAt(i));

			}
		}

	}

}
