package practice;

public class FibonacciNumFirst25 {

	public static void main(String[] args) {
		int i = 0;
		int j = 1;
		for (int k = 0; k <= 25; k++) {
			int c = i + j;
			System.out.println(c + " ");
			i = j;
			j = c;

		}
	}

}
