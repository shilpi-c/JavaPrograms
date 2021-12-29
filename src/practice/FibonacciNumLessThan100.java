package practice;

public class FibonacciNumLessThan100 {

	public static void main(String[] args) {
		int i = 0;
		int j = 1;
		for (;;) {
			int c = i + j;
			if (c>25) {
				break;
			}
			System.out.println(c + " ");
			i = j;
			j = c;

		}
	}

}
