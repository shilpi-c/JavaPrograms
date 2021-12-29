package javaPrograms;

import java.util.LinkedHashSet;

public class WordOccurrenceWIthUniqueWords {

	public static void main(String[] args) {
		String s = "welcome to tyss to welcome";
		String[] str = s.split(" ");
		// step1: create set collection and all the characters
		LinkedHashSet<String> set = new LinkedHashSet<String>();

		for (int i = 0; i < str.length; i++)// 0<4
		{
			set.add(str[i]);
		}

		// step2:
		for (String word : set) {
			int count = 0;
			for (int i = 0; i < str.length; i++) {
				if (word.equals(str[i])) {
					count++
					;
				}
			}
			if (count == 1) {
				System.out.println(word + " ");

			}

		}
	}

}
