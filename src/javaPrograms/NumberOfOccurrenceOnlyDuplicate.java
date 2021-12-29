package javaPrograms;

import java.util.LinkedHashSet;

public class NumberOfOccurrenceOnlyDuplicate {

	public static void main(String[] args) {
		String s = "java";
		// step1: create set collection and all the characters
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();

		for (int i = 0; i < s.length(); i++)// 0<4
		{
			set.add(s.charAt(i));
		}
		System.out.println(set);

		// step2:
		for (Character ch : set) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (ch == s.charAt(i)) {
					count++;
				}

			}
			if (count > 1) {
				System.out.println("Duplicate character is " + ch + " & number of occurrence is " + count);
			}

		}
	}

}
