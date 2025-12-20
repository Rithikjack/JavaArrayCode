import java.util.*;
class ASS14 
{   
	public static void main(String[] args) 
	{   
		int a[]={'A','b','c','B'};
		System.out.println("Given Array: "+Arrays.toString(a));
		
		int rev[]=rev(a);
		System.out.println("Reverse Array: "+Arrays.toString(rev));
		
		for(int i=0;i<a.length;i++)
		{
		   a[i]=add(a[i]);
		}
		System.out.println("Add Element: "+Arrays.toString(a));
		
		for(int i=0;i<a.length;i++)
		{
		   a[i]=reverse(a[i]);
		}
		System.out.println("Reverse Element: "+Arrays.toString(a));
	
	}
		
		public static int[] rev(int a[])
		{
		 int n=a.length,l=0,r=n-1;
		while(l<r)
		{
			int temp=a[l];
			a[l]=a[r];
			a[r]=temp;
			
				l++;
			
				r--;
		}
		return a;
		}
		
		public static int add(int num)
		{ 
			
			int sum=0;
			while(num>0)
			{
				
				int digit=num%10;
				sum+=digit;
				num/=10;
				
			}
			return sum;
			
	    }
		
		public static int reverse(int num)
		{ 
			int rev=0;
			
			while(num>0)
			{
				
				int digit=num%10;
				rev = rev * 10 + digit;
				num/=10;
				
			}
			return rev;
			
	    }
}