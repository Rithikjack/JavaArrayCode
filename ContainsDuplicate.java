import java.util.*;
class ContainsDuplicate 
{
	public static void main(String[] args) 
	{
		int a[] = {8,4,3,7,1,2,9};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		boolean res=duplicate(a);
		System.out.println(res);
	}
	
	public static boolean duplicate(int [] a)
	{
		for (int i=0;i<a.length-1;i++ )
		{
			if (a[i]==a[i+1])
			{
				return true;
			}
		}
		return false;
	}
}
