package arrayprograms;

import java.util.LinkedHashSet;

public class PrintDuplicateArrayElements {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,7,8,8,4};
		// step1: create set collection and all the characters
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

		for (int i = 0; i < a.length; i++)// 0<4
		{
			set.add(a[i]);
		}
		System.out.println(set);

		// step2:
		for (Integer n : set) {
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				if (n == a[i]) {
					count++;
				}

			}
			if (count > 1) {
				System.out.println("Duplicate character is " + n + " & number of occurrence is " + count);
			}

		}
	}

}
