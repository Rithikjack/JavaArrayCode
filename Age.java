//simple program for if elseif and else
import java.util.Scanner;
class  Age
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		System.out.print("ENter your age: ");
		int age = sc.nextInt();
		
		if (age < 0)
		{
			System.out.println("Invalid");
		}
		else if (age>0 && age <=10)
		{
			System.out.println("baby");
		}
		else if (age>=11 && age <=15)
		{
			System.out.println("Child");
		}
		else if (age>=16 && age <=20)
		{
			System.out.println("Teen");
		}
		else if (age>=21 && age<=35)
		{
			System.out.println("Adult");
		}
		else 
			System.out.println("Old");
	}
}

