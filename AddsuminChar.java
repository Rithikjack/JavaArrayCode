import java.util.*;
class AddsuminChar
{
	public static void main(String[] args) 
	{
		char [] a={'R','5','I','6','T','8','H','9','I','K','5'};
		System.out.println(Arrays.toString(a));
		int res= solve(a);
		System.out.println(res);	
	}	
	public static int solve(char []a)
	{
		int sum = 0;
		for (int i=0;i<a.length;i++)
		{
			if (a[i] >='0'&& a[i] <='9')
			{
				sum+=a[i]-48;
			}
				
		}
		return sum;
	}
}
