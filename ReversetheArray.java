// Code for reverse the array number and character
import java.util.*;
class ReversetheArray 
{
	public static void main(String[] args) 
	{
		//int a[] ={10,20,30,40,50,60};
		char [] b ={'K','I','H','T','I','R'};
		System.out.println(Arrays.toString(b));
		reverse(b);
		System.out.println(Arrays.toString(b));
	}
	public static void reverse(char[]a)
	{
		int l =0,r=a.length-1;
		while(l<r)
		{
			char temp =a[l];
			a[l]=a[r];
			a[r]=temp;
			l++;
			r--;
				
		}
	}
}


/*
public static void reverse(int[]a)
	{
		int l =0,r=a.length-1;
		while(l<r)
		{
			int temp =a[l];
			a[l]=a[r];
			a[r]=temp;
			l++;
			r--;
				
		}
*/




