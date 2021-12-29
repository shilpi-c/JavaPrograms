package javaPrograms;

public class FibonacciNum {

	public static void main(String[] args) {
		int i = 0;
		int j = 1;
		//System.out.println(i + " ");
		//System.out.println(j + " ");
		for (int k = 0; k <= 3; k++) {
			int c = i + j;
			System.out.println(c + " ");
			i = j;
			j = c;

		}
	}

}
