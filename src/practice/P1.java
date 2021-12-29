package practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class P1 {
	public static void main(String[] args) {
		String s = "SHILPI";
		HashSet<Character> hs = new HashSet();
		for (int i = 0; i < s.length(); i++) {
			hs.add(s.charAt(i));
		}
		System.out.println(hs);
		for (Character ch : hs) {
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
