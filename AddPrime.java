// add only prime numbers in the array
import java.util.*;
class AddPrime
{
	public static void main(String[] args) 
	{
		int a[] ={4,5,6,7,8,9,10,11};
		int res = addprime(a);
		System.out.println(Arrays.toString(a));
		System.out.println("Sum of prime:"+res);
	}
	
	public static boolean isPrime (int number)
	{
		if (number ==0 || number ==1)
			return false;
		
		for (int i = 2;i<number;i++)
		{
			if (number %i==0)
				return false;				
		}
		return true;
	}
	
	public static int addprime (int [] a)
	{
		int sum=0;
		for (int i =0;i<a.length;i++)
		{
			if (isPrime(a[i]))
			{
				sum=sum+a[i];
			}
		}
		return sum;
	}
}

