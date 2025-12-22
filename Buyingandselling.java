// Leetcode problem 121
class Buyingandselling 
{
	public static void main(String[] args) 
	{
		int a[] ={7,1,5,3,6,4};
		System.out.println(solve(a));
	}
	public static int solve (int a[])
	{
		int max= 0;
		int cp=a[0];
		
		for (int i=1;i<a.length;i++)
		{
			int sp=a[i];
			int profit = sp-cp;
			max= Math.max(profit,max);
			if (sp<cp)
				cp=sp;
		}
		return max;
		
	}
}

