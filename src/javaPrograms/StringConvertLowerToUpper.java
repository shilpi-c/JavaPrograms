package javaPrograms;

import java.util.Iterator;

public class StringConvertLowerToUpper {

	public static void main(String[] args) {
		String s = "india is my country";
		String[] str = s.split(" ");

		for (int i = 0; i < str.length; i++) {
			String s1 = "" + str[i].charAt(0);
//method 1
			System.out.print(s1.toUpperCase() + str[i].substring(1) + " ");

		}

	}
}
