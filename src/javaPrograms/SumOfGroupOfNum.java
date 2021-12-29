package javaPrograms;

public class SumOfGroupOfNum {

	public static void main(String[] args) {

		String s="15a10b23";
		int sum=0;//to add  number of string
		int tSum=0;//to add all grouped number
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int n=s.charAt(i)-48;
				sum=sum*10+n;
			}
			else
			{
				tSum=tSum+sum;
				sum=0;
			}
		}
		tSum=tSum+sum;
		System.out.println("total sum :"+tSum);
	}
	

}
