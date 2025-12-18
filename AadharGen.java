import java.util.*;
class AadharGen
{
	static Scanner sc = new Scanner (System.in);
	static Aadhar card[] =new Aadhar [3];
	public static void main(String[] args) 
	{
		
		Aadhar a1 = Aadhar.getaadhar("Rithik","Spain","01/01/2001",123,321);
		Aadhar a2 = Aadhar.getaadhar("JAck","Paris","02/02/2002",456,654);
		Aadhar a3 = Aadhar.getaadhar("Denvar","Germany","03/03/2003",789,987);
		
		card[0]=a1;
		card[1]=a2;
		card[2]=a3;
		
		boolean home =true;
		
		do
		{
			
			System.out.println("\t\t\t Welcome to Aadhar potral");
			System.out.println("1.GetInfo\n2.SetInfo\n3.Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch (choice)
			{
			
			case 1->{
				boolean get_page=true;
				do
				{
					System.out.println("\t\t\tGetting aadhar information*********");
					int ans = displayname();
					switch (ans)
					{
					case 4->{
						get_page =false;
					}
					
					}
				}
				while (get_page);
					System.out.println("<--- Redirecting to home page");
				
			}
			}
		}
		while (home);
			System.out.println("Thank you Visit again.........");
		
	}
	
	public static int displayname(Aadhar card[])
	{
		
	}
	
	
}
/*
  boolean home = true;

	        do {
	            System.out.println("\n\t\t\tAadhar Portal");
	            System.out.println("1. Get Info");
	            System.out.println("2. Set Info");
	            System.out.println("3. Exit");
	            System.out.print("\t\t\tSelect Here: ");
	            int user_choice = my.nextInt();

	            switch (user_choice) {
	                case 1 -> {
	                    boolean get_page = true;
	                    do {
	                        System.out.println("\n\t\t\t*** Get Info ***");
	                        int ans = displayname(card);
	                        if (ans >= 1 && ans <= 4)
	                            Getter(card[ans - 1]);
	                        else if (ans == 4)
	                            get_page = false;
	                        else
	                            System.out.println("Invalid Choice!");
	                    } while (get_page);
	                    System.out.println("\t\t\t<<< Redirecting To Home Page >>>");
	                    Thread.sleep(2000);
	                }

	                case 2 -> {
	                    boolean set_page = true;
	                    do {
	                        System.out.println("\n\t\t\t*** Set Info ***");
	                        int ans = displayname(card);
	                        if (ans >= 1 && ans <= 3)
	                            Setter(card[ans - 1]);
	                        else if (ans == 4)
	                            set_page = false;
	                        else
	                            System.out.println("Invalid Choice!");
	                    } while (set_page);
	                    System.out.println("\t\t\t<<< Redirecting To Home Page >>>");
	                    Thread.sleep(2000);
	                }

	                case 3 -> {
	                    System.out.println("Exiting... Thank you!");
	                    home = false;
	                }

	                default -> System.out.println("Invalid Option!");
	            }

	        } while (home);
	    }

	    // Method to display all Aadhar names
	    public static int displayname(Aadhar[] card) {
	        for (int i = 0; i < card.length; i++) {
	            System.out.println((i + 1) + ". " + card[i].getName());
	        }
	        System.out.println((card.length + 1) + ". Exit");
	        System.out.print("Select Here: ");
	        return my.nextInt();
	    }

	    // ? GETTER — User selects which detail to view
	    public static void Getter(Aadhar card) {
	        boolean view = true;

	        while (view) {
	            System.out.println("\n*** View Info Page for " + card.getName() + " ***");
	            System.out.println("1. View Contact");
	            System.out.println("2. View Location");
	            System.out.println("3. View DOB");
	            System.out.println("4. View Aadhar Number");
	            System.out.println("5. Exit");
	            System.out.print("Select Here: ");

	            int ch = my.nextInt();
	            my.nextLine(); // clear leftover newline

	            switch (ch) {
	                case 1 -> System.out.println("Contact: " + card.getContact());
	                case 2 -> System.out.println("Location: " + card.getLoc());
	                case 3 -> System.out.println("DOB: " + card.getDob());
	                case 4 -> System.out.println("Aadhar No: " + card.getAadharno());
	                case 5 -> {
	                    System.out.println("Returning to previous menu...");
	                    view = false;
	                }
	                default -> System.out.println(" Invalid choice! Try again.");
	            }
	        }
	    }

	    // ? SETTER — User selects which detail to update
	    public static void Setter(Aadhar card) {
	        boolean edit = true;

	        while (edit) {
	            System.out.println("\n*** Update Info Page for " + card.getName() + " ***");
	            System.out.println("1. Update Contact");
	            System.out.println("2. Update Location");
	            System.out.println("3. Update DOB");
	            System.out.println("4. Exit");
	            System.out.print("Select Here: ");

	            int ch = my.nextInt();
	            my.nextLine(); // consume newline

	            switch (ch) {
	                case 1 -> {
	                    System.out.print("Enter new contact: ");
	                    long contact = my.nextLong();
	                    card.setContact(contact);
	                    System.out.println("? Contact updated successfully!");
	                }
	                case 2 -> {
	                    System.out.print("Enter new location: ");
	                    String loc = my.nextLine();
	                    card.setLoc(loc);
	                    System.out.println("? Location updated successfully!");
	                }
	                case 3 -> {
	                    System.out.print("Enter new DOB (dd-mm-yyyy): ");
	                    String dob = my.nextLine();
	                    card.setDob(dob);
	                    System.out.println("? DOB updated successfully!");
	                }
	                case 4 -> {
	                    System.out.println("Returning to previous menu...");
	                    edit = false;
	                }
	                default -> System.out.println(" Invalid choice! Try again.");
	            }
	        }
	    }
	}
*/