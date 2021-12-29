package javaPrograms;

public class StringReverseCharOneByOne {

	public static void main(String[] args) {
		String str = "india";
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			temp += str.charAt(i);
			System.out.println(temp);
		}
	}

}
//string s="welcome to tyss"
//output="Welcome To Tyss"