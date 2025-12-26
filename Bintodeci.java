import java.util.Scanner;
class Bintodeci
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the number: ");
		int number =sc.nextInt();
		int res = bintodeci (number);
		System.out.println(res);
	}
	public static int bintodeci (int num)
	{
		int sum = 0;
		int x= 1;
		while (num>0)
		{
			sum = sum +(num%10)*x;
			num = num/10;
			x=x*2;	
		}
		return sum;
	}
}
/*
import java.util.*;
public class Main
{ 
     
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the hexadecimal: ");
        String hexa = sc.nextLine().toUpperCase();
        
        String result = hexatobinary(hexa);
        System.out.println(result);
    }
    
    public static String hexatobinary(String hexa)
    {
       String bin = "";
        for (int i = 0; i < hexa.length(); i++) {
            char c = hexa.charAt(i);
            
            
            switch(c) {
                case '0': bin+= "0000"; break;
                case '1': bin+= "0001"; break;
                case '2': bin += "0010"; break;
                case '3': bin += "0011"; break;
                case '4': bin += "0100"; break;
                case '5': bin += "0101"; break;
                case '6': bin += "0110"; break;
                case '7': bin += "0111"; break;
                case '8': bin += "1000"; break;
                case '9': bin += "1001"; break;
                case 'A': bin += "1010"; break;
                case 'B': bin += "1011"; break;
                case 'C': bin += "1100"; break;
                case 'D': bin += "1101"; break;
                case 'E': bin += "1110"; break;
                case 'F': bin += "1111"; break;
                default:
                    return "Invalid hexadecimal digit!";
            }
        }
        return bin;
    }
}

*/