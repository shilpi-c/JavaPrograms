package javaPrograms;

import java.util.LinkedHashSet;

public class WordOccurrence {

	public static void main(String[] args) {
		String s = "welcome to tyss";
		String[] str = s.split(" ");
		// step1: create set collection and store all the characters
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
					count++;
				}

			}
			System.out.println(word + " " + count);
		}
	}

}
