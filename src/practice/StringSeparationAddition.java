package practice;

public class StringSeparationAddition {

	public static void main(String[] args) {
		String s = "av@2v57m9";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {

				int n = s.charAt(i) - 48;
				sum += n;
			}
		}
		System.out.println("sum of digits is :" +sum);
	}

}
