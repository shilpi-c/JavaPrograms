package javaPrograms;

import java.util.LinkedHashSet;

public class NumberOfOccurrenceRemoveDuplicates {

	public static void main(String[] args) {
		String s = "india";
		// step1: create set collection and all the characters
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();

		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) {
			System.out.print(ch);

		}

	}

}
