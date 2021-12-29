
package javaPrograms;

import java.util.LinkedHashSet;

public class NumberOfOccurrence {

	public static void main(String[] args) {
		String s = "india";
		//step1: create set collection and store all the characters
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();

		for (int i = 0; i < s.length(); i++)// 0<4
		{
			set.add(s.charAt(i));
		} 
		System.out.println(set);


		//step 2 compare each char of the set with all the char of given string
		for (Character ch : set) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (ch == s.charAt(i)) {
					count++;
				}

			}
			System.out.println(ch + " " + count);
		}
	}

}	
