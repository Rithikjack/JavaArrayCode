// Arm strong number 153(1^3 + 5^3 +3^3 = 153)
import java.util.Scanner;
class  Armstrong
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		boolean res = armstrong (number);
		
		if (res)
			System.out.println("Arm Strong Number");
		else
			System.out.println("Not Arm Strong Number");
	}
		
	public static boolean armstrong (int number) //153
	{
		int count = 0;
		          //153  //153>0
		for (int i=number;i>0 ;count++)
			i=i/10; 
		
		int sum = 0;
		for (int i =number;i>0;i/=10 )
		{
			sum = sum+power(i%10,count);//method call power(int x,int n)
		}
		return sum == number;
	}
	
	public static int power (int x,int n)
	{
		int ans =1;
		for (int i =1;i<=n;i++)
		{
			ans = ans*x;
		}
		return ans;
	}
}

