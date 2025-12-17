import java.util.*;
class A2 
{
	static Scanner sc = new Scanner(System.in);
	static int sum =0;
	public static void main(String[] args) 
	{
		System.out.print("\t\t\t Enter the size: ");
		int size = sc.nextInt();
		
		int []a = new int[size];
		
		for (int i = 0;i< a.length;i++)
		{
			System.out.print("\t\t Enter the element a["+i+"]: "); //add of Arrary
			a[i] = sc.nextInt();
			
			sum=sum+a[i];	
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(sum);
	}
}
