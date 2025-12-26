// binary search
import java.util.*;
class BinarySearch 
{
	static Scanner sc = new Scanner (System.in);
	public static void main (String[]args)
	{
		int [] a={10,20,30,40,50,60,70,80};
		System.out.print("\t\t\t Enter the search element: ");
		int element = sc.nextInt();
		boolean res =solve(a,element);
		if (res)
		 System.out.println("Present");
		else
		 System.out.println("not-Present");
		
	}
	public static boolean solve(int a[],int element)
	{
		int l=0,h=a.length-1;
		while (l<=h)
		{
			int m=(l+h)/2;
			if (element == a[m])
			return true;
			else if (element <a[m])
			h=m-1;
			else 
			l=m+1;
				
		}
		return false;
	}
}













/*public static void main(String[] args) 
	{
		int a[] ={26,24,28,30,2,29};
		System.out.println(Arrays.toString(a));
		//int count =0;  // print swaping time
		
		for (int i=0;i<a.length-1;i++)
		{
			
			for (int j=0;j<a.length-1;j++)
			{
				if (a[j]>a[j+1])
				{ 
					//count ++;
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]= temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		//System.out.println(count);

	}*/
