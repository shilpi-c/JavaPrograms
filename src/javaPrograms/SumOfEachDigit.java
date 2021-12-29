package javaPrograms;

public class SumOfEachDigit {

	public static void main(String[] args) {
		
		int sum=0;
		for (int num = 344; num > 0; num =num/ 10) 
		{
         int rem=num%10;
         sum=rem+sum;
		}
		System.out.println("sum of digits is "+sum);
	}

}
