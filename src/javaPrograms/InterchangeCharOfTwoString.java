package javaPrograms;

public class InterchangeCharOfTwoString {

	public static void main(String[] args) {
String s="abc"+"xyz";
for(int i=0;i<s.length()/2;i++)
{
	String s1=""+s.charAt(i)+s.charAt((s.length()/2+i));
	System.out.print(s1);
}

	}

}
