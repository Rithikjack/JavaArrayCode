import java.util.*;
class Aadhar
{
	static Scanner sc = new Scanner(System.in);
	private String name,loc,dob;
	private long contact,aadharno;
	
	private Aadhar(String name,String loc,String dob,long contact,long aadharno)
	{
		this.name=name;
		this.loc=loc;
		this.dob=dob;
		this.contact=contact;
		this.aadharno=aadharno;
	}
	public boolean doverification()
	{
		System.out.print("Enter the "+name+" contact:");
		long entered_contact =sc.nextLong();
		if (contact==entered_contact)
		{
		System.out.print("OTP recevied: ");
		int sys_otp=(int)(Math.random()*9999+9999);
		System.out.println(sys_otp);
		System.out.print("Enter recevied OTP: ");
		int otp=sc.nextInt();
		if (sys_otp==otp)
			return true;
		}
		return false;	
	}
	
	//getter
	public String getname(){
		return name;
	}
	public String getloc(){
		return loc;
	}
	public String getdob(){
		return dob;
	}
	public long getcontact(){
		return contact;
	}
	public long getaadharno(){
		return aadharno;
	}
	
	//setters
	public void setname(String name){
		if (doverification())
		{
			this.name=name;
			System.out.println("Name upadted");
		}
		else 
			System.out.println("Verification failed");
		
	}
	public void setloc(String loc){
		if (doverification())
		{
			this.loc=loc;
			System.out.println("location upadted");
		}
		else 
			System.out.println("Verification failed");
		
	}
	public void setdob(String dob){
		if (doverification())
		{
			this.dob=dob;
			System.out.println("dob upadted");
		}
		else 
			System.out.println("Verification failed");
		
	}
	public void setcontact(long contact){
		if (doverification())
		{
			this.contact=contact;
			System.out.println("contact upadted");
		}
		else 
			System.out.println("Verification failed");
		
	}
	
	
	// public constructor
	public static Aadhar getaadhar(String name,String loc,String dob,long contact,long aadharno){
		return new Aadhar (name,loc,dob,contact,aadharno);
	}
	
	public void display()
	{ 
	System.out.println("\n------ Aadhar Information ------"); 
	System.out.println("Name : " + name);
	System.out.println("Location : " + loc);
	System.out.println("DOB : " + dob); 
	System.out.println("Contact : " + contact); 
	System.out.println("Aadhar No : " + aadharno); 
	System.out.println("--------------------------------"); } 
	}
	
}
