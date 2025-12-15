// Adding all eelemnt in the array. Addition there are some codes adding by index and elements(odd and even).
import java.util.*;
class AddarrayElement 
{
	
	public static void main(String[] args) 
	{
		int []a={10,20,50,20,10,33,55};
		System.out.println(Arrays.toString(a));
		int res = solve(a);
		System.out.println("Sum of arrary:"+res);
	}
	
	
	public static int solve (int [] a)
	{
		int sum = 0;
		for (int i = 0;i<a.length;i++) //add only even element
		{
		if (i%2==0)
		{
			sum=sum+a[i];
		}
		
		}
		return sum;
	}	
	
}

/*
public static int solve (int [] a)
	{
		int sum =0;
		for (int i=0;i<a.length;i++)
		{
			sum=sum+a[i]; /// add arrary
		}
		return sum;				
	}

	
	public static int solve (int [] a)
	{
		int sum = 0;
		for (int i = 0;i<a.length;i++) //add only even element
		{
		if (a[i]%2==0)
		{
			sum=sum+a[i];
		}
		
		}
		return sum;
	}
	
		public static int solve (int [] a)
	{
		int sum = 0;
		for (int i = 0;i<a.length;i++) //add only odd element
		{
		if (a[i]%2!=0)
		{
			sum=sum+a[i];
		}
		
		}
		return sum;
	}	
	
	
	
	public static int solve (int [] a)
	{
		int sum = 0;
		for (int i = 0;i<a.length;i++) //add only odd index element
		{
		if (i%2!=0)
		{
			sum=sum+a[i];
		}
		
		}
		return sum;
	}	
	

	*/
